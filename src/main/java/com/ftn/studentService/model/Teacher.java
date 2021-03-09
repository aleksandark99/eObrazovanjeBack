package com.ftn.studentService.model;

import com.ftn.studentService.model.enums.TeacherRole;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Enumerated(EnumType.STRING)
    private TeacherRole teacherRole;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "teacher")
    private Set<Teaching> teachings;
}
