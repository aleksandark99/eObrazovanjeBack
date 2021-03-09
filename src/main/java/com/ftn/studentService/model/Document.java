package com.ftn.studentService.model;

import javax.persistence.*;

@Entity
public class Document {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column
    private String name;

    @Column
    private  String url;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
