package com.hritvik.TODO_Application.service;

import com.hritvik.TODO_Application.model.TodoItem;
import com.hritvik.TODO_Application.repository.ITodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private ITodoRepo todoRepo;

    public Optional<TodoItem> getById(Long id) {
        return todoRepo.findById(id);
    }

    public Iterable<TodoItem> getAll() {
        return todoRepo.findAll();
    }

    public TodoItem save(TodoItem todoItem) {
        if (todoItem.getId() == null) {
            todoItem.setCreatedAt(Instant.now());
        }
        todoItem.setUpdatedAt(Instant.now());
        return todoRepo.save(todoItem);
    }

    public void delete(TodoItem todoItem) {
        todoRepo.delete(todoItem);
    }


}
