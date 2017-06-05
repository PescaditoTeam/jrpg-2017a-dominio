package dominio;

/**
 *
 * clase para replicar los datos de un personaje.
 */
/**
 * @author Usuario
 *
 */
/**
 * @author Usuario
 *
 */
public class DatosDePersonajeAReplicar {

	  /**
	 * atributo que hace referencia a la salud del personaje a replicar.
	 */
	private int salud; //*
	  /**
	 * atributo que hace referencia a la energia del personaje a replicar.
	 */
	private int energia; //*
	  /**
	 * atributo que hace referencia a la fuerza del personaje a replicar.
	 */
	private int fuerza; //*
	  /**
	 * atributo que hace referencia a la destreza del personaje a replicar.
	 */
	private int destreza; //*
	  /**
	 * atributo que hace referencia a la inteligencia a replicar.
	 */
	private int inteligencia; //*
	  /**
	 * atributo que hace referencia a la experiencia a replicar.
	 */
	private int experiencia; //*
	  /**
	 * atributo que hace referencia al nivel del personaje a replicar.
	 */
	private int nivel; //*
	  /**
	 * atributo que hace referencia al id del personaje a replicar.
	 */
	private int idPersonaje; //*
	  /**
	 * atributo que hace referencia a la defensa del personaje a replicar.
	 */
	private int defensa; //*
	  /**
	 * atributo que hace referencia a la salud tope a replicar.
	 */
	private int saludTope; //*
	  /**
	 * atributo que hace referencia a la energia tope a replicar.
	 */
	private int energiaTope; //*
	  /**
	 * atributo que hace referencia a la casta del personaje a replicar.
	 */
	private Casta casta; //*


	  /**
	 * @param salud
	 * .
	 * @param energia
	 * .
	 * @param fuerza
	 * .
	 * @param destreza
	 * .
	 * @param inteligencia
	 * .
	 * @param experiencia
	 * .
	 * @param nivel
	 * .
	 * @param idPersonaje
	 * .
	 * @param defensa
	 * .
	 * @param saludTope
	 * .
	 * @param energiaTope
	 * .
	 * @param casta
	 * .
	 */
	public DatosDePersonajeAReplicar(final int salud, final int energia, final int fuerza, final int destreza, final int inteligencia,
			final int experiencia, final int nivel, final int idPersonaje, final int defensa, final int saludTope, final int energiaTope, final Casta casta) {
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
	  /**
	   * @param nuevasalud
	   * se requiere de la nueva salud y la nueva energia.
	   * @param nuevaenergia
	   * constructor parametrizado.
	 */
	public DatosDePersonajeAReplicar(final int nuevasalud, final int nuevaenergia) {
		  salud = nuevasalud;
		  energia = nuevaenergia;

	}
	/**
	 * @param p
	 * metodo para empaquetar los datos del personaje p.
	 */
	public void empaquetarDatos(final Personaje p) {
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
	/**
	 * @return
	 * getter de salud.
	 */
	public int getSalud() {
		return salud;
	}
	/**
	 * @param salud
	 * setter de salud.
	 */
	public void setSalud(final int salud) {
		this.salud = salud;
	}
	/**
	 * @return
	 * getter de energia.
	 */
	public int getEnergia() {
		return energia;
	}
	/**
	 * @param energia
	 * setter de energia.
	 */
	public void setEnergia(final int energia) {
		this.energia = energia;
	}
	/**
	 * @return
	 * getter de fuerza.
	 */
	public int getFuerza() {
		return fuerza;
	}
	/**
	 * @param fuerza
	 * setter de fuerza.
	 */
	public void setFuerza(final int fuerza) {
		this.fuerza = fuerza;
	}
	/**
	 * @return
	 * getter de destreza.
	 */
	public int getDestreza() {
		return destreza;
	}
	/**
	 * @param destreza
	 * setter de destreza.
	 */
	public void setDestreza(final int destreza) {
		this.destreza = destreza;
	}
	/**
	 * @return
	 * getter de inteligencia.
	 */
	public int getInteligencia() {
		return inteligencia;
	}
	/**
	 * @param inteligencia
	 * setter de inteligencia.
	 */
	public void setInteligencia(final int inteligencia) {
		this.inteligencia = inteligencia;
	}
	/**
	 * @return
	 * getter de experiencia.
	 */
	public int getExperiencia() {
		return experiencia;
	}
	/**
	 * @param experiencia
	 * setter de experiencia.
	 */
	public void setExperiencia(final int experiencia) {
		this.experiencia = experiencia;
	}
	/**
	 * @return
	 * getter de casta
	 */
	public Casta getCasta() {
		return casta;
	}
	/**
	 * @param casta
	 * setter de casta.
	 */
	public void setCasta(final Casta casta) {
		this.casta = casta;
	}
	/**
	 * @return
	 * getter de nievl.
	 */
	public int getNivel() {
		return nivel;
	}
	/**
	 * @param nivel
	 * setter de nivel.
	 */
	public void setNivel(final int nivel) {
		this.nivel = nivel;
	}
	/**
	 * @return
	 * getter del id.
	 */
	public int getIdPersonaje() {
		return idPersonaje;
	}
	/**
	 * @param idPersonaje
	 * setter de personaje.
	 */
	public void setIdPersonaje(final int idPersonaje) {
		this.idPersonaje = idPersonaje;
	}
	/**
	 * @return
	 * getter de defensa.
	 */
	public int getDefensa() {
		return defensa;
	}
	/**
	 * @param defensa
	 * setter de defensa.
	 */
	public void setDefensa(final int defensa) {
		this.defensa = defensa;
	}
	/**
	 * @return
	 * getter de la salud tope.
	 */
	public int getSaludTope() {
		return saludTope;
	}
	/**
	 * @param saludTope
	 * setter de la salud tope.
	 */
	public void setSaludTope(final int saludTope) {
		this.saludTope = saludTope;
	}
	/**
	 * @return
	 * getter de la energia tope.
	 */
	public int getEnergiaTope() {
		return energiaTope;
	}
	/**
	 * @param energiaTope
	 * setter de la energia tope.
	 */
	public void setEnergiaTope(final int energiaTope) {
		this.energiaTope = energiaTope;
	}

  
	  
}
