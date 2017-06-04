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

	/**
	 * lista de personajes de la alianza.
	 */
	private LinkedList<Personaje> aliados;

	/**
	 *
	 * @param
	 * Constructor parametizado.
	 */
	public Alianza(final String nombre) {
		this.nombre = nombre;
		this.aliados = new LinkedList<Personaje>();
	}

	/**
	 * @return
	 * Devuelve una lista de personajes donde estan todos los aliados.
	 */
	public LinkedList<Personaje> getAliados() {
		LinkedList<Personaje> copia = new LinkedList<Personaje>();
		for (Personaje p : aliados) {
			try {
				copia.add((Personaje) p.clone());
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
	 * @param
	 * Elimina un personaje de la alianza.
	 */
	public void eliminarPersonaje(final Personaje pj) {
		aliados.remove(pj);
	}

	/**
	 * @param
	 * Personaje pj un personaje a la alianza.
	 *
	 */
	public void añadirPersonaje(final Personaje pj) {
		aliados.add(pj);
	}
}
