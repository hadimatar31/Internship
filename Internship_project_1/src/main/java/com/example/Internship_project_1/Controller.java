package com.example.Internship_project_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import java.util.List;

@RestController
public class Controller {

	@Autowired
	FetchDataService fetchDataService;
	
	@GetMapping(path = "getdata")
	List<StudentModel> getstd(){
		return fetchDataService.findAll();
		
	}
}
