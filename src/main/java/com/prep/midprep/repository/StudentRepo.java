package com.prep.midprep.repository;

import com.prep.midprep.domain.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepo extends CrudRepository<Student,Long> {
    Student save(Student s);
    List<Student> findAll();
    @Query("select s from Student s where s.gpa=:gpa and s.address.id=:addressId")
    List<Student> findByReq(double gpa, long addressId);

}
