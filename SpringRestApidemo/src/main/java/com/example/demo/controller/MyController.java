package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService  courseService;
	
	@GetMapping("/home")
	public String home() {
		
		return "This is Home Page";
	}
	
	//Get all courses
	@GetMapping("/Courses")
	public List<Courses> getCourses()
	{
		return this.courseService.getCourses();
		
	}
	@DeleteMapping("/Courses/{id}")
	public List<Courses> deleteById(@PathVariable("id") int id)
	{
		return this.courseService.delbyid(id);
	}
	@PostMapping("/Courses")
	public void addData(@RequestBody Courses C) {
		this.courseService.addData(C);
		
	}
	

}
