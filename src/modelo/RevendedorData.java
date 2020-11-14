package modelo;

import entidades.Revendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RevendedorData {

   private Connection con;

    public RevendedorData(Conexion conexion) {
        con = conexion.getConnection();
    }

    public void guardarRevendedor(Revendedor revendedor) {

        String sql = "INSERT INTO `revendedor`(`dni`, `nombreRevendedor`, `apellidoRevendedor`, `telefono`, `mail`, `activo`, `nivel`)"
                + " VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, revendedor.getDni());
            ps.setString(2, revendedor.getNombreRevendedor());
            ps.setString(3, revendedor.getApellidoRevendedor());
            ps.setLong(4, revendedor.getTelefono());
            ps.setString(5, revendedor.getMail());
            ps.setBoolean(6, revendedor.isActivo());
            ps.setInt(7, revendedor.getNivel());

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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar revendedor: " + ex);
        }
    }

    public Revendedor buscarRevendedor(int dni) {
        Revendedor revendedor = null;
        String sql = "SELECT * FROM `revendedor` WHERE dni = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "REVENDEDOR ENCONTRADO");
                revendedor = new Revendedor();
                revendedor.setIdRevendedor(rs.getInt("idRevendedor"));
                revendedor.setDni(rs.getLong("dni"));
                revendedor.setNombreRevendedor(rs.getString("nombreRevendedor"));
                revendedor.setApellidoRevendedor(rs.getString("apellidoRevendedor"));
                revendedor.setTelefono(rs.getLong("telefono"));
                revendedor.setMail(rs.getString("mail"));
                revendedor.setActivo(rs.getBoolean("activo"));
                revendedor.setNivel(rs.getInt("nivel"));

            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL REVENDEDOR");
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex);
        }

        return revendedor;
    }

    public void eliminarRevendedor(Revendedor revendedor) {
        String sql = "DELETE FROM `revendedor` WHERE idRevendedor = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, revendedor.getIdRevendedor());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex);
        }
    }
    
    public void actualizarRevendedor(Revendedor revendedor) {
        String sql =  "UPDATE `revendedor` SET ``dni`= ?,`nombreRevendedor`= ?,`apellidoRevendedor`= ?,"
                    + "`telefono`= ?,`mail`= ?,`activo`= ?,`nivel`= ?"
                    + "WHERE idRevendedor = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, revendedor.getDni());
            ps.setString(2, revendedor.getNombreRevendedor());
            ps.setString(3, revendedor.getApellidoRevendedor());
            ps.setLong(4, revendedor.getTelefono());
            ps.setString(5, revendedor.getMail());
            ps.setBoolean(6, revendedor.isActivo());
            ps.setInt(7, revendedor.getNivel());
            
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO REVENDEDOR");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR REVENDEDOR");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex);
        }
        
    }
    
    public List<Revendedor> obtenerRevendedores() {
        Revendedor revendedor;
        List<Revendedor> revendedores = new ArrayList<>();
        String sql = "SELECT * FROM revendedor";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            JOptionPane.showMessageDialog(null, "REVENDEDORES ENCONTRADOS");
            while (rs.next()){
                revendedor = new Revendedor();
                revendedor.setIdRevendedor(rs.getInt("idRevendedor"));
                revendedor.setDni(rs.getLong("dni"));
                revendedor.setNombreRevendedor(rs.getString("nombreRevendedor"));
                revendedor.setApellidoRevendedor(rs.getString("apellidoRevendedor"));
                revendedor.setTelefono(rs.getLong("telefono"));
                revendedor.setMail(rs.getString("mail"));
                revendedor.setActivo(rs.getBoolean("activo"));
                revendedor.setNivel(rs.getInt("nivel"));
                
                revendedores.add(revendedor);
            }
            ps.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex);
        }
        return revendedores;       
    }

}
