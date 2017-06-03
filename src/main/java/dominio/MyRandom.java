package dominio;

public class MyRandom extends RandomGenerator {

@Override
public int obtenerAleatorioMenorQue(int maximo) {

	return (int) Math.random() % maximo;
}

}
