package com.greenfoxacademy.todoh2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
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
