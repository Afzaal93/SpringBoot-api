package com.springrest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Courses;

public interface CourceDao extends JpaRepository<Courses, Long> {

}
