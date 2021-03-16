package com.ftn.studentService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExamTaking {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column
    private double practicalPoints;

    @Column
    private double theoreticalPoints;

    @Column
    private double price;

    @ManyToOne
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @ManyToOne
    @JoinColumn(name = "enrollment_id")
    private Enrollment enrollment;

}
