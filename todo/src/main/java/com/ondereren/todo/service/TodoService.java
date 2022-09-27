package com.ondereren.todo.service;
import com.ondereren.todo.model.Todo;
import java.util.List;

public interface TodoService {
    Todo saveTodo(Todo todo);
    List<Todo> getAllTodo();
    void deleteTodos();
}
