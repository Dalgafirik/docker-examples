package com.example.todo.controller;

import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class TodoController {

    private final TodoRepository repository;

    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public List<Todo> getTodos() {
        return repository.findAll();
    }

    @PostMapping("/todo")
    public Todo createTodo(@RequestBody Todo todo) {
        todo.setCreatedAt(new Date());
        return repository.save(todo);
    }
}
