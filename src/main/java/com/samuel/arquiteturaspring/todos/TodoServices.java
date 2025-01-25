package com.samuel.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoServices { //camada lógica
    //atributos
    private TodoRepository repository;

    //método salvar
    public TodoEntity salvar(TodoEntity newTodo){
        return repository.save(newTodo);
    }

    //atualizar Status
    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
    }

    //buscar os dados pelo id
    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }


    //construtor
    public TodoServices(TodoRepository repository){
        this.repository = repository;
    }

    //métodos getter e setters
    public TodoRepository getRepository() {
        return repository;
    }

    public void setRepository(TodoRepository repository) {
        this.repository = repository;
    }
}
