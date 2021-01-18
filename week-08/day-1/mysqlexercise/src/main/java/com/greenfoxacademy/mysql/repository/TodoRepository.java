package com.greenfoxacademy.mysql.repository;

import com.greenfoxacademy.mysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByDoneFalse();
}
