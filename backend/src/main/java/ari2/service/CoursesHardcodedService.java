package ari2.service;

import java.util.LinkedList;
import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ari2.model.Course;
import ari2.repository.CourseRepository;

@Service
@Transactional
public class CoursesHardcodedService {

	private CourseRepository repository;
	
	public CoursesHardcodedService(CourseRepository repo) {
		repository = repo;
	}

	public List<Course> findAll() {
		return repository.findAll();
	}
}
