package tests_dominio;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import dominio.Mercado;
import dominio.Ofertas;

public class TestMercado {
	
	@Test
	public void testAgregarMercado(){
		Ofertas o = new Ofertas(2, 3, "Pablo");
		Assert.assertTrue(o.getUser() == "Pablo");
		Assert.assertTrue(o.getDemandado() == 3);
		Assert.assertTrue(o.getOfertado() == 2);
		Mercado m = new Mercado();
		m.AddOferta(2, 3, "Pablo");
		ArrayList<Ofertas> ao = new ArrayList<Ofertas>();
		ao = m.getOfertas();
		Ofertas o2 = ao.get(0);
		Assert.assertTrue(o2.getUser() == "Pablo");
		Assert.assertTrue(o2.getDemandado() == 3);
		Assert.assertTrue(o2.getOfertado() == 2);
		
	}

}