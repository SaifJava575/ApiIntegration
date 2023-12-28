package com.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.JsonbData;

public interface JsonDataRepo extends JpaRepository<JsonbData,Long> {

}
