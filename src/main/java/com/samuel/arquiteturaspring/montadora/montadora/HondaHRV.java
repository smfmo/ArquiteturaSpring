package com.samuel.arquiteturaspring.montadora.montadora;

import java.awt.*;

public class HondaHRV extends carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }

}
