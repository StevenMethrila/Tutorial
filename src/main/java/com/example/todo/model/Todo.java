/*
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.todo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "todolist")
public class Todo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "todo")
    private String todo;

    @Column(name = "priority")
    private String priority;

    @Column(name = "status")
    private String status;

    

    public Todo() {

    }

    public Todo(int id, String todo, String priority,String status) {
        this.id = id;
        this.todo = todo;
        this.priority = priority;
        this.status = status;
        
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodo() {
        return this.todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getpriority() {
        return this.priority;
    }

    public void setpriority(String priority) {
        this.priority = priority;
    }

    public String getstatus() {
        return this.status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

}