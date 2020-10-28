package ari2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ari2.model.Course;
import ari2.service.CoursesHardcodedService;

@CrossOrigin(origins = { "http://localhost", "http://localhost:3000" })
@RestController
public class CourseResource {

	@Autowired
	private CoursesHardcodedService courseManagementService;

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return courseManagementService.findAll();
	}
}