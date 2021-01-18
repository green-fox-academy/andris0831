package com.greenfoxacademy.mysql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @GeneratedValue
    @Id
    private Long id;
    private String title;
    private boolean urgent = false;
    private boolean done = false;


    public Todo(String title) {
        this.title = title;
    }



}
