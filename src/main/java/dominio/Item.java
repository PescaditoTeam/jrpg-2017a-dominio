package dominio;

public class Item {
	private int id; // id del item
	private String nombre; // nombre del item
	private String atributoAModificar; // el atributo de personaje que va a modificar le item
	private int valor; // el porcentaje que va a disminuir o aumentar del atributo del personaje

	public Item(int id, String nombre, String atributo, int valor) {
		this.id = id;
		this.nombre = nombre;
		this.atributoAModificar = atributo;
		this.valor = valor;
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

	public String getAtributoAModificar() {
		return atributoAModificar;
	}

	public void setAtributoAModificar(String atributoAModificar) {
		this.atributoAModificar = atributoAModificar;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}
