package com.samuel.arquiteturaspring.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todos")
public class TodoController {

    //atributo
    private TodoServices service;

    //construtor
    public TodoController(TodoServices service) {
        this.service = service;
    }

    //método salvar
    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todo) {
        return this.service.salvar(todo);
    }

    //atualizar status
    @PutMapping("{id}")
    public void atualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);
        service.atualizarStatus(todo);
    }

    //buscar os dados de pelo id
    @GetMapping("{id}")
    public TodoEntity buscar(@PathVariable("id") Integer id){
        return service.buscarPorId(id);
    }

}
