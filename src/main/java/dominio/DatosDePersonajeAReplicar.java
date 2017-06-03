package dominio;

public class DatosDePersonajeAReplicar {
	
	  protected int salud; //*
	  protected int energia; //*
	  protected int fuerza; //*
	  protected int destreza;//*
	  protected int inteligencia;//*
	  protected int experiencia;//*
	  protected int nivel;//*
	  protected int idPersonaje;//*
	  protected int defensa;//*
	  protected int saludTope;//*
	  protected int energiaTope;//*
	  protected Casta casta;//*
	  

	  
	  public DatosDePersonajeAReplicar(int salud, int energia, int fuerza, int destreza, int inteligencia,
			int experiencia, int nivel, int idPersonaje, int defensa, int saludTope, int energiaTope, Casta casta) {
		super();
		this.salud = salud;
		this.energia = energia;
		this.fuerza = fuerza;
		this.destreza = destreza;
		this.inteligencia = inteligencia;
		this.experiencia = experiencia;
		this.nivel = nivel;
		this.idPersonaje = idPersonaje;
		this.defensa = defensa;
		this.saludTope = saludTope;
		this.energiaTope = energiaTope;
		this.casta = casta;
	}
	  public DatosDePersonajeAReplicar(int nuevasalud, int nuevaenergia) {
		  salud = nuevasalud;
		  energia = nuevaenergia;
		
	}
	public void empaquetarDatos(Personaje p){
		this.salud = p.getSalud();
		this.energia = p.getEnergia();
		this.fuerza = p.getFuerza();
		this.destreza = p.getDestreza();
		this.inteligencia = p.getInteligencia();
		this.experiencia = p.getExperiencia();
		this.nivel = p.getNivel();
		this.idPersonaje = p.getIdPersonaje();
		this.defensa = p.getDefensa();
		this.saludTope = p.saludTope;
		this.energiaTope = p.energiaTope;
		this.casta = p.getCasta();
	}
	//----------------------------
	  //Getters Setters.
	  //----------------------------
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public Casta getCasta() {
		return casta;
	}
	public void setCasta(Casta casta) {
		this.casta = casta;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getIdPersonaje() {
		return idPersonaje;
	}
	public void setIdPersonaje(int idPersonaje) {
		this.idPersonaje = idPersonaje;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getSaludTope() {
		return saludTope;
	}
	public void setSaludTope(int saludTope) {
		this.saludTope = saludTope;
	}
	public int getEnergiaTope() {
		return energiaTope;
	}
	public void setEnergiaTope(int energiaTope) {
		this.energiaTope = energiaTope;
	}

  
	  
}
