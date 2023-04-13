package com.prep.midprep.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    long id;
    String name;


    double gpa;

    @ManyToOne(fetch = FetchType.EAGER)
//    @JsonManagedReference
    Address address;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "students")
    List<Course> courses;
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", address=" + address +
                '}';
    }

}

