package com.ftn.studentService.model;

import com.ftn.studentService.model.enums.PaymentType;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @ManyToOne
    @JoinColumn(name = "financialCard_id")
    private FinancialCard financialCard;
}
