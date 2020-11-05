package entidades;

/**
 *
 * @author gomez
 */
public class Producto {
    private int idProducto;
    private long codigo;
    private String nombreProducto;
    private String descripcion;
    private int tamanio;
    private double precioCosto;
    private double precioPublico;
    private int estrella;

    public Producto() {
    }

    public Producto(int idProducto, long codigo, String nombreProducto, String descripcion, int tamanio, double precioCosto, double precioPublico, int estrella) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.tamanio = tamanio;
        this.precioCosto = precioCosto;
        this.precioPublico = precioPublico;
        this.estrella = estrella;
    }

    public Producto(long codigo, String nombreProducto, String descripcion, int tamanio, double precioCosto, double precioPublico, int estrella) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.tamanio = tamanio;
        this.precioCosto = precioCosto;
        this.precioPublico = precioPublico;
        this.estrella = estrella;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(double precioPublico) {
        this.precioPublico = precioPublico;
    }

    public int getEstrella() {
        return estrella;
    }

    public void setEstrella(int estrella) {
        this.estrella = estrella;
    }
    
}