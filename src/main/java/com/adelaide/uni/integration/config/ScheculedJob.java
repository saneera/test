package com.adelaide.uni.integration.config;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.adelaide.uni.integration.api.service.SpeakerServiceImpl;
import com.adelaide.uni.integration.api.service.SpeechServiceImpl;
import com.adelaide.uni.integration.model.Speaches;
import com.adelaide.uni.integration.model.Speaker;
import com.adelaide.uni.integration.model.SpeakerTalksDto;
import com.adelaide.uni.integration.model.TalksDto;
import com.adelaide.uni.student.system.ws.SearchStudentEnrollmentHistoryRequest;
import com.adelaide.uni.student.system.ws.SearchStudentEnrollmentHistoryResponse;
import com.adelaide.uni.student.system.ws.SearchStudentRequest;
import com.adelaide.uni.student.system.ws.SearchStudentResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ScheculedJob {

	@Autowired
	private AppConfig appConfig;
	
	@Autowired
	private SpeakerServiceImpl speakerService;
	
	@Autowired
	private SpeechServiceImpl speechService;
	
	
	/* This method dowonload data from ned API and student system webservice on each night 
	 * and stored against speaker and speech table
	*/	
	@Scheduled(cron="* * 0 * * ?") //run every day mid night
    public void downloadData() {
       
	    
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("Authorization", "Authorizer");
		headers.add("Content-Type", "application/json");
		HttpEntity<Void> request = new HttpEntity<Void>(null, headers);
		
        RestTemplate restTemplate =  new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        
        ResponseEntity<String> response = restTemplate.exchange(appConfig.getNedApiUrl(), HttpMethod.GET, request, String.class);
        
        if(response != null && response.getBody() != null) {
        	 try {
				
        		 List<SpeakerTalksDto> spearkerList = new ObjectMapper().readValue(response.getBody(), new com.fasterxml.jackson.core.type.TypeReference<List<SpeakerTalksDto>> (){});
			
        		 if(spearkerList != null && spearkerList.size()>0) {
        			 
        			 spearkerList = findSpeachesUpdatedLastDay(spearkerList);
        			 //call search student method on student student system web service to get the student details with firstname last name surname
        			 findStudentMatchtoTheSpeakersFromNed(spearkerList);        
        		 }
        		 
        	 
        	 } catch (IOException e) {
        		 log.error("Error when downloading the data");
			}
        }
        
    }

	/**
	 * this method find the student matches in student system webservice
	 * using first name, last name and get the student enrollments history and update 
	 * speakers and speeches with service calls data
	 * @param spearkerList the List<SpeakerTalksDto> 
	 */
	private void findStudentMatchtoTheSpeakersFromNed(List<SpeakerTalksDto> spearkerList) {
		
	
		for (SpeakerTalksDto speakerTalksDto : spearkerList) {
			
			Speaker  speaker = new Speaker();
			
			SearchStudentRequest searchRequest = new SearchStudentRequest();
			String [] names = speakerTalksDto.getFullName().split(" ");
			searchRequest.setFirstName(names[0]);
			searchRequest.setLastName(names[1]);
			
			 // call searchStudent method on student system webservice with searchStudentRequest request 
			//public com.adelaide.uni.student.system.ws.SearchStudentResponse searchStudent(com.adelaide.uni.student.system.ws.SearchStudentRequest searchStudentRequest) throws java.rmi.RemoteException;
			
			//dummy response
			SearchStudentResponse response = new SearchStudentResponse();
			response.setStudentId("10001");
			response.setFirstName("Saneera");
			response.setLastName("Yapa");
			response.setPreferredFirstName("Saneera");
			
			//call searchStudentEnrollmentHistory method on  student system webservice with SearchStudentEnrollmentHistoryRequest request
			SearchStudentEnrollmentHistoryRequest searchStudentEnrollmentHistoryRequest = new SearchStudentEnrollmentHistoryRequest();
			searchStudentEnrollmentHistoryRequest.setStudentId(response.getStudentId());
			//public com.adelaide.uni.student.system.ws.SearchStudentEnrollmentHistoryResponse searchStudentEnrollmentHistory(com.adelaide.uni.student.system.ws.SearchStudentEnrollmentHistoryRequest searchStudentEnrollmentHistoryRequest) throws java.rmi.RemoteException;
			//dummy response
			SearchStudentEnrollmentHistoryResponse searchStudentEnrollmentHistoryResponse = new SearchStudentEnrollmentHistoryResponse();
			
			
			speaker.setSpeakerName(speakerTalksDto.getFullName());
			speaker.setSpeakerNedId(speakerTalksDto.getNedId());
			speaker.setCourse(searchStudentEnrollmentHistoryResponse.getDegree());
			speaker.setYearGraduated(searchStudentEnrollmentHistoryResponse.getDateGraduated());
			
			speakerService.save(speaker);
			
			if(speakerTalksDto.getTalk() != null) {
				for (TalksDto talk : speakerTalksDto.getTalk()) {
					Speaches  speech = new Speaches();
					speech.setTalkId(talk.getTalkId());
					speech.setLinkToNed(speech.getLinkToNed());
					speech.setSpeaker(speaker);
					speechService.save(speech);
				}
			}
			
		}		
	
	}

	/**
	 * this method filter the ned api data from date
	 * @param spearkerList the List<SpeakerTalksDto> 
	 */
	private List<SpeakerTalksDto> findSpeachesUpdatedLastDay(List<SpeakerTalksDto> spearkerList) {
		//processing and filter to find speeeches on last day 
		//iterate througth the array and return updated list
		return spearkerList;
	}
	
}
