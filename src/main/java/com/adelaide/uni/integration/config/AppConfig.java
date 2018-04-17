package com.adelaide.uni.integration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "app")
@Getter @Setter
public class AppConfig {
	
	private String nedApiUrl;
	
}
