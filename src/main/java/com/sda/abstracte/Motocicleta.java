package com.sda.abstracte;

import com.sda.interferte.ICaroserie;

public class Motocicleta extends AMotor
                    implements ICaroserie {
    @Override
    public String getCilindree() {
        return "1.2";
    }

    @Override
    public String getTip() {
//        return "Chopper";
        return null;
    }
}
