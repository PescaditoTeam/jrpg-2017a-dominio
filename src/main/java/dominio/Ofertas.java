package dominio;

/**
 * Clase que contiene el item ofertado y el demandado de una oferta que ocurre
 * en el mercado.
 *
 */
public class Ofertas {
    /**
     * id del usuario que realiza la oferta.
     */
    private int idUser;
    /**
     * nombre del usuario que realiza la oferta.
     */
    private String user;
    /**
     * item ofertado.
     */
    private int ofertado;
    /**
     * item demandado.
     */
    private int demandado;

    /**
     * @param ofertado
     *            .
     * @param demandado
     *            .
     * @param user
     *            .
     * @param id
     *            constructor parametrizado por defecto.
     */
    public Ofertas(final int ofertado, final int demandado, final String user,
            final int id) {
        this.ofertado = ofertado;
        this.demandado = demandado;
        this.user = user;
        this.idUser = id;
    }

    /**
     * constructor por defecto vacio.
     */
    public Ofertas() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return getter del item ofertado.
     */
    public int getOfertado() {
        return ofertado;
    }

    /**
     * @return getter del item demandado.
     */
    public int getDemandado() {
        return demandado;
    }

    /**
     * @return getter del usuario.
     */
    public String getUser() {
        return user;
    }

    /**
     * @return getter del id del usuario.
     */
    public int getIdUser() {
        return idUser;
    }

}
