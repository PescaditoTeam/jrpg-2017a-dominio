package tests_dominio;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import dominio.Mercado;
import dominio.Ofertas;

public class TestMercado {

    @Test
    public void testAgregarMercado() {
        Ofertas o = new Ofertas(2, 3, "Pablo", 1);
        Assert.assertTrue(o.getUser() == "Pablo");
        Assert.assertTrue(o.getDemandado() == 3);
        Assert.assertTrue(o.getOfertado() == 2);
        Mercado m = new Mercado();
        m.AddOferta(2, 3, "Pablo", 1);
        ArrayList<Ofertas> ao = new ArrayList<Ofertas>();
        ao = m.getOfertas();
        Ofertas o2 = ao.get(0);
        /*Assert.assertTrue(o2.getUser() == "Pablo");
        Assert.assertTrue(o2.getDemandado() == 3);
        Assert.assertTrue(o2.getOfertado() == 2);*/
        m.AddOferta(o2);
        Ofertas o3 = m.getOfertas().get(1);
        Assert.assertTrue(o3.getUser() == "Pablo" && o2.getUser() == "Pablo");
        Assert.assertTrue(o3.getDemandado() == 3 && o2.getDemandado() == 3);
        Assert.assertTrue(o3.getOfertado() == 2 && o2.getOfertado() == 2);
        Assert.assertTrue(o3.getIdUser() == 1);

    }
    @Test
    public void testSeHizoOfertas(){
        Ofertas o = new Ofertas();
        o.setYaSeHizo(true);
        Assert.assertTrue(o.isYaSeHizo());
        
    }
    @Test
    public void testConstructorArrayList(){
        ArrayList<Ofertas> ao = new ArrayList<Ofertas>();
        ao.add(new Ofertas(1, 2, "prueba", 2));
        Mercado m = new Mercado(ao);
        Assert.assertTrue(m.getOfertas().get(0).getIdUser() == 2);
    }


}
