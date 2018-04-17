package com.adelaide.uni.integration.api.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.adelaide.uni.integration.model.Speaker;

@Repository
public interface SpeakerRepository extends PagingAndSortingRepository<Speaker, String>, JpaSpecificationExecutor<Speaker> {


}
