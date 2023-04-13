package com.prep.midprep.controller;

import com.prep.midprep.domain.Address;
import com.prep.midprep.domain.Course;
import com.prep.midprep.domain.Student;
import com.prep.midprep.repository.AddressRepo;
import com.prep.midprep.repository.CourseRepo;
import com.prep.midprep.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    AddressRepo addressRepo;
    @Autowired
    CourseRepo courseRepo;
    @PostMapping
    public void saveStudent(@RequestBody Student student) {
//        long addressId = student.getAddress().getId();
//        Address address = addressRepo.findById(addressId).orElseThrow(()-> new RuntimeException("Address not found"));
//        List<Course> courses = new ArrayList<>();
//        for(Course c : student.getCourses()) {
//            Long id = c.getId();
//            Course course = courseRepo.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
//            courses.add(course);
//        }
//        student.setAddress(address);
//        student.setCourses(courses);
//        studentRepo.save(student);
    }

    @GetMapping()
    public List<Student> getStudentByGPA(@RequestParam(value = "gpa", required = false) double gpa, @RequestParam("aid") long aid) {
        if(gpa != 0 && aid != 0) {
            return studentRepo.findByReq(gpa,aid);
        }
          return studentRepo.findAll();
    }
}
