package com.sda.interferte;

   /*
    * keyword implements
    * pot implementa mai multe Interfete
    */
public class Masina implements ICaroserie, IMotor {
    @Override
    public String getTip() {
        return "Berlina";
    }

    @Override
    public String getCilindree() {
        return "1.2";
    }
}
