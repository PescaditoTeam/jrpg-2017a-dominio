package dominio;

public class MyRandom extends RandomGenerator {
  double maximo;

  MyRandom(int max) {

    maximo = max;
  }

  public double nextDouble() {
    return Math.random() % maximo;
  }

  public int nextInt() {
    return (int) Math.random() % (int) maximo;
  }

}
