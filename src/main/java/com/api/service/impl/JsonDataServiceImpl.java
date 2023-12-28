package com.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.bean.JavaConstant;
import com.api.dao.IGenericDao;
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
	
	@Autowired
	private IGenericDao iGenericDao;

	public String saveEntity(JsonbData entity) {
		repo.save(entity);
		return "Saved";
	}
	
	public String saveStudent(Student entity) {
		studRepo.save(entity);
		return "Saved";
	}
	
	public List<?> findStudent(@PathVariable Integer id){
		List<?> stud=null;
		try {
			stud=iGenericDao.executeDDLHQL(JavaConstant.Student_Detail, new Object[] {id});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stud;
	}

}
