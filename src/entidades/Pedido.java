package entidades;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private int idPedido;
    private List<Producto> productos;
    private LocalDate fechaIngreso;
    private LocalDate fechaEntrega;
    private LocalDate fechaPago;
    private int cantCajas;
    private float importe;
    private int estrellaXpedido;
    private boolean estadoPedido;
    
    public Pedido() {
    }

    public Pedido(int idPedido, List<Producto> productos, LocalDate fechaIngreso, LocalDate fechaEntrega, LocalDate fechaPago, int cantCajas, float importe, int estrellaXpedido, boolean estadoPedido) {
        this.idPedido = idPedido;
        this.productos = productos;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.fechaPago = fechaPago;
        this.cantCajas = cantCajas;
        this.importe = importe;
        this.estrellaXpedido = estrellaXpedido;
        this.estadoPedido = estadoPedido;
    }

    public Pedido(List<Producto> productos, LocalDate fechaIngreso, LocalDate fechaEntrega, LocalDate fechaPago, int cantCajas, float importe, int estrellaXpedido) {
        this.productos = productos;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.fechaPago = fechaPago;
        this.cantCajas = cantCajas;
        this.importe = importe;
        this.estrellaXpedido = estrellaXpedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public List<Producto> getProducto() {
        return productos;
    }

    public void setProducto(List<Producto> productos) {
        this.productos = productos;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public void setCantCajas(int cantCajas) {
        this.cantCajas = cantCajas;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public int getEstrellaXpedido() {
        return estrellaXpedido;
    }

    public void setEstrellaXpedido(int estrellaXpedido) {
        this.estrellaXpedido = estrellaXpedido;
    }

    public boolean isEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(boolean estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    public void cantEstrellas(){
        
        for(Producto x: productos){
          estrellaXpedido += x.getEstrella();
        }
        
       
    }
    
}

