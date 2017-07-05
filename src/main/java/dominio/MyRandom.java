package dominio;

import java.util.Random;

/**
 * @author Usuario clase myRandom.
 *
 */
public class MyRandom extends RandomGenerator {

    /*
     * metodo que devuelte un numero al azar menor que el numero maximo
     * recibido.
     */
    @Override
    public int obtenerAleatorioMenorQue(final int maximo) {

        return new Random().nextInt(maximo);
    }

}
