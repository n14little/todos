package com.source.todo;
import java.util.List;

import com.source.todo.domain.Todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{   
    public static void main(String[] args) {
        List<Todo> todos = List.of(
            new Todo("\'mvn test\' should pass"),
            new Todo("Test the two domain objects. HINT: Call the constructor, did things get set properly?"),
            new Todo("Mark a Todo as completed"),
            new Todo("Create an in-memory data store to keep track of things. Doesn't need to be anything special."),
            new Todo("Some way to connect Users and their Todos"),
            new Todo("Get all incomplete Todos for a given user."),
            new Todo("Get all completed Todos for a given user."),

            new Todo("Explore the react app"),
            new Todo("Add a button to create todos"),
            new Todo("List all the todos in the store"),
            new Todo("Be able to set todos as completed")
        );

        todos.forEach((todo) -> {
            System.out.println("\n" + todo.getTitle());
        });

        SpringApplication.run(App.class, args);
    }
}
