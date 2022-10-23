package com.example.RestTemplates.controller;



import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/templates/chuyenbay")
	public String getChuyenBays() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<String> responseEntity = restTemplate.exchange("http://localhost:8080/api/chuyenbay", HttpMethod.GET,entity,String.class);
		return responseEntity.getBody();
	}
	
	@GetMapping("/templates/chuyenbayDaD")
	public String getChuyenBaysDenDAD() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<String> responseEntity = restTemplate.exchange("http://localhost:8080/api/chuyenbayDaD", HttpMethod.GET,entity,String.class);
		return responseEntity.getBody();
	}
	
	@GetMapping("/templates/chuyenbayDoDaiHon8VaNhoHon10")
	public String getChuyenBaysDoDaiHon8VaNhoHon10() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<String> responseEntity = restTemplate.exchange("/templates/chuyenbayDoDaiHon8VaNhoHon10", HttpMethod.GET,entity,String.class);
		return responseEntity.getBody();
	}
}
