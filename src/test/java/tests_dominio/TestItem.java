package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Item;
import dominio.Mochila;

public class TestItem {
	@Test
	public void testAgregar(){
		Mochila m = new Mochila();
		Item item = new Item(1,"prueba", 0, 15, -1, 13, -20, 20);
		m.add(item);
		Assert.assertTrue(m.getInventario()[0] == 1);
		Assert.assertTrue(item.getNombre() == "prueba");
		Assert.assertTrue(item.getId() == 1 );
		Assert.assertTrue(item.getValorDefensa() == 0);
		Assert.assertTrue(item.getValorSalud() == 15);
		Assert.assertTrue(item.getValorEnergia() == -1);
		Assert.assertTrue(item.getValorDestreza() == 13);
		Assert.assertTrue(item.getValorInteligencia() == -20);
		Assert.assertTrue(item.getValorFuerza() == 20);
	}
	@Test
	public void testSetear(){
		Item item = new Item();
		item.setId(1);
		item.setNombre("prueba");
		item.setValorDefensa(0);
		item.setValorDestreza(13);
		item.setValorEnergia(-1);
		item.setValorFuerza(20);
		item.setValorInteligencia(-20);
		item.setValorSalud(15);
		Assert.assertTrue(item.getNombre() == "prueba");
		Assert.assertTrue(item.getId() == 1 );
		Assert.assertTrue(item.getValorDefensa() == 0);
		Assert.assertTrue(item.getValorSalud() == 15);
		Assert.assertTrue(item.getValorEnergia() == -1);
		Assert.assertTrue(item.getValorDestreza() == 13);
		Assert.assertTrue(item.getValorInteligencia() == -20);
		Assert.assertTrue(item.getValorFuerza() == 20);
	}
	

}
