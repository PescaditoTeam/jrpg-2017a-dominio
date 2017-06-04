package dominio;

/**
 * Clase Peleable Esta clase contiene la definicion de los metodos y funciones
 * que van a utilizar la clase Personaje y NonPlayableCharacter Son las
 * funciones principales.
 *
 */
public interface Peleable {
  /**
 * @param daño
 * .
 * @return
 * .
 */
int serAtacado(int daño);

  /**
 * @return
 * .
 */
int getSalud();

  /**
 *
 */
void despuesDeTurno();

  /**
 * @param atacado
 * .
 * @return
 * .
 */
int atacar(Peleable atacado);

  /**
 * @return
 * .
 */
int otorgarExp();

  /**
 * @return
 * .
 */
int getAtaque();

  /**
 * @param ataque
 * .
 */
void setAtaque(int ataque);

  /**
 * @return
 * .
 */
boolean estaVivo();

  /**
 * @return
 * .
 */
String getNombre();

  /**
 * @return
 * .
 */
int getDefensa();

  /**
 * @param defensa
 * .
 */
void setDefensa(int defensa);

  /**
 * @return
 * .
 */
boolean esPersonaje();

  /**
 * @return
 * .
 */
boolean esAfectadoPorHechizo();

}
