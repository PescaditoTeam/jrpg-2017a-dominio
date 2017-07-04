package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Character;

public class TestCharacter {

    @Test
    public void testCharacter() {
        Character c = new Character();
        Assert.assertTrue(c.serAtacado(10) == 0);
        Assert.assertTrue(c.esAfectadoPorHechizo() == false);
        Assert.assertTrue(c.esPersonaje() == false);
        Assert.assertTrue(c.getAtaque() == 0);
        Assert.assertTrue(c.otorgarExp() == 0);
        Assert.assertTrue(c.getSalud() == 0);
    }

}
