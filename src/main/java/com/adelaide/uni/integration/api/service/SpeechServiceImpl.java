package com.adelaide.uni.integration.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adelaide.uni.integration.api.repository.SpeechRepository;
import com.adelaide.uni.integration.model.Speaches;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter @Setter
public class SpeechServiceImpl implements SpeechService {

	@Autowired
	private SpeechRepository speechRepository;
	
	@Override
	public void save(Speaches speech) {
		speechRepository.save(speech);
	}

 
}
