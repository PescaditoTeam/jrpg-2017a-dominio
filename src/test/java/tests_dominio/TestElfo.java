package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Humano;
import dominio.Mochila;

public class TestElfo {

    @Test
    public void testGolpeLevel() {
        Elfo e = new Elfo("Nico", 100, 100, 25, 20, 30,
                new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
        Humano h = new Humano("Nico", 100, 100, 25, 20, 30,
                new Asesino(0.2, 0.3, 1.5), 0, 1, 1);

        Assert.assertTrue(h.getSalud() == 100);
        if (e.habilidadRaza1(h)) {
            Assert.assertTrue(h.getSalud() < 100);
        }
    }

    @Test
    public void testNuevoConstructor() {
        Elfo e = new Elfo("Elfo", 10, 10, 10, 10, 10, new Asesino(), 10, 10, 10,
                new Mochila());
        Assert.assertTrue(e.getDefensa() == 10);
    }

    @Test
    public void testAtaqueBosque() {
        Elfo e = new Elfo("Nico", 100, 100, 25, 20, 30,
                new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
        Humano h = new Humano("Nico", 100, 100, 25, 20, 30,
                new Asesino(0.2, 0.3, 1.5), 0, 1, 1);

        Assert.assertTrue(h.getSalud() == 100);
        if (e.habilidadRaza2(h)) {
            Assert.assertTrue(h.getSalud() < 100);
        }
    }

    @Test
    public void testElfo() {
        Humano h = new Humano("Nico", 100, 100, 25, 20, 30,
                new Asesino(0.2, 0.3, 1.5), 0, 1, 1);
        Elfo e = new Elfo("Nico", 100, 100, 25, 20, 30,
                new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
        e.setEnergia(10);
        Assert.assertFalse(e.habilidadRaza2(h));
        Assert.assertFalse(e.habilidadRaza1(h));

    }
}
