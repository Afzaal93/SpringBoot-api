package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Courses;

public interface CoursesService {
	public List<Courses> getCourses();

	public Courses getCourses(long courseId);

	public Courses addcourse(Courses courses);

	public Courses updatecourse(Courses courses);

	public void deletecourse(long courseId);
}
