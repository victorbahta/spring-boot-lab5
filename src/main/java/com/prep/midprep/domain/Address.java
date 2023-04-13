package com.prep.midprep.domain;

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
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    long id;
    String city;
    String state;
    int zipcode;
//    @JsonManagedReference
//
//    @OneToMany(mappedBy = "address", fetch = FetchType.LAZY)
//    List<Student> student;

}
