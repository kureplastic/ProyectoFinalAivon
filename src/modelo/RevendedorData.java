
package modelo;

import entidades.Pedido;
import entidades.Revendedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RevendedorData {
     private Connection con;

    public RevendedorData(Conexion conexion) {
        con = conexion.getConnection();
    }
    
   public void guardarRevendedor(Revendedor revendedor) {

        String sql = "INSERT INTO `revendedor`(`idRevendedor`, `dni`, `nombreRevendedor`,"
                + " `telefono`, `mail`, `activo`)"
                + " VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, revendedor.getIdRevendedor());
            ps.setLong(2, revendedor.getDni());
            ps.setString(3, revendedor.getNombreRevendedor());
            ps.setLong(4, revendedor.getTelefono());
            ps.setString(5, revendedor.getMail());
           ps.setInt(6, revendedor.isActivo() ? 1 : 0);
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                revendedor.setIdRevendedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El revendedor ha sido cargado");
            } else {
                JOptionPane.showMessageDialog(null, "No puedo obtener id");
            }

            rs.close();
            ps.close();
            //con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar revendedor: " + ex);
        }
    }
   
}


            

