package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.JsonbData;
import com.api.entity.Student;
import com.api.service.impl.JsonDataServiceImpl;

@RestController
public class JsonRestController {

	@Autowired
	private JsonDataServiceImpl service;
	
	@PostMapping("/insert")
    public ResponseEntity<String> saveEntity(@RequestBody JsonbData data) {
        String savedEntity = service.saveEntity(data);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }
	
	@PostMapping("/student")
    public ResponseEntity<String> saveEntity(@RequestBody Student data) {
        String savedEntity = service.saveStudent(data);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }
	
	
	
	
}
