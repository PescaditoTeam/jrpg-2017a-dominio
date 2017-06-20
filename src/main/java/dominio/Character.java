package dominio;

/**
 * @author Usuario
 * clase character que implementa peleable.
 */
public class Character implements Peleable {
  /**
 * atributo que representa la fuerza del character.
 */
protected int fuerza;
  /**
 * atributo que representa el nombre del character.
 */
protected String nombre;
  /**
 * atributo que representa el nivel del character.
 */
protected int nivel;

  public Mochila getMochila() {
	return mochila;
}


/**
 * atributo que representa la defensa del character.
 */
protected int defensa;
  /**
 * atributo que representa la salud del character.
 */
protected int salud;

  /**
 * construdcto por defecto.
 */
protected Mochila mochila;
public Character() {
	mochila = new Mochila();

  }

  /**
   * metodo ganar experiencia.
   * @param exp
   * .
   * @return
   * .
   */
  public boolean ganarExperiencia(final int exp) {
    return false;
  }

  /*
   * (non-Javadoc)
   *
   * @see dominio.Peleable#despuesDeTurno()
   */
  @Override
  public void despuesDeTurno() {
  }

  @Override
  public boolean estaVivo() {
    return salud > 0;
  }

  /**
   * @return devuelve la fuerza
   */
  public int getFuerza() {
    return fuerza;
  }

  /**
   * @param fuerza
   * .
   */
  public void setFuerza(final int fuerza) {
    this.fuerza = fuerza;
  }

  /*
   * (non-Javadoc)
   *
   * @see dominio.Peleable#getNombre() Devuelve el nombre del personaje
   * solicitado
   */
  @Override
  public String getNombre() {
    return nombre;
  }

  /**
 * metodo para setear el nombre.
 * @param nombre
 * .
 */
public void setNombre(final String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return devuelve el nivel del personaje
   */
  public int getNivel() {
    return nivel;
  }

  /**
   * @param nivel
   * .
   */
  public void setNivel(final int nivel) {
    this.nivel = nivel;
  }

  /**
   * @return devuelve la defensa del personaje
   */
  @Override
  public int getDefensa() {
    return defensa;
  }

  /**
   * @param defensa
   * .
   */
  @Override
  public void setDefensa(final int defensa) {
    this.defensa = defensa;
  }

  @Override
  public int serAtacado(final int daño) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getSalud() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int atacar(final Peleable atacado) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int otorgarExp() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getAtaque() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void setAtaque(final int ataque) {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean esPersonaje() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean esAfectadoPorHechizo() {
    // TODO Auto-generated method stub
    return false;
  }

}
