package com.ishmamruhan.Liv2Train.Dao;

import com.ishmamruhan.Liv2Train.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
}
