package com.source.todo.domain;

public class Todo {
    private String title;
    private boolean isCompleted;

    public Todo(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }
}