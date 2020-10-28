package ari2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ari2.model.Course;

public interface CourseRepository  extends JpaRepository<Course,String> {

}