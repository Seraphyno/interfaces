package com.sda.interferte;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MasinaTest {

    private Masina masina = new Masina();

    @Test
    public void testMasina() {
        assertEquals("Berlina", masina.getTip());
    }

    @Test
    public void testMasina_1() {
        assertEquals("1.2", masina.getCilindree());
    }

}