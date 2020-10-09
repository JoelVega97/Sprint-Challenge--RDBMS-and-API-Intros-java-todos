package com.lambdaschool.todos.models;


import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todos extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;

    @Column
}
