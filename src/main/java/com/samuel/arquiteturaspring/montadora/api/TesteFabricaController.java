package com.samuel.arquiteturaspring.montadora.api;

import com.samuel.arquiteturaspring.Aspirado;
import com.samuel.arquiteturaspring.Eletrico;
import com.samuel.arquiteturaspring.Turbo;
import com.samuel.arquiteturaspring.montadora.HondaHRV;
import com.samuel.arquiteturaspring.montadora.Motor;
import com.samuel.arquiteturaspring.montadora.carro;
import com.samuel.arquiteturaspring.montadora.Chave;
import com.samuel.arquiteturaspring.montadora.montadora.CarroStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Turbo
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }

}
