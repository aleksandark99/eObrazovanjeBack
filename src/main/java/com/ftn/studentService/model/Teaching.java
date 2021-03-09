package com.ftn.studentService.model;

import com.ftn.studentService.model.enums.TeacherRole;

import javax.persistence.*;

@Entity
public class Teaching {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @Enumerated(EnumType.STRING)
    private TeacherRole teacherRole;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
