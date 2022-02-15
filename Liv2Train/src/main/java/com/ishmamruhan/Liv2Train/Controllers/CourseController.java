package com.ishmamruhan.Liv2Train.Controllers;

import com.ishmamruhan.Liv2Train.Models.Course;
import com.ishmamruhan.Liv2Train.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    final String apiBasePathCourse="api/v1/course";

    @Autowired
    CourseService courseService;

    @GetMapping(apiBasePathCourse+"/")
    public String SayHi(){
        return "Hello-WorlD!";
    }

    @PostMapping(apiBasePathCourse+"/add")
    public ResponseEntity<String> add(@RequestBody Course course){
        return new ResponseEntity<>(courseService.save(course), HttpStatus.OK);
    }

    @PostMapping(apiBasePathCourse+"/add-all")
    public ResponseEntity<String> addAll(@RequestBody List<Course> course){
        return new ResponseEntity<>(courseService.saveAll(course), HttpStatus.OK);
    }

}
