package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.DatosDePersonajeAReplicar;

public class TestDatosDePersonajeAReplicar {
	
	@Test
	public void TestConstruir(){
		DatosDePersonajeAReplicar d = new DatosDePersonajeAReplicar(10,20,30,40,50,60,70);
		Assert.assertTrue(d.getSaludTope() == 10 );
		Assert.assertTrue(d.getEnergiaTope() == 20 );
		Assert.assertTrue(d.getFuerza() == 30 );
		Assert.assertTrue(d.getDestreza() == 40 );
		Assert.assertTrue(d.getInteligencia() == 50 );
		Assert.assertTrue(d.getExperiencia() == 60 );
		Assert.assertTrue(d.getNivel() == 70 );
	}
	@Test
	public void TestSetear(){
		DatosDePersonajeAReplicar d = new DatosDePersonajeAReplicar();
		d.setDestreza(40);
		d.setEnergiaTope(20);
		d.setExperiencia(60);
		d.setFuerza(30);
		d.setInteligencia(50);
		d.setNivel(70);
		d.setSaludTope(10);
		Assert.assertTrue(d.getSaludTope() == 10 );
		Assert.assertTrue(d.getEnergiaTope() == 20 );
		Assert.assertTrue(d.getFuerza() == 30 );
		Assert.assertTrue(d.getDestreza() == 40 );
		Assert.assertTrue(d.getInteligencia() == 50 );
		Assert.assertTrue(d.getExperiencia() == 60 );
		Assert.assertTrue(d.getNivel() == 70 );
	}

}
