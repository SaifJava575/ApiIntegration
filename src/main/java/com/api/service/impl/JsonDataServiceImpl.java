package com.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.JsonbData;
import com.api.entity.Student;
import com.api.repo.JsonDataRepo;
import com.api.repo.StudentRepo;

@Service
public class JsonDataServiceImpl {

	@Autowired
	private JsonDataRepo repo;
	
	@Autowired
	private StudentRepo studRepo;

	public String saveEntity(JsonbData entity) {
		repo.save(entity);
		return "Saved";
	}
	
	public String saveStudent(Student entity) {
		studRepo.save(entity);
		return "Saved";
	}

}
