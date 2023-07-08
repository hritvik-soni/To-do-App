package com.hritvik.TODO_Application.repository;

import com.hritvik.TODO_Application.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITodoRepo extends CrudRepository<TodoItem,Long> {

}
