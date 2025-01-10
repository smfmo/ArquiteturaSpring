package com.samuel.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoServices {

    private TodoRepository repository;

    public TodoServices(TodoRepository todoRepository){
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        return  repository.save(novoTodo);
    }
}
