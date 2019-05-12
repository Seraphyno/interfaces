package com.sda.abstracte;

import com.sda.interferte.IMotor;

public class Masina extends ACaroserie
            implements IMotor {

    @SuppressWarnings("/acces/")
    String nume;

    @Override
    public String getTip() {
        return "Cabrio";
    }

    @Override
    public String getCilindree() {
        return "4.7 Hemi";
    }

    private void metoda() {
        this.nume = "asd";
    }
}
