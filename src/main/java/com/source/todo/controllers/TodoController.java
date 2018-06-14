package com.source.todo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.source.todo.domain.Todo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @RequestMapping(method=RequestMethod.POST, value="/todo")
    public Todo greeting(@RequestParam(value="name", defaultValue="World") String name) {
        // TODO: Add to in memory store
        return new Todo(name);
    }

    @RequestMapping(method=RequestMethod.GET, value="/todo")
    public List<Todo> greeting() {
        // TODO: Return from in memory store
        return Arrays.asList(new Todo("Hello, world!"));
    }
}
