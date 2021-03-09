package com.ftn.studentService.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column
    private int grade;

    @Column
    private boolean passed;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "enrollment")
    private Set<ExamTaking> examTakings;
}
