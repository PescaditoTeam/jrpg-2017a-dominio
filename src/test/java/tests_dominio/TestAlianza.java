package tests_dominio;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

import dominio.Alianza;
import dominio.Elfo;
import dominio.Guerrero;
import dominio.Personaje;

public class TestAlianza {

  @Test
  public void testAlianza() {
    LinkedList<Personaje> aliados = new LinkedList<Personaje>();
    aliados.add(new Elfo("elfito", new Guerrero(1, 2, 3), 34));
    Alianza a = new Alianza("miAlianza");
    a.setAliados(aliados);
    for (Personaje al : a.getAliados()) {
      System.out.println(al.getNombre());
    }
    if (aliados == a.getAliados()) {
      System.out.println("Son iguales");
    }
    Assert.assertNotSame(aliados, a.getAliados()); // Clone funcionó.
    Assert.assertNotNull(a.getAliados());
  }

  @Test
  public void testGetNombreNoNull() {
    LinkedList<Personaje> aliados = new LinkedList<Personaje>();
    aliados.add(new Elfo("elfito", new Guerrero(1, 2, 3), 34));
    Alianza a = new Alianza("miAlianza");
    Assert.assertTrue(a.obtenerNombre().equals("miAlianza"));

  }

  @Test
  public void testGetNombreIsNull() {
    LinkedList<Personaje> aliados = new LinkedList<Personaje>();
    aliados.add(new Elfo("elfito", new Guerrero(1, 2, 3), 34));
    Alianza a = new Alianza(null);
    Assert.assertNull(a.obtenerNombre());

  }

  @Test
  public void testSetAlianza() {
    LinkedList<Personaje> aliados = new LinkedList<Personaje>();
    aliados.add(new Elfo("elfito", new Guerrero(1, 2, 3), 34));
    Alianza a = new Alianza("miAlianza");
    a.setAliados(aliados);
    Assert.assertNotNull(a.getAliados());
  }

}
