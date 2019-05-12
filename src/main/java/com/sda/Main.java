package com.sda;

import com.sda.abstracte.Masina;
import com.sda.abstracte.Motocicleta;

public class Main {

    public static void main(String[] args) {
        Masina masinaDinAbstracte = new Masina();
        com.sda.interferte.Masina masinaDinInterfete =
                new com.sda.interferte.Masina();

        Motocicleta motocicleta = new Motocicleta();

        assert "Chopper".equals(motocicleta.getTip());
    }
}
