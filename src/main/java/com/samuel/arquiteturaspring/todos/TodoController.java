package com.samuel.arquiteturaspring.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todos")
public class TodoController {

    //atributo
    private TodoServices service;

    //método salvar
    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todo){
        return this.service.salvar(todo);
    }

    //construtor
    public TodoController(TodoServices service) {
        this.service = service;
    }

}
