package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Courses;
import com.springrest.springrest.services.CoursesService;

@RestController // to sent data in jason form
public class Mycontroller {
	@Autowired

	private CoursesService service;

	@GetMapping("/home")
	public String home() {
		return "Welcome to Courses application";
	}

	// Get the all Course
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return this.service.getCourses();

	}

	// Get single course
	@GetMapping("/courses/{courseId}")
	public Courses getcousre(@PathVariable String courseId) {
		return this.service.getCourses(Long.parseLong(courseId));
	}

	// add courses
	@PostMapping("/courses")
	public Courses addcourse(@RequestBody Courses courses) {
		return this.service.addcourse(courses);

	}

	// update course
	@PutMapping("/courses")
	public Courses Updatecourse(@RequestBody Courses courses) {
		return this.service.updatecourse(courses);
	}

	// Delete Course

	@DeleteMapping("/courses/{courseId}")
	public void Deletecourse(@PathVariable String courseId) {
		this.service.deletecourse(Long.parseLong(courseId));
	}
}
