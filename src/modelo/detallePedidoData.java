/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.DetallePedido;
import entidades.Pedido;
import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran Gonzalez
 */
public class detallePedidoData {

    private Connection con;

    public detallePedidoData(Conexion conexion) {
        con = conexion.getConnection();
    }

    public void guardarDetalle(DetallePedido detalle) {
        String sql = "INSERT INTO detallepedido (idProducto, idPedido, cantProducto, estrellasTotales)"
                + "VALUES(?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalle.getProducto().getIdProducto());
            ps.setInt(2, detalle.getPedido().getIdPedido());
            ps.setInt(3, detalle.getCantProducto());
            ps.setInt(4, detalle.getEstrellasTotales());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                detalle.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El detalle ha sido ingresado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No puedo obtener id");
            }
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }

    }

    public DetallePedido buscarDetalle(int idDetalle) {
        DetallePedido detalle = null;
        String sql = "SELECT * FROM detallepedido WHERE idDetalle = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDetalle);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "DETALLE ENCONTRADO");
                detalle = new DetallePedido();
                detalle.setIdDetalle(rs.getInt("idDetalle"));
                detalle.setProducto(traerProducto(rs.getInt("idProducto")));
                detalle.setPedido(traerPedido(rs.getInt("idPedido")));
                detalle.setCantProducto(rs.getInt("cantProducto"));
                detalle.setEstrellasTotales();
            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL DETALLE CON DICHO ID");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex);
        }

        return detalle;
    }

    public void eliminarDetalle(DetallePedido detalle) {
        String sql = "DELETE FROM `detallepedido` WHERE idDetalle = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detalle.getIdDetalle());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(detallePedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void actualizarDetalle(DetallePedido detalle) {
        String sql = "UPDATE detallepedido SET idProducto = ?, idPedido = ?, cantProducto = ?, estrellasTotales = ?"
                + " WHERE idDetalle = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detalle.getProducto().getIdProducto());
            ps.setInt(2, detalle.getPedido().getIdPedido());
            ps.setInt(3, detalle.getCantProducto());
            ps.setInt(4, detalle.getEstrellasTotales());
            ps.setInt(5, detalle.getIdDetalle());

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO DETALLE");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR DETALLE");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(detallePedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<DetallePedido> obtenerDetalles() {
        DetallePedido detalle = null;
        List<DetallePedido> detalles = new ArrayList<>();
        String sql = "SELECT * FROM detallepedido";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                detalle = new DetallePedido();
                detalle.setIdDetalle(rs.getInt("idDetalle"));
                detalle.setProducto(traerProducto(rs.getInt("idProducto")));
                detalle.setPedido(traerPedido(rs.getInt("idPedido")));
                detalle.setCantProducto(rs.getInt("cantProducto"));
                detalle.setEstrellasTotales();

                detalles.add(detalle);

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE TIPO: " + ex);
        }

        return detalles;
    }

    private Producto traerProducto(int idProducto) {
        Conexion c = new Conexion();
        ProductoData pd = new ProductoData(c);
        return pd.buscarProducto(idProducto);
    }

    private Pedido traerPedido(int idPedido) {
        Conexion c = new Conexion();
        PedidoData pd = new PedidoData(c);
        return pd.buscarPedido(idPedido);
    }

    public List<DetallePedido> obtenerDetallesXPedido(Pedido pedido) {
        DetallePedido detalle = null;
        List<DetallePedido> detalles = new ArrayList<>();
        String sql = "SELECT * FROM detallepedido WHERE idPedido = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "DETALLES ENCONTRADOS");
                while (rs.next()) {
                    detalle = new DetallePedido();
                    detalle.setIdDetalle(rs.getInt("idDetalle"));
                    detalle.setProducto(traerProducto(rs.getInt("idProducto")));
                    detalle.setPedido(traerPedido(rs.getInt("idPedido")));
                    detalle.setCantProducto(rs.getInt("cantProducto"));
                    detalle.setEstrellasTotales();

                    detalles.add(detalle);

                }
            } else {
                    JOptionPane.showMessageDialog(null, "NINGUN DETALLE ENCONTRADO PARA DICHO PEDIDO");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE TIPO: " + ex);
        }

        return detalles;
    }

}
