package dominio;

public class Item {
	private int id; // id del item
	private String nombre; // nombre del item
	private int valorDefensa; // el atributo de personaje que va a modificar le item
	private int valorSalud; // el porcentaje que va a disminuir o aumentar del atributo del personaje
	private int valorEnergia;
	private int valorDestreza;
	private int valorInteligencia;
	private int valorMagia;
	private int valorFuerza;
	
	
	
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
	public int getValorFuerza() {
		return valorFuerza;
	}
	public void setValorFuerza(int valorFuerza) {
		this.valorFuerza = valorFuerza;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getValorDefensa() {
		return valorDefensa;
	}
	public void setValorDefensa(int valorDefensa) {
		this.valorDefensa = valorDefensa;
	}
	public int getValorSalud() {
		return valorSalud;
	}
	public void setValorSalud(int valorSalud) {
		this.valorSalud = valorSalud;
	}
	public int getValorEnergia() {
		return valorEnergia;
	}
	public void setValorEnergia(int valorEnergia) {
		this.valorEnergia = valorEnergia;
	}
	public int getValorDestreza() {
		return valorDestreza;
	}
	public void setValorDestreza(int valorDestreza) {
		this.valorDestreza = valorDestreza;
	}
	public int getValorInteligencia() {
		return valorInteligencia;
	}
	public void setValorInteligencia(int valorInteligencia) {
		this.valorInteligencia = valorInteligencia;
	}
	public int getValorMagia() {
		return valorMagia;
	}
	public void setValorMagia(int valorMagia) {
		this.valorMagia = valorMagia;
	}
	



}
