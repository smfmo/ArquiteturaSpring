package com.samuel.arquiteturaspring.montadora.configuration;

import com.samuel.arquiteturaspring.montadora.Motor;
import com.samuel.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.7);
        motor.setTipo(TipoMotor.ASPIRADO);

        return motor;
    }
}
