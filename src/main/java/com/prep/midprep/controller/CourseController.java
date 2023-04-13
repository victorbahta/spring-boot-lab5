package com.prep.midprep.controller;

import com.prep.midprep.domain.Course;
import com.prep.midprep.repository.CourseRepo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseRepo courseRepo;
    @PostMapping
    public void saveCourse(@RequestBody Course course) {
        courseRepo.save(course);

    }
}
