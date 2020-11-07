
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

public class PedidoData {
    
    private Connection con;

    public PedidoData(Conexion conexion) {
        con = conexion.getConnection();
    }
    
    public void ingresarPedido(Pedido pedido){
        
        String sql = "INSERT INTO pedido ()";
    }
     public void guardarPedido(Pedido pedido) {

        String sql = "INSERT INTO `pedido`(`idPedido`, `idRevendedor`, `idCampaña`, `fechaIngreso`,"
                + " `fechaEntrega`, `fechaPago`, `cantCajas`, `importeTotal`, `estrellasXPedido`, `estadoPedido`)" 
                    +  "VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(2, pedido.getRevendedor().getIdRevendedor());
            ps.setInt(3, pedido.getCampaña().getIdCampaña());
            ps.setDate(4, Date.valueOf(pedido.getFechaIngreso()));
            ps.setDate(5, Date.valueOf(pedido.getFechaEntrega()));
            ps.setDate(6, Date.valueOf(pedido.getFechaPago()));
            ps.setInt(7, pedido.getCantCajas());
            ps.setFloat(8, pedido.getImporteTotal());
            ps.setInt(9, pedido.getEstrellaXpedido());
            ps.setInt(10, pedido.isEstadoPedido() ? 1 : 0);
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
               pedido.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El pedido ha sido cargado");
            } else {
                JOptionPane.showMessageDialog(null, "No puedo obtener id");
            }

            rs.close();
            ps.close();
            //con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar pedido: " + ex);
        }

    }
     public void eliminarPedido(Pedido pedido) {
        String sql = "DELETE FROM `pedido` WHERE = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getIdPedido());

            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Pedido");
        }
    }
     public Pedido buscarPedido(int idPedido) {
        Pedido pedido = null;
        String sql = "SELECT * FROM pedido WHERE idPedido = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "PRODUCTO ENCONTRADO");
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                Revendedor r = new Revendedor(); 
                //rs.get

 //rs.getInt("idRevendedor")
               // pedido.setRevendedor();
               
            }
            else{JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL PRODUCTO CON DICHO ID");}
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR EXCEPCION");
        }

        return pedido;
    }
}




