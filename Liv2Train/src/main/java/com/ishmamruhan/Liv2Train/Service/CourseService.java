package com.ishmamruhan.Liv2Train.Service;

import com.ishmamruhan.Liv2Train.Dao.CourseRepo;
import com.ishmamruhan.Liv2Train.Models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;

    public String save(Course course){
        courseRepo.save(course);
        return "Course Saved!";
    }

    public String saveAll(List<Course> courses){
        courseRepo.saveAll(courses);
        return "All Course Saved!";
    }
}
