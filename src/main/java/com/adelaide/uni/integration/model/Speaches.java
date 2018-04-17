package com.adelaide.uni.integration.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @EqualsAndHashCode @AllArgsConstructor @NoArgsConstructor @ToString
public class Speaches {

	@Id
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;
	
	private String talkId;
		
	private String linkToNed;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "speaker_id", nullable = false)
	private Speaker speaker;
	
	
	
}
