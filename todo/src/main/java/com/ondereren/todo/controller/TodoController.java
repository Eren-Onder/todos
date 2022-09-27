package com.ondereren.todo.controller;
import com.ondereren.todo.model.Todo;
import com.ondereren.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/todo")
@CrossOrigin
public class TodoController {

        @Autowired
        private TodoService todoService;

        @PostMapping("/add")
        public String add(@RequestBody Todo todo){
            todoService.saveTodo(todo);
            return "New Todo is added";
        }

        @GetMapping("/getAll")
        public List<Todo> list(){
            return todoService.getAllTodo();
        }

        @DeleteMapping ("/delete")
        public String delete(@RequestBody Todo todo){
            todoService.saveTodo(todo);
            return "New Todo is deleted";
        }
    }

