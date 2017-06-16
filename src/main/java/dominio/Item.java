package dominio;

/**
 * Clase que contiene toda la informacion de un Item: su nombre y cuanto afecta a cada atributo.
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
	 * El porcentaje que va a aumentar o disminuir de Magia.
	 */
	private int valorMagia;
	/**
	 * El porcentaje que va a aumentar o disminuir de Fuerza.
	 */
	private int valorFuerza;
	
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param valorDefensa
	 * @param valorSalud
	 * @param valorEnergia
	 * @param valorDestreza
	 * @param valorInteligencia
	 * @param valorMagia
	 * @param valorFuerza
	 */
	public Item(int id, String nombre, int valorDefensa, int valorSalud, int valorEnergia, int valorDestreza,
			int valorInteligencia, int valorMagia, int valorFuerza) {
		this.id = id;
		this.nombre = nombre;
		this.valorDefensa = valorDefensa;
		this.valorSalud = valorSalud;
		this.valorEnergia = valorEnergia;
		this.valorDestreza = valorDestreza;
		this.valorInteligencia = valorInteligencia;
		this.valorMagia = valorMagia;
		this.valorFuerza = valorFuerza;
	}
	/**
	 * @return devuelve el valor de la Fuerza que modifica el Item.
	 */
	public int getValorFuerza() {
		return valorFuerza;
	}
	/**
	 * @param valorFuerza.
	 */
	public void setValorFuerza(int valorFuerza) {
		this.valorFuerza = valorFuerza;
	}
	/**
	 * @return devuelve el id del Item.
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return devuelve el nombre del Item.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return devuelve el valor de la Defensa que modifica el Item.
	 */
	public int getValorDefensa() {
		return valorDefensa;
	}
	/**
	 * @param valorDefensa.
	 */
	public void setValorDefensa(int valorDefensa) {
		this.valorDefensa = valorDefensa;
	}
	/**
	 * @return devuelve el valor de la Salud que modifica el Item.
	 */
	public int getValorSalud() {
		return valorSalud;
	}
	/**
	 * @param valorSalud.
	 */
	public void setValorSalud(int valorSalud) {
		this.valorSalud = valorSalud;
	}
	/**
	 * @return devuelve el valor de la Energia que modifica el Item.
	 */
	public int getValorEnergia() {
		return valorEnergia;
	}
	/**
	 * @param valorEnergia.
	 */
	public void setValorEnergia(int valorEnergia) {
		this.valorEnergia = valorEnergia;
	}
	/**
	 * @return devuelve el valor de la Destreza que modifica el Item.
	 */
	public int getValorDestreza() {
		return valorDestreza;
	}
	/**
	 * @param valorDestreza.
	 */
	public void setValorDestreza(int valorDestreza) {
		this.valorDestreza = valorDestreza;
	}
	/**
	 * @return devuelve el valor de la Inteligencia que modifica el Item.
	 */
	public int getValorInteligencia() {
		return valorInteligencia;
	}
	/**
	 * @param valorInteligencia.
	 */
	public void setValorInteligencia(int valorInteligencia) {
		this.valorInteligencia = valorInteligencia;
	}
	/**
	 * @return devuelve el valor de la Magia que modifica el Item.
	 */
	public int getValorMagia() {
		return valorMagia;
	}
	/**
	 * @param valorMagia.
	 */
	public void setValorMagia(int valorMagia) {
		this.valorMagia = valorMagia;
	}
	



}
