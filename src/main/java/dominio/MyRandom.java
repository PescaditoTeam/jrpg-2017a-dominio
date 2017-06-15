package dominio;

import java.util.Random;

/**
 * @author Usuario
 * clase myRandom.
 *
 */
public class MyRandom extends RandomGenerator {

@Override
public int obtenerAleatorioMenorQue(int maximo) {

return new Random().nextInt(maximo);
}

}
