package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses(); 
	public List<Courses> delbyid(int id);
	public void addData(Courses c);
	
}
