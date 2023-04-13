package com.prep.midprep.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Course {
    @Id
    long id;

    String name;
   @ManyToMany()
           @JoinColumn(name = "student_id")
    List<Student> students;
}
