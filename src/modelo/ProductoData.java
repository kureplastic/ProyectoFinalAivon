
package modelo;

import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoData {
     private Connection con;

    public ProductoData(Conexion conexion) {
        con = conexion.getConnection();
    }
    public void guardarProducto(Producto producto) {

        String sql = "INSERT INTO `producto` (`codigo`,`nombreProducto`, `descripcion`, `tamanio`,`precioCosto`, `precioPublico`, `estrellas`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, producto.getCodigo());
            ps.setString(2, producto.getNombreProducto());
            ps.setString(3, producto.getDescripcion());
            ps.setInt(4, producto.getTamanio());
            ps.setDouble(5, producto.getPrecioCosto());
            ps.setDouble(6, producto.getPrecioPublico());
            ps.setInt(7, producto.getEstrella());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El producto ha sido cargado");
            } else {
                JOptionPane.showMessageDialog(null, "No puedo obtener id");
            }

            rs.close();
            ps.close();
            //con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar producto: " + ex);
        }

    }
    public void eliminarProducto(Producto producto) {
        String sql = "DELETE FROM `producto` WHERE idProducto = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, producto.getIdProducto());

            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Producto");
        }
    }
    public Producto buscarProducto(int codigoProducto) {
        Producto producto = null;
        String sql = "SELECT * FROM producto WHERE codigo = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigoProducto);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "PRODUCTO ENCONTRADO");
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setCodigo(rs.getLong("codigo"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioCosto(rs.getDouble("precioCosto"));
                producto.setPrecioPublico(rs.getDouble("precioPublico"));
                producto.setTamanio(rs.getInt("tamanio"));
                producto.setEstrella(rs.getInt("estrellas"));
            }
            else{JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL PRODUCTO CON DICHO ID");}
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR EXCEPCION: " + ex);
        }

        return producto;
    }
    public List<Producto> obtenerProductos() {
        Producto producto = null;
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM producto";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            JOptionPane.showMessageDialog(null, "PRODUCTOS ENCONTRADOS:");
            while (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setCodigo(rs.getLong("codigo"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioCosto(rs.getDouble("precioCosto"));
                producto.setPrecioPublico(rs.getDouble("precioPublico"));
                producto.setTamanio(rs.getInt("tamanio"));
                producto.setEstrella(rs.getInt("estrellas"));
                productos.add(producto);
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE TIPO: " + ex);
        }

        return productos;
    }
    public void actualizarProducto(Producto producto){
        String sql= "UPDATE producto SET codigo=? ,nombreProducto=?,descripcion=?,tamanio=?,precioCosto=?,precioPublico=?,estrellas=? WHERE producto.idProducto = ?";
        
        
        try {
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setLong(1, producto.getCodigo());
                ps.setString(2, producto.getNombreProducto());
                ps.setString(3, producto.getDescripcion());
                ps.setInt(4, producto.getTamanio());
                ps.setDouble(5, producto.getPrecioCosto());
                ps.setDouble(6, producto.getPrecioPublico());
                ps.setInt(7, producto.getEstrella());
                ps.setInt(8, producto.getIdProducto());
            
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO EL PRODUCTO");
            }
            else {JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR EL PRODUCTO");}
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de tipo: " + ex);
        }
}
}
