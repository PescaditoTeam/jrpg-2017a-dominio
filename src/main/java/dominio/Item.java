package dominio;

/**
 * Clase que contiene toda la informacion de un Item: su nombre y cuanto afecta
 * a cada atributo.
 *
 */

public class Item {
    /**
     * id del Item.
     */
    private int id;
    /**
     * Nombre del Item.
     */
    private String nombre;
    /**
     * El porcentaje que va a aumentar o disminuir de Defensa.
     */
    private int valorDefensa;
    /**
     * El porcentaje que va a aumentar o disminuir de Salud.
     */
    private int valorSalud;
    /**
     * El porcentaje que va a aumentar o disminuir de Energia.
     */
    private int valorEnergia;
    /**
     * El porcentaje que va a aumentar o disminuir de Destreza.
     */
    private int valorDestreza;
    /**
     * El porcentaje que va a aumentar o disminuir de Inteligencia.
     */
    private int valorInteligencia;
    /**
     * El porcentaje que va a aumentar o disminuir de Fuerza.
     */
    private int valorFuerza;

    /**
     * @param id
     *            .
     * @param nom
     *            .
     * @param Defensa
     *            .
     * @param Salud
     *            .
     * @param Energia
     *            .
     * @param Destreza
     *            .
     * @param Inteligencia
     *            .
     * @param Fuerza
     *            .
     */
    public Item(final int id, final String nom, final int Defensa,
            final int Salud, final int Energia,
            final int Destreza, final int Inteligencia,
            final int Fuerza) {
        this.id = id;
        this.nombre = nom;
        this.valorDefensa = Defensa;
        this.valorSalud = Salud;
        this.valorEnergia = Energia;
        this.valorDestreza = Destreza;
        this.valorInteligencia = Inteligencia;
        this.valorFuerza = Fuerza;
    }

    /**
     * @param item
     *            constructor parametrizado para la clase Item.
     */
    public Item(final Item item) {
        this.id = item.id;
        this.nombre = item.nombre;
        this.valorDefensa = item.valorDefensa;
        this.valorSalud = item.valorSalud;
        this.valorEnergia = item.valorEnergia;
        this.valorDestreza = item.valorDestreza;
        this.valorInteligencia = item.valorInteligencia;
        this.valorFuerza = item.valorFuerza;
    }

    /**
     * constructor por defecto de prueba.
     */
    public Item() {
        nombre = "nombrePrueba";
    }

    /**
     * @return devuelve el valor de la Fuerza que modifica el Item.
     */
    public int getValorFuerza() {
        return valorFuerza;
    }

    /**
     * @param valorFuerza
     *            .
     */
    public void setValorFuerza(final int valorFuerza) {
        this.valorFuerza = valorFuerza;
    }

    /**
     * @return devuelve el id del Item.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id1
     *            .
     */
    public void setId(final int id1) {
        this.id = id1;
    }

    /**
     * @return devuelve el nombre del Item.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     *            .
     */
    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return devuelve el valor de la Defensa que modifica el Item.
     */
    public int getValorDefensa() {
        return valorDefensa;
    }

    /**
     * @param valorDefensa
     *            .
     */
    public void setValorDefensa(final int valorDefensa) {
        this.valorDefensa = valorDefensa;
    }

    /**
     * @return devuelve el valor de la Salud que modifica el Item.
     */
    public int getValorSalud() {
        return valorSalud;
    }

    /**
     * @param valorSalud
     *            .
     */
    public void setValorSalud(final int valorSalud) {
        this.valorSalud = valorSalud;
    }

    /**
     * @return devuelve el valor de la Energia que modifica el Item.
     */
    public int getValorEnergia() {
        return valorEnergia;
    }

    /**
     * @param valorEnergia
     *            .
     */
    public void setValorEnergia(final int valorEnergia) {
        this.valorEnergia = valorEnergia;
    }

    /**
     * @return devuelve el valor de la Destreza que modifica el Item.
     */
    public int getValorDestreza() {
        return valorDestreza;
    }

    /**
     * @param valorDestreza
     *            .
     */
    public void setValorDestreza(final int valorDestreza) {
        this.valorDestreza = valorDestreza;
    }

    /**
     * @return devuelve el valor de la Inteligencia que modifica el Item.
     */
    public int getValorInteligencia() {
        return valorInteligencia;
    }

    /**
     * @param valorInteligencia
     *            .
     */
    public void setValorInteligencia(final int valorInteligencia) {
        this.valorInteligencia = valorInteligencia;
    }

}
