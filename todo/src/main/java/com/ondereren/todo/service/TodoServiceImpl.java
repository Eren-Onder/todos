package com.ondereren.todo.service;



import com.ondereren.todo.model.Todo;
import com.ondereren.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import java.util.List;
@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    private TodoRepository todoRepository;
    @Override
    public Todo saveTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    @Override
    public void deleteTodos() {
            todoRepository.delete();
    }
}
