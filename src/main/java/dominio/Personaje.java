package dominio;

import java.io.Serializable;

/**
 * Personaje. Siendo una de las clases mas importantes, es la que une a todos
 * los tipos de personajes En ella se encuentran todos los atributos y metodos
 * apropiados para tener todo en cuenta.
 *
 */
/**
 * @author Usuario
 *
 */
/**
 * @author Usuario
 *
 */
/**
 * @author Usuario
 *
 */
/**
 * @author Usuario
 *
 */
public abstract class Personaje extends Character
        implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    /**
     * energia del personaje.
     */
    protected int energia;
    /**
     * ataque del personaje.
     */
    protected int ataque; // depende de la fuerza
    /**
     * magia del personaje.
     */
    protected int magia; // depende de la inteligencia
    /**
     * nombre de la raza.
     */
    protected String nombreRaza;
    /**
     * saludo maxima del personaje.
     */
    protected int saludTope;
    /**
     * energia maxima del personaje.
     */
    protected int energiaTope;
    /**
     * destreza del personaje.
     */
    protected int destreza;
    /**
     * inteligencia del personaje.
     */
    protected int inteligencia;
    /**
     * casta a la cual pertenece el personaje.
     */
    protected Casta casta;
    /**
     * posicion X en el mapa del personaje.
     */
    protected int posX;
    /**
     * posicion y en el mapa del personaje.
     */
    protected int posY;
    /**
     * experiencia del personaje.
     */
    protected int experiencia;
    /**
     * id del personaje.
     */
    protected int idPersonaje;
    /**
     * alianza del personaje.
     */
    protected Alianza clan = null;
    /**
     * niveles del personaje.
     */
    public static int[] tablaDeNiveles;

    /**
     * Constante usada para sacar porcentajes.
     */
    private static final int CIEN = 100;
    /**
     * habilidades del personaje.
     */
    protected String[] habilidadesRaza;

    /**
     * getHabilidadesRaza().
     *
     * @return Retorna las habilidades de la raza, en formato de String[]
     */
    public String[] getHabilidadesRaza() {
        return habilidadesRaza;
    }

    /**
     * getHabilidadesCasta().
     *
     * @return Retorna las habilidades de la casta, en formato de String[]
     */
    public String[] getHabilidadesCasta() {
        return casta.getHabilidadesCasta();
    }

    /**
     * cargarTablaNivel().
     *
     */
    public static void cargarTablaNivel() {
        Personaje.tablaDeNiveles = new int[101];
        Personaje.tablaDeNiveles[0] = 0;
        Personaje.tablaDeNiveles[1] = 0;
        for (int i = 2; i < 101; i++) {
            Personaje.tablaDeNiveles[i] = Personaje.tablaDeNiveles[i - 1] + 50;
        }
    }

    /**
     * Personaje(String, Casta, int).
     *
     * @param nombre
     *            nombre del personaje.
     * @param casta
     *            casta a la cual pertenece.
     * @param id
     *            identificador.
     * @param nomRaza
     *            nombre de la raza.
     * @param hab1
     *            habilidad 1.
     * @param hab2
     *            habilidad 2.
     */
    public Personaje(final String nombre, final Casta casta, final int id,
            final String nomRaza, final String hab1, final String hab2) {

        super();
        this.nombre = nombre;
        this.casta = casta;
        this.idPersonaje = id;
        experiencia = 0;
        nivel = 1;
        fuerza = 10;
        inteligencia = 10;
        destreza = 10;

        fuerza += casta.addFuerzaInicial();
        inteligencia += casta.addInteligenciaInicial();
        destreza += casta.addDestrezaInicial();

        posX = 0;
        posY = 0;
        saludTope = CIEN;
        energiaTope = CIEN;

        ataque = this.calcularPuntosDeAtaque();
        defensa = this.calcularPuntosDeDefensa();
        magia = this.calcularPuntosDeMagia();
        nombreRaza = nomRaza;

        habilidadesRaza = new String[2];
        habilidadesRaza[0] = hab1;
        habilidadesRaza[1] = hab2;

    }

    /**
     * Personaje().
     *
     * @param nombre
     *            nombre del personaje.
     * @param salud
     *            salud inicial.
     * @param energia
     *            energia inicial.
     * @param fuerza
     *            fuerza inicial.
     * @param destreza
     *            destreza inicial.
     * @param inteligencia
     *            inteligencia inicial.
     * @param casta
     *            casta a la que pertenece.
     * @param experiencia
     *            experiencia inicial.
     * @param nivel
     *            nivel inicial.
     * @param idPersonaje
     *            identificador del personaje.
     * @param nomRaza
     *            nombre de la raza.
     * @param hab1
     *            habilidad 1 del personaje.
     * @param hab2
     *            habilidad 2 del personaje.
     * @param mochila
     *            mochila del personaje.
     */
    public Personaje(final String nombre, final int salud, final int energia,
            final int fuerza, final int destreza, final int inteligencia,
            final Casta casta, final int experiencia, final int nivel,
            final int idPersonaje, final String nomRaza, final String hab1,
            final String hab2, final Mochila mochila) {

        super();
        this.nombre = nombre;
        this.salud = salud;
        this.energia = energia;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.casta = casta;
        this.experiencia = experiencia;
        this.nivel = nivel;

        this.saludTope = this.salud;
        this.energiaTope = this.energia;

        this.idPersonaje = idPersonaje;
        this.defensa = this.calcularPuntosDeDefensa();
        this.ataque = this.calcularPuntosDeAtaque();
        this.magia = this.calcularPuntosDeMagia();
        nombreRaza = nomRaza;
        this.mochila = mochila;
        habilidadesRaza = new String[2];
        habilidadesRaza[0] = hab1;
        habilidadesRaza[1] = hab2;
    }

    /**
     * @param nombre
     *            .
     * @param salud
     *            .
     * @param energia
     *            .
     * @param fuerza
     *            .
     * @param destreza
     *            .
     * @param inteligencia
     *            .
     * @param casta
     *            .
     * @param experiencia
     *            .
     * @param nivel
     *            .
     * @param idPersonaje
     *            .
     * @param nomRaza
     *            .
     * @param hab1
     *            .
     * @param hab2
     *            .
     */
    public Personaje(final String nombre, final int salud, final int energia,
            final int fuerza, final int destreza, final int inteligencia,
            final Casta casta, final int experiencia, final int nivel,
            final int idPersonaje, final String nomRaza, final String hab1,
            final String hab2) {

        super();
        this.nombre = nombre;
        this.salud = salud;
        this.energia = energia;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.casta = casta;
        this.experiencia = experiencia;
        this.nivel = nivel;

        this.saludTope = this.salud;
        this.energiaTope = this.energia;

        this.idPersonaje = idPersonaje;
        this.defensa = this.calcularPuntosDeDefensa();
        this.ataque = this.calcularPuntosDeAtaque();
        this.magia = this.calcularPuntosDeMagia();
        nombreRaza = nomRaza;
        habilidadesRaza = new String[2];
        habilidadesRaza[0] = hab1;
        habilidadesRaza[1] = hab2;
    }

    /**
     * @return devuelve el nombre de la raza
     */
    public String getNombreRaza() {
        return nombreRaza;
    }

    /**
     * @param nombreRaza
     *            .
     */
    public void setNombreRaza(final String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    /*
     * (non-Javadoc)
     *
     * @see dominio.Peleable#getAtaque()
     */
    @Override
    public int getAtaque() {
        return ataque;
    }

    /*
     * (non-Javadoc)
     *
     * @see dominio.Peleable#setAtaque(int)
     */
    @Override
    public void setAtaque(final int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return devuelve la magia
     */
    public int getMagia() {
        return magia;
    }

    /**
     * @param magia
     *            .
     */
    public void setMagia(final int magia) {
        this.magia = magia;
    }

    /**
     * @return devuelve el clan
     */
    public Alianza getClan() {
        return clan;
    }

    /**
     * @param clan
     *            .
     */
    public void setClan(final Alianza clan) {
        this.clan = clan;
        clan.añadirPersonaje(this);
    }

    /*
     * (non-Javadoc)
     *
     * @see dominio.Peleable#getSalud()
     */
    @Override
    public int getSalud() {
        return salud;
    }

    /**
     * @return devuelve la energia
     */
    public int getEnergia() {
        return energia;
    }

    /**
     * @param energia
     *            .
     */
    public void setEnergia(final int energia) {
        this.energia = energia;
    }

    /**
     * @return devuelve la destreza
     */
    public int getDestreza() {
        return destreza;
    }

    /**
     * @param destreza
     *            .
     */
    public void setDestreza(final int destreza) {
        this.destreza = destreza;
    }

    /**
     * @return devuelve la inteligencia
     */
    public int getInteligencia() {
        return inteligencia;
    }

    /**
     * @param inteligencia
     *            .
     */
    public void setInteligencia(final int inteligencia) {
        this.inteligencia = inteligencia;
    }

    /**
     * @return devuelve la casta a la que pertenece el personaje
     */
    public Casta getCasta() {
        return casta;
    }

    /**
     * @param casta
     *            .
     */
    public void setCasta(final Casta casta) {
        this.casta = casta;
    }

    /**
     * @return devuelve la experiencia del personaje
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * @param experiencia
     *            .
     */
    public void setExperiencia(final int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * @return devuelve el nivel
     */
    @Override
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel
     *            .
     */
    @Override
    public void setNivel(final int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return devuelve el id del personaje
     */
    public int getIdPersonaje() {
        return idPersonaje;
    }

    /**
     * @param idPersonaje
     *            .
     */
    public void setIdPersonaje(final int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    /**
     * @return devuelve la defensa del personaje
     */
    @Override
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa
     *            .
     */
    @Override
    public void setDefensa(final int defensa) {
        this.defensa = defensa;
    }

    /**
     * @return devuelve el tope de salud
     */
    public int getSaludTope() {
        return saludTope;
    }

    /**
     * @param saludTope
     *            .
     */
    public void setSaludTope(final int saludTope) {
        this.saludTope = saludTope;
    }

    /**
     * @return devuelve el tope de energia
     */
    public int getEnergiaTope() {
        return energiaTope;
    }

    /**
     * @param energiaTope
     *            .
     */
    public void setEnergiaTope(final int energiaTope) {
        this.energiaTope = energiaTope;
    }

    /*
     * (non-Javadoc)
     *
     * @see dominio.Peleable#atacar(dominio.Peleable)
     */
    @Override
    public int atacar(final Peleable atacado) {
        if (salud == 0) {
            return 0;
        }
        if (atacado.getSalud() > 0) {
            MyRandom mr = new MyRandom();
            if (mr.obtenerAleatorioMenorQue(
                    5) <= (this.casta.getProbabilidadGolpeCritico()
                            + (this.destreza / 1000))) {
                return atacado.serAtacado(this.golpe_critico());
            } else {
                return atacado.serAtacado(this.ataque);
            }
        }
        return 0;
    }

    /**
     * @return devuelve el valor del golpe critico
     */
    public int golpe_critico() {
        return (int) (this.ataque * this.getCasta().getDañoCritico());
    }

    /**
     * @return devuelve si puede atacar o no
     */
    public boolean puedeAtacar() {
        return energia > 10; // En el CT cuando esta asi probar por V y por F
                             // siempre para tener luz verde
    }

    /**
     * @return devuelve los puntos de ataque
     */
    public int calcularPuntosDeAtaque() {
        return (int) (this.getFuerza() * 1.5);
    }

    /**
     * @return devuelve los puntos de defensa
     */
    public int calcularPuntosDeDefensa() {
        return (this.getDestreza());
    }

    /**
     * @return devuelve los puntos de magia
     */
    public int calcularPuntosDeMagia() {
        return (int) (this.getInteligencia() * 1.5);
    }

    /**
     * Reestablece la salud del personaje.
     */
    public void restablecerSalud() {
        this.salud = this.saludTope;
    }

    /**
     * Reestablece la energia del personaje.
     */
    public void restablecerEnergia() {
        this.energia = this.energiaTope;
    }

    /**
     * modificarAtributos().
     *
     */
    public void modificarAtributos() {
        this.ataque = this.calcularPuntosDeAtaque();
        this.defensa = this.calcularPuntosDeDefensa();
        this.magia = this.calcularPuntosDeMagia();
    }

    /*
     * (non-Javadoc)
     *
     * @see dominio.Peleable#serAtacado(int)
     */
    @Override
    public int serAtacado(int daño) {
        MyRandom mr = new MyRandom();
        if (mr.obtenerAleatorioMenorQue(5) >= this.getCasta()
                .getProbabilidadEvitarDaño()) {
            daño -= this.defensa;

            if (daño > 0) {
                if (salud <= daño) {
                    daño = salud;
                    salud = 0;
                } else {
                    salud -= daño;
                }
                return daño;
            }

            return 0;
        }
        return 0;
    }

    /**
     * serRobadoSalud(int danio).
     *
     * @param daño
     *            da�o producido
     * @return da�o restante?_verificar
     */
    public int serRobadoSalud(int daño) {
        daño -= this.defensa;
        if (daño <= 0) {
            return 0;
        }
        if ((salud - daño) >= 0) {
            salud -= daño;
        } else {
            daño = salud; // le queda menos salud que el da�o inflingido
            salud = 0;
        }
        return daño;
    }

    /**
     * serDesenergizado(int daño).
     *
     * @param daño
     *            daño a producir ?
     * @return daño producido?
     */
    public int serDesernegizado(int daño) {
        daño -= this.defensa;
        if (daño <= 0) {
            return 0;
        }
        if ((energia - daño) >= 0) {
            energia -= daño;
        } else {
            daño = energia; // le queda menos energia que el daño inflingido
            energia = 0;
        }
        return daño;
    }

    /**
     * serCurado(int Salud).
     *
     * @param salud
     *            salud final.
     */
    public void serCurado(final int salud) {
        if ((this.salud + salud) <= this.saludTope) {
            this.salud += salud;
        } else {
            this.salud = this.saludTope;
        }
    }

    /**
     * serEnergizado(int energia).
     *
     * @param energia
     *            energia recibida.
     */
    public void serEnergizado(final int energia) {
        if ((this.energia + energia) <= this.energiaTope) {
            this.energia += energia;
        } else {
            this.energia = this.energiaTope;
        }
    }

    /**
     * crearAlianza(string nombre_alianza).
     *
     * @param nombreAlianza
     *            nombre de la alianza.
     */
    public void crearAlianza(final String nombreAlianza) {
        this.clan = new Alianza(nombreAlianza);
        this.clan.añadirPersonaje(this);
    }

    /**
     * salirDeAlianza(). Pone el clan de alianza en null
     *
     */
    public void salirDeAlianza() {
        if (this.clan != null) {
            this.clan.eliminarPersonaje(this);
            this.clan = null;
        }
    }

    /**
     * aliar(Personaje).
     *
     * @param nuevoAliado
     *            personaje con el cual se alia.
     * @return true or false si pudo aliarse
     */
    public boolean aliar(final Personaje nuevoAliado) {
        if (this.clan == null) {
            Alianza a = new Alianza("Alianza 1");
            this.clan = a;
            a.añadirPersonaje(this);
        }

        if (nuevoAliado.clan == null) {
            nuevoAliado.clan = this.clan;
            this.clan.añadirPersonaje(nuevoAliado);
            return true;
        } else {
            return false;
        }
    }

    /**
     * AsignarPuntosSkills(int, int, int).
     *
     * @param fuerza
     *            de skills.
     * @param destreza
     *            de skills.
     * @param inteligencia
     *            de skills.
     */
    public void asignarPuntosSkills(final int fuerza, final int destreza,
            final int inteligencia) {
        if ((this.fuerza + fuerza) <= 200) {
            this.fuerza += fuerza;
        }
        if ((this.destreza + destreza) <= 200) {
            this.destreza += destreza;
        }
        if ((this.inteligencia + inteligencia) <= 200) {
            this.inteligencia += inteligencia;
        }
        this.modificarAtributos();
    }

    /**
     * subirNivel().
     *
     */
    public void subirNivel() {

        int acumuladorExperiencia = 0;
        if (this.nivel == CIEN) {
            return;
        }
        while ((this.nivel != CIEN)
                && (this.experiencia >= (Personaje.tablaDeNiveles[this.nivel
                        + 1] + acumuladorExperiencia))) {
            acumuladorExperiencia += Personaje.tablaDeNiveles[this.nivel + 1];
            this.nivel++;
            this.modificarAtributos();
            this.saludTope += 25;
            this.energiaTope += 20;
        }
        this.experiencia -= acumuladorExperiencia;
    }

    /**
     * ganarExperiencia(int exp).
     *
     * @param exp
     *            experiencia ganada.
     * @return true or false si se pudo aplicar la experiencia
     */
    @Override
    public boolean ganarExperiencia(final int exp) {
        this.experiencia += exp;

        if (experiencia >= Personaje.tablaDeNiveles[this.nivel + 1]) {
            subirNivel();
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see dominio.Peleable#otorgarExp()
     */
    @Override
    public int otorgarExp() {
        return this.nivel * 40;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#clone()
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * distanciaCon.
     *
     * @param p
     *            .
     * @return calcula la distancia
     */
    public double distanciaCon(final Personaje p) {
        return Math.sqrt(Math.pow(this.posX - p.posX, 2)
                + Math.pow(this.posY - p.posY, 2));
    }

    /**
     * @param atacado
     *            .
     * @return devuelve la habilidad de la casta 1
     */
    public boolean habilidadCasta1(final Peleable atacado) {
        return this.getCasta().habilidad1(this, atacado);
    }

    /**
     * @param atacado
     *            .
     * @return devuelve la habilidad de la casta 2
     */
    public boolean habilidadCasta2(final Peleable atacado) {
        return this.getCasta().habilidad2(this, atacado);
    }

    /**
     * @param atacado
     *            .
     * @return devuelve la habilidad de la casta 3
     */
    public boolean habilidadCasta3(final Peleable atacado) {
        return this.getCasta().habilidad3(this, atacado);
    }

    /*
     * avisa que sobre el cual trabajamos es un personaje.
     */
    @Override
    public boolean esPersonaje() {
        return true;
    }

    /**
     * @param atacado
     *            .
     * @return .
     */
    public abstract boolean habilidadRaza1(Peleable atacado);

    /**
     * @param atacado
     *            .
     * @return .
     */
    public abstract boolean habilidadRaza2(Peleable atacado);

    /**
     * @param item
     *            efectuamos en la batalla el item que recibimos.
     */
    public void efectuarItem(final Item item) {
        int saludnueva = salud + salud * item.getValorSalud() / CIEN;
        if (saludnueva > saludTope) {
            salud = saludTope;
        } else {
            salud = saludnueva;
        }
        int energianueva = energia + energia * item.getValorEnergia() / CIEN;
        if (energianueva > energiaTope) {
            energia = energiaTope;
        } else {
            energia = energianueva;
        }
        destreza = destreza + destreza * item.getValorDestreza() / CIEN;
        inteligencia = inteligencia
                + inteligencia * item.getValorInteligencia() / CIEN;
        defensa = defensa + defensa * item.getValorDefensa() / CIEN;
        fuerza = fuerza + fuerza * item.getValorFuerza() / CIEN;
    }

    /**
     * @param item
     *            agregamos un item a la mochila.
     */
    public void setMochila2(final Item item) {
        this.mochila.add(item);

    }

    /**
     * @param nuevaSaludPersonaje
     *            .
     * @param nuevaEnergiaPersonaje
     *            recibimos los datos replicados de un personaje.
     */
    public void recibirDatosReplicadosDePersonajeAtacar(
            final int nuevaSaludPersonaje, final int nuevaEnergiaPersonaje) {
        this.salud = nuevaSaludPersonaje;
        this.energia = nuevaEnergiaPersonaje;
    }

}
