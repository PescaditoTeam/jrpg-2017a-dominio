package dominio;

import java.util.LinkedList;

/**
 * Alianza es la clase que une todos los personajes junto con sus aliados en una
 * lista en comun.
 *
 */
public class Alianza {

  /**
 * atributos de la clase alianza.
 */
private String nombre;


LinkedList<Personaje> aliados;

  /**
   * Constructo parametrizado.
   * @param nombre
   *      
   */
  public Alianza(String nombre) {
    this.nombre = nombre;
    this.aliados = new LinkedList<Personaje>();
  }

  /**
   * Devuelve una lista de personajes donde estan todos los aliados.
   */
  public LinkedList<Personaje> getAliados() {
	  LinkedList<Personaje> copia= new LinkedList<Personaje>();
			  for(Personaje p: aliados){
				  try {
					copia.add((Personaje)p.clone());
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
    return copia;
  }

  /**
   * @return devuelve el nombre
   */
  public String obtenerNombre() {
    return nombre;
  }

  /**
   * @param Elimina
   *          un personaje de la alianza
   */
  public void eliminarPersonaje(Personaje pj) {
    aliados.remove(pj);
  }

  /**
   * @param Personaje
   *          pj un personaje a la alianza
   * @return void
   */
  public void añadirPersonaje(Personaje pj) {
    aliados.add(pj);
  }
}
