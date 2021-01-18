package com.greenfoxacademy.todoh2.repository;

import com.greenfoxacademy.todoh2.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
