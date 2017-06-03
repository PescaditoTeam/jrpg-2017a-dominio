package dominio;

public class MyRandomStub extends RandomGenerator {
  private int valor;


  public MyRandomStub(int valorfijo) {
	  this.valor = valorfijo;
  }


@Override
public int obtenerAleatorioMenorQue(int maximo) {
	return this.valor;
}

}
