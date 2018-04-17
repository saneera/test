package com.adelaide.uni.integration.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adelaide.uni.integration.api.repository.SpeakerRepository;
import com.adelaide.uni.integration.model.Speaker;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter @Setter
public class SpeakerServiceImpl implements SpeakerService{

	@Autowired
	SpeakerRepository userRepository;
	
	@Override
	public void save(Speaker speaker) {
		userRepository.save(speaker);
	}

 
}
