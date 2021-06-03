package com.example.Internship_project_1;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public interface FetchDataService extends JpaRepository<StudentModel,Integer> {

	@Override
	List<StudentModel> findAll();
}
