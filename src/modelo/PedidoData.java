package modelo;

import entidades.Campaña;
import entidades.Pedido;
import entidades.Revendedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PedidoData {

    private Connection con;

    public PedidoData(Conexion conexion) {
        con = conexion.getConnection();
    }

    public void guardarPedido(Pedido pedido) {

        String sql = "INSERT INTO `pedido`(`idRevendedor`, `idCampaña`, `fechaIngreso`,"
                + " `fechaEntrega`, `fechaPago`, `cantCajas`, `importeTotal`, `estrellasXPedido`, `estadoPedido`)"
                + "VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getRevendedor().getIdRevendedor());
            ps.setInt(2, pedido.getCampaña().getIdCampaña());
            ps.setDate(3, Date.valueOf(pedido.getFechaIngreso()));
            ps.setDate(4, Date.valueOf(pedido.getFechaEntrega()));
            ps.setDate(5, Date.valueOf(pedido.getFechaPago()));
            ps.setInt(6, pedido.getCantCajas());
            ps.setFloat(7, pedido.getImporteTotal());
            ps.setInt(8, pedido.getEstrellaXpedido());
            ps.setBoolean(9, pedido.isEstadoPedido());

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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar pedido: " + ex);
        }

    }

    public void eliminarPedido(Pedido pedido) {
        String sql = "DELETE FROM `pedido` WHERE pedido.IdPedido = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getIdPedido());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e);
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
                JOptionPane.showMessageDialog(null, "PEDIDO ENCONTRADO");
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setCampaña(traerCampaña(rs.getInt("IdCampaña")));
                pedido.setRevendedor(traerRevendedor(rs.getInt("dni")));
                pedido.setFechaIngreso(rs.getDate("fechaIngreso").toLocalDate());
                pedido.setFechaEntrega(rs.getDate("fechaEntrega").toLocalDate());
                pedido.setFechaPago(rs.getDate("fechaPago").toLocalDate());
                pedido.setCantCajas(rs.getInt("cantCajas"));
                pedido.setImporteTotal(rs.getFloat("importeTotal"));
                pedido.setEstrellaXpedido(rs.getInt("estrellasXPedido"));
                pedido.setEstadoPedido(rs.getBoolean("estadoPedido"));

            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL PEDIDO CON DICHO ID");
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR EXCEPCION");
        }

        return pedido;
    }
    
    public void actualizarPedido(Pedido pedido){
        String sql = "UPDATE `pedido` SET `idRevendedor`= ?,`idCampaña`=?,`fechaIngreso`=?,`fechaEntrega`=?,`fechaPago`=?,`cantCajas`=?,`importeTotal`=?,`estrellasXPedido`=?,`estadoPedido`=?"
                    + "WHERE idPedido = ?";        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getRevendedor().getIdRevendedor());
            ps.setInt(2, pedido.getCampaña().getIdCampaña());
            ps.setDate(3, Date.valueOf(pedido.getFechaIngreso()));
            ps.setDate(4, Date.valueOf(pedido.getFechaEntrega()));
            ps.setDate(5, Date.valueOf(pedido.getFechaPago()));
            ps.setInt(6, pedido.getCantCajas());
            ps.setFloat(7, pedido.getImporteTotal());
            ps.setInt(8, pedido.getEstrellaXpedido());
            ps.setBoolean(9, pedido.isEstadoPedido());
            ps.setInt(10, pedido.getIdPedido());

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO PEDIDO");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR PEDIDO");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public List<Pedido> obtenerPedidos() {
        Pedido pedido = null;
        List<Pedido> pedidos = new ArrayList<>();

        String sql = "SELECT * FROM pedido";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            JOptionPane.showMessageDialog(null, "PEDIDOS ENCONTRADOS:");
            while (rs.next()) {
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setCampaña(traerCampaña(rs.getInt("idCampaña")));
                pedido.setRevendedor(traerRevendedor(rs.getInt("dni")));
                pedido.setFechaIngreso(rs.getDate("fechaIngreso").toLocalDate());
                pedido.setFechaEntrega(rs.getDate("fechaEntrega").toLocalDate());
                pedido.setFechaPago(rs.getDate("fechaPago").toLocalDate());
                pedido.setCantCajas(rs.getInt("cantCajas"));
                pedido.setImporteTotal(rs.getFloat("importeTotal"));
                pedido.setEstrellaXpedido(rs.getInt("estrellasXPedido"));
                pedido.setEstadoPedido(rs.getBoolean("estadoPedido"));

                pedidos.add(pedido);
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE TIPO: " + ex);
        }

        return pedidos;

    }

    private Campaña traerCampaña(int idCampaña) {
        Conexion c = new Conexion();
        CampañaData cd = new CampañaData(c);
        return cd.buscarCampaña(idCampaña);
    }

    private Revendedor traerRevendedor(int dni) {
        Conexion c = new Conexion();
        RevendedorData rd = new RevendedorData(c);
        return rd.buscarRevendedor(dni);
    }


}
