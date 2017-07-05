package dominio;

/**
 * Clase Mochila. Contiene los Items.
 *
 */
public class Mochila {

    /**
     * vector de inventario, representa cuantos items tiene el personaje
     * disponible de cada item existente.
     */
    private int[] inventario = {1, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /**
     * Constructor.
     */
    public Mochila() {
    }

    /**
     * @param item
     *            se agrega un item a la mochila
     */
    public void add(final Item item) {
        inventario[item.getId() - 1]++;
    }

    /**
     * @param idItem
     *            permite agregar un item al inventario.
     */
    public void add(final int idItem) {
        inventario[idItem]++;
    }

    /**
     * @param idItem
     *            permite sacar un item del inventario y eliminarlo.
     */
    public void sacar(final int idItem) {
        if (inventario[idItem] > 0) {
            inventario[idItem]--;
        }
    }

    /**
     * @return devuelve el Inventario.
     */
    public int[] getInventario() {
        return inventario;
    }
}
