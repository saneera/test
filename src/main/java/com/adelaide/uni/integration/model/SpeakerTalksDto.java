package com.adelaide.uni.integration.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown=true)
@NoArgsConstructor @Data
public class SpeakerTalksDto {

	private String nedId;
	
	private String fullName;
	
	private int graduationYear;
	
	private List<TalksDto> talk;
	
}
