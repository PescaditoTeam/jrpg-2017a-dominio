package dominio;

/**
 * @author Usuario
 * clase myRandomStub.
 *
 */
public class MyRandomStub extends RandomGenerator {
  /**
 * atributo valor.
 */
private int valor;


  /**
   * constructor parametrizado.
 * @param valorfijo
 * .
 */
public MyRandomStub(final int valorfijo) {
this.valor = valorfijo;
  }


@Override
public int obtenerAleatorioMenorQue(final int maximo) {
return this.valor;
}

}
