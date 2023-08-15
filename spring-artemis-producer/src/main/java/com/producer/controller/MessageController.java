package com.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.producer.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	MessageService service;
	
	
	@PostMapping("/message")
	public String send(@RequestBody String message) {
		service.send(message);		
		return message;
	}	
}