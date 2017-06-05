package dominio;

/**
 * @author Usuario
 * clase myRandom.
 *
 */
public class MyRandom extends RandomGenerator {

@Override
public int obtenerAleatorioMenorQue(final int maximo) {

return (int) Math.random() % maximo;
}

}
