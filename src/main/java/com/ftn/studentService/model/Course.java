package com.ftn.studentService.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "course")
    private Set<Enrollment> enrollments;

    @OneToMany(mappedBy = "course")
    private  Set<Teaching> teachings;
}
