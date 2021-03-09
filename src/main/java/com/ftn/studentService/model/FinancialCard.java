package com.ftn.studentService.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FinancialCard {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @OneToOne
    private Student student;

    @OneToMany(mappedBy = "financialCard")
    private Set<Payment> payments;
}
