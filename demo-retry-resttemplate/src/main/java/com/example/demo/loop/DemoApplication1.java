package com.example.demo.loop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@SpringBootApplication(exclude = SpringDataWebAutoConfiguration.class)
public class DemoApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication1.class, args);
	}

	@Autowired
	RetryService retryService;

	@PostConstruct
	public void run(){
		retryService.doretry();
	}

}
