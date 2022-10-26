package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.entities.GenericResponse;
import com.example.demo.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to my spring boot application";
	}
	
	@GetMapping("/courses")
	public GenericResponse<List<Course>> getCourses() {
	return new GenericResponse<List<Course>> ("00","Success",this.courseService.getCourses());
	}
	
	@GetMapping("/courses/{courseId}")
	public GenericResponse<Course> getCourse(@PathVariable String courseId) {
	return new GenericResponse<Course> ("00","Success",this.courseService.getCourse(Long.parseLong(courseId)));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
	return this.courseService.addCourse(course);
	}
}
