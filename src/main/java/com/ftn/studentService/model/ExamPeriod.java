package com.ftn.studentService.model;

import javax.persistence.*;
import java.util.Set;
@Entity
public class ExamPeriod {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column
    private String name;

    @Column
    private String fromDate;

    @Column
    private String toDate;

    @OneToMany(mappedBy = "examPeriod")
    private Set<Exam> exams;

}
