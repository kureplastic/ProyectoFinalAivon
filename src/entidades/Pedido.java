package entidades;

import java.time.LocalDate;

public class Pedido {
    private int idPedido;
    private Campaña campaña;
    private Revendedor revendedor;
    private LocalDate fechaIngreso;
    private LocalDate fechaEntrega;
    private LocalDate fechaPago;
    private int cantCajas;
    private float importeTotal;
    private int estrellaXpedido;
    private boolean estadoPedido;
    
    public Pedido() {
    }

    public Pedido(int idPedido, Campaña campaña, Revendedor revendedor, LocalDate fechaIngreso, LocalDate fechaEntrega, LocalDate fechaPago, int cantCajas, float importeTotal, int estrellaXpedido, boolean estadoPedido) {
        this.idPedido = idPedido;
        this.campaña = campaña;
        this.revendedor = revendedor;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.fechaPago = fechaPago;
        this.cantCajas = cantCajas;
        this.importeTotal = importeTotal;
        this.estrellaXpedido = estrellaXpedido;
        this.estadoPedido = estadoPedido;
    }

    public Pedido(Campaña campaña, Revendedor revendedor, LocalDate fechaIngreso, LocalDate fechaEntrega, LocalDate fechaPago, int cantCajas, float importeTotal, int estrellaXpedido, boolean estadoPedido) {
        this.campaña = campaña;
        this.revendedor = revendedor;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.fechaPago = fechaPago;
        this.cantCajas = cantCajas;
        this.importeTotal = importeTotal;
        this.estrellaXpedido = estrellaXpedido;
        this.estadoPedido = estadoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Campaña getCampaña() {
        return campaña;
    }

    public void setCampaña(Campaña campaña) {
        this.campaña = campaña;
    }

    public Revendedor getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(Revendedor revendedor) {
        this.revendedor = revendedor;
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

    public float getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
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
    
    

    
       
    
    
}

