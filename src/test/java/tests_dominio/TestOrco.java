package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Guerrero;
import dominio.Hechicero;
import dominio.Humano;
import dominio.Mochila;
import dominio.Orco;

public class TestOrco {

    @Test
    public void testGolpeDefensivo() {
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Orco o = new Orco("Hernan", new Guerrero(), 1);

        Assert.assertTrue(h.getSalud() == 105);
        if (o.habilidadRaza1(h)) {
            Assert.assertTrue(h.getSalud() == 95);
        }
    }

    @Test
    public void testMordiscoDeVida() {
        Humano h = new Humano("Nico", 100, 100, 55, 20, 30,
                new Hechicero(0.2, 0.3, 1.5), 0, 1, 1);
        Orco o = new Orco("Nico", 100, 100, 80, 20, 30,
                new Asesino(0.2, 0.3, 1.5), 0, 1, 1);

        Assert.assertTrue(h.getSalud() == 100);
    }

    @Test
    public void testOrco() {
        Humano h = new Humano("Nico", 100, 100, 25, 20, 30,
                new Asesino(0.2, 0.3, 1.5), 0, 1, 1);
        Orco e = new Orco("Nico", 100, 100, 25, 20, 30,
                new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
        e.setEnergia(10);
        Assert.assertFalse(e.habilidadRaza2(h));
        Assert.assertFalse(e.habilidadRaza1(h));
        Assert.assertTrue(e.esAfectadoPorHechizo() == true);
        Orco e2 = new Orco("Nico", 100, 100, 25, 20, 30,
                new Asesino(0.2, 0.3, 1.5), 0, 3, 1, new Mochila());

    }

}
