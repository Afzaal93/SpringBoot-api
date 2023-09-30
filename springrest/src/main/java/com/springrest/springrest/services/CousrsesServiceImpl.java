package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourceDao;
import com.springrest.springrest.entity.Courses;

@Service
public class CousrsesServiceImpl implements CoursesService {
	/*
	 * List<Courses> list;
	 * 
	 * public CousrsesServiceImpl() { list = new ArrayList<>(); list.add(new
	 * Courses(145, "java Courses Book", "this Courses consist os core java"));
	 * list.add(new Courses(135, "advance Java", "springboot")); }
	 */
	@Autowired
	private CourceDao courceDao;

	@Override
	public List<Courses> getCourses() {

		return courceDao.findAll();
	}

	@Override
	public Courses getCourses(long courseId) {
		/*
		 * Courses c = null; for (Courses courses : list) { if (courses.getId() ==
		 * courseId) { c = courses; break; } }
		 */

		return courceDao.getById(courseId);
	}

	@Override
	public Courses addcourse(Courses courses) {
		//list.add(courses);
		courceDao.save(courses);
		return courses;
	}

	@Override
	public Courses updatecourse(Courses c) {
		//list.add(c);
		courceDao.save(c);
		return c;
	}

	@Override
	public void deletecourse(long courseId) {
		/*
		 * Courses c = null; for (Courses courses : list) { if (courses.getId() ==
		 * courseId) { list.remove(courses); break; } } return c;
		 */
		Courses entity=courceDao.getOne(courseId);
		courceDao.delete(entity);
	}

}
