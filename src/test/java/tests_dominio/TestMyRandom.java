package tests_dominio;
import dominio.MyRandom;
import dominio.MyRandomStub;

import org.junit.Assert;
import org.junit.Test;



//Como testeo una clase con metodos static? arme un constructor al divino boton para pasar el test
public class TestMyRandom {
  @Test
  public void testMyRandom() {
    MyRandom myRandom = new MyRandom();
    Assert.assertNotNull(myRandom.obtenerAleatorioMenorQue(8));
  }
@Test
public void testMyRandomStub(){
	MyRandomStub stub = new MyRandomStub(3);
	Assert.assertNotNull(stub.obtenerAleatorioMenorQue(9));
}
}
