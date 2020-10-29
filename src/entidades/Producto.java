package entidades;

/**
 *
 * @author gomez
 */
public class Producto {
    private int idProducto;
    private long codigoBarra;
    private String nombreProducto;
    private String descripcion;
    private int tamanio;
    private float precioCosto;
    private float precioPublico;
    private int estrella;

    public Producto() {
    }

    public Producto(int idProducto, long codigoBarra, String nombreProducto, String descripcion, int tamanio, float precioCosto, float precioPublico, int estrella) {
        this.idProducto = idProducto;
        this.codigoBarra = codigoBarra;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.tamanio = tamanio;
        this.precioCosto = precioCosto;
        this.precioPublico = precioPublico;
        this.estrella = estrella;
    }

    public Producto(long codigoBarra, String nombreProducto, String descripcion, int tamanio, float precioCosto, float precioPublico, int estrella) {
        this.codigoBarra = codigoBarra;
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

    public long getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(long codigoBarra) {
        this.codigoBarra = codigoBarra;
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

    public float getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }

    public float getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(float precioPublico) {
        this.precioPublico = precioPublico;
    }

    public int getEstrella() {
        return estrella;
    }

    public void setEstrella(int estrella) {
        this.estrella = estrella;
    }
    
}