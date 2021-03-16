package com.ftn.studentService.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "student")
    private Set<Enrollment> enrollments;

    @OneToOne
    private FinancialCard financialCard;

}
