package com.prep.midprep.repository;

import com.prep.midprep.domain.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CourseRepo extends CrudRepository<Course,Long> {
    Course save(Course c);
    Optional<Course> findById(Long id);
}
