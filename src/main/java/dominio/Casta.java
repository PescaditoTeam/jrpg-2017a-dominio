package dominio;

import java.io.Serializable;

/**
 * Es la clase que une a los tipos de razas (asesino, guerrero, hechicero), con
 * sus metodos correspondientes a utilizar.
 *
 */
public abstract class Casta implements Serializable {
  protected double probabilidadGolpeCritico;
  protected double probabilidadEvitarDa�o;
  protected double da�oCritico;
  protected String nombreCasta;

  protected String[] habilidadesCasta;

  /**
   * Constructor por defecto
   */
  public Casta() {
    this.probabilidadGolpeCritico = 0.2;
    this.probabilidadEvitarDa�o = 0.2;
    this.da�oCritico = 1.5;
  }

  /**
   * @param prob_crit
   * @param evasion
   * @param da�o_crit
   */
  public Casta(double prob_crit, double evasion, double da�o_crit) {
    this.probabilidadGolpeCritico = prob_crit;
    this.probabilidadEvitarDa�o = evasion;
    this.da�oCritico = da�o_crit;
  }

  public abstract boolean habilidad1(Personaje caster, Peleable atacado);

  public abstract boolean habilidad2(Personaje caster, Peleable atacado);

  public abstract boolean habilidad3(Personaje caster, Peleable atacado);

  /**
   * @return Devuelve el nombre de la Casta pedido
   */
  public String getNombreCasta() {
    return this.nombreCasta;
  }

  /**
   * @return Devuelve las habilidades que posee dicha casta, en formato String[]
   */
  /**
   * @return devuelve todas las habilidades de la casta
   */
  public String[] getHabilidadesCasta() {
    return habilidadesCasta;
  }

  /**
   * @return devuelve la probabilidad de golpe critico
   */
  public double getProbabilidadGolpeCritico() {
    return probabilidadGolpeCritico;
  }

  /**
   * @param probabilidadGolpeCritico
   */
  public void setProbabilidadGolpeCritico(double probabilidadGolpeCritico) {
    this.probabilidadGolpeCritico = probabilidadGolpeCritico;
  }

  /**
   * @return devuelve la probabilidad de Evitar Da�o
   */
  public double getProbabilidadEvitarDa�o() {
    return probabilidadEvitarDa�o;
  }

  /**
   * @param probabilidadEvitarDa�o
   */
  public void setProbabilidadEvitarDa�o(double probabilidadEvitarDa�o) {
    this.probabilidadEvitarDa�o = probabilidadEvitarDa�o;
  }

  /**
   * @return devuelve el da�o critico
   */
  public double getDa�oCritico() {
    return da�oCritico;
  }

  /**
   * @param da�oCritico
   */
  public void setDa�oCritico(double da�oCritico) {
    this.da�oCritico = da�oCritico;
  }
}
