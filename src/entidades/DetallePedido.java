/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Fran Gonzalez
 */
public class DetallePedido {
    
    private int idDetalle;
    private Producto producto;
    private Pedido pedido;
    private int cantProducto;
    private int estrellasTotales;

    public DetallePedido() {
    }

    public DetallePedido(int idDetalle, Producto producto, Pedido pedido, int cantProducto) {
        this.idDetalle = idDetalle;
        this.producto = producto;
        this.pedido = pedido;
        this.cantProducto = cantProducto;
        this.estrellasTotales = cantProducto * producto.getEstrella();
    }

    public DetallePedido(Producto producto, Pedido pedido, int cantProducto) {
        this.producto = producto;
        this.pedido = pedido;
        this.cantProducto = cantProducto;
        this.estrellasTotales = cantProducto * producto.getEstrella();
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public int getEstrellasTotales() {
        return estrellasTotales;
    }

    public void setEstrellasTotales() {
        this.estrellasTotales = cantProducto * producto.getEstrella();
    }
    
    
    
}
