package com.springsecurity.basicauthentication.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean//bunu somutlaştırmamız gerekecek
	public NewTopic codesTopic()
	{
		return TopicBuilder.name("ufukscode").build();
		//topic olusturduk adını verdik ve build ettik
		
		
	}
	
}
