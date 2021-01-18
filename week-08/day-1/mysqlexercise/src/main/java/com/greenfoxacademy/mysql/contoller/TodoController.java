package com.greenfoxacademy.mysql.contoller;

import com.greenfoxacademy.mysql.model.Todo;
import com.greenfoxacademy.mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TodoController implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean isDone) {
        List<Todo> todoList = (List<Todo>) todoRepository.findAll();
        if (isDone == null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else {
            model.addAttribute("todos", todoList.stream().filter(t -> t.isDone() == !isDone).collect(Collectors.toList()));
        }
        return "todolist";
    }

    @GetMapping("/todo")
    public String todo() {
        return "redirect:/";
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

