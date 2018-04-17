package com.adelaide.uni.integration.api.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.adelaide.uni.integration.model.Speaches;
import com.adelaide.uni.integration.model.Speaker;

@Repository
public interface SpeechRepository extends PagingAndSortingRepository<Speaches, String>, JpaSpecificationExecutor<Speaker> {


}
