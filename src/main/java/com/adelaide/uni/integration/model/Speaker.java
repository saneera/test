package com.adelaide.uni.integration.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @EqualsAndHashCode @AllArgsConstructor @NoArgsConstructor @ToString
public class Speaker implements Serializable{
	
	private static final long serialVersionUID = -3820242200692596761L;

	@Id
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;
		
	private String speakerName;
	
	private String speakerNedId;
	
	private String course;
	
	private String yearGraduated;	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "speaker")
    private Set<Speaches> speeches = new HashSet<>();
	
		
}
