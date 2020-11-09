/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.DetallePedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

}
