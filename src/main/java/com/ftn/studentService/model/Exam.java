package com.ftn.studentService.model;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column
    private String date;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "examPeriod_id")
    private ExamPeriod examPeriod;

    @OneToMany(mappedBy = "exam")
    private Set<ExamTaking> examTakings;
}
