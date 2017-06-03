package dominio;

public class MyRandom extends RandomGenerator {

  /*public double nextDouble() {
    return Math.random() % maximo;
  }

  public int nextInt() {
    return (int) Math.random() % (int) maximo;
  }*/

@Override
public int obtenerAleatorioMenorQue(int maximo) {

	return (int) Math.random() % maximo;
}

}
