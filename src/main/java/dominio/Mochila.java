package dominio;

/**
 * Clase Mochila. Contiene los Items.
 *
 */
public class Mochila {
	
	/**
	 * vector de inventario, representa cuantos items tiene el personaje disponible
	 * de cada item existente.
	 */
	private int[] inventario = {1,0,0,0,0,0,0,0,0,1};
	
	/**
	 * Constructor.
	 */
	public Mochila(){
	}
	
	/**
	 * @param item
	 * se agrega un item a la mochila
	 */
	public void add (Item item){
		inventario[item.getId() - 1]++;
	}

	/**
	 * @return devuelve el Inventario.
	 */
	public int[] getInventario() {
		return inventario;
	}	
}
