// Write your code here
package com.example.todo.repository;

import com.example.todo.model.Todo;
import java.util.ArrayList;

public interface TodoRepository {

    public ArrayList<Todo> getAll();

    public Todo creatTodo(Todo todo);

    public Todo getByid(int id);

    public Todo updateByid(int id, Todo todo);

    public void remove(int id);
}