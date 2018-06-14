package com.source.todo;
import java.util.List;

import com.source.todo.domain.Todo;

public class App 
{
    public static void main( String[] args )
    {
        List<Todo> todos = List.of(
            new Todo("\'mvn test\' should pass"),
            new Todo("Test the two domain objects. HINT: Call the constructor, did things get set properly?"),
            new Todo("Mark a Todo as completed"),
            new Todo("Create an in-memory data store to keep track of things. Doesn't need to be anything special."),
            new Todo("Some way to connect Users and their Todos"),
            new Todo("Get all incomplete Todos for a given user."),
            new Todo("Get all completed Todos for a given user."),

            // NOTE: To Aaron and Nick
            // create more todos before interview ??

            new Todo("Build a front-end.")
        );

        todos.forEach((todo) -> {
            System.out.println("\n" + todo.getTitle());
        });
    }
}
