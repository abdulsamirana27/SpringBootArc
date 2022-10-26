package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	int x;
	String y;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Spring Boot","added by sam"));
		list.add(new Course(145,"Angular","added by sam"));
		list.add(new Course(145,"Rest API spring boot","added by sam"));
		
		
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
	
	@Override
	public Course addCourse(Course course) {
		
		Course c = course;
		list.add(c);
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c = course;
//				break;
//			}
//		}
		
		
//	try {
//			
//		}catch(Exception e) {
//			 e.error("something went wrong", e);
//		}finally {
//			
//		}
		return c;
	}

}
