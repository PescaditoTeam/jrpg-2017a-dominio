package dominio;

public class MyRandomStub extends RandomGenerator {
  private double _nextDouble;
  private int _nextInt;

  public MyRandomStub(double d, int i) {
    _nextDouble = d;
    _nextInt = i;
  }

  public double nextDouble() {
    return _nextDouble;
  }

  public int nextInt() {
    return _nextInt;
  }

}
