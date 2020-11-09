
package modelo;

import entidades.Campaña;
import entidades.HistoricoCampaña;
import entidades.Revendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HistoricoCampañaData {
    private Connection con;

    public HistoricoCampañaData(Conexion conexion) {
        con = conexion.getConnection();
    }

    public void guardarHistorico(HistoricoCampaña historico) {

        String sql = "INSERT INTO `historicorc`(`idCampaña`, `idRevendedor`, `estrellasRC`,`estadoRC`"
                
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, historico.getCampaña().getIdCampaña());
            ps.setInt(2, historico.getRevendedor().getIdRevendedor());
            ps.setInt(3, historico.getEstrellasRC());
            ps.setBoolean(4, historico.isEstadoRC());
           

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                historico.setIdHistoricoCampaña(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El historico ha sido cargado");
            } else {
                JOptionPane.showMessageDialog(null, "No puedo obtener id");
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar Historico: " + ex);
        }

    }

    public void eliminarHistorico(HistoricoCampaña historico) {
        String sql = "DELETE FROM `historicorc` WHERE historicorc.idHistoricoRC = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, historico.getIdHistoricoCampaña());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    public HistoricoCampaña buscarHistorico(int idHistoricoCampaña) {
        HistoricoCampaña historico = null;
        String sql = "SELECT * FROM historicorc WHERE idHistoricoRC = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHistoricoCampaña);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "HISTORICO ENCONTRADO");
                historico = new HistoricoCampaña();
                historico.setIdHistoricoCampaña(rs.getInt("idHistoricoCampaña"));
                historico.setCampaña(traerCampaña(rs.getInt("IdCampaña")));
                historico.setRevendedor(traerRevendedor(rs.getInt("dni")));
                historico.setEstrellasRC(rs.getInt("estrellasRC"));
                historico.setEstadoRC(rs.getBoolean("estadoRC"));
                

            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL HISTORICO CON DICHO ID");
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR EXCEPCION: " + ex);
        }

        return historico;
    }
    
    public void actualizarHistorico(HistoricoCampaña historico){
        String sql = "UPDATE `historicorc` SET `idCampaña`=?,idRevendedor`= ?,`estrellasRC`=?,`estadoRC`=?"
                    + "WHERE idHistoricoRC = ?";        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, historico.getCampaña().getIdCampaña()); 
            ps.setInt(2, historico.getRevendedor().getIdRevendedor());                    
            ps.setInt(3, historico.getEstrellasRC());
            ps.setBoolean(4, historico.isEstadoRC());
            ps.setInt(5, historico.getIdHistoricoCampaña());

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO HISTORICO");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR HISTORICO");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public List<HistoricoCampaña> obtenerhistorico() {
        HistoricoCampaña historico = null;
        List<HistoricoCampaña> historicos = new ArrayList<>();

        String sql = "SELECT * FROM historicorc";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            JOptionPane.showMessageDialog(null, "HISTORICO ENCONTRADOS:");
            while (rs.next()) {
                historico = new HistoricoCampaña();
                historico.setIdHistoricoCampaña(rs.getInt("idHistoricoCampaña"));
                historico.setCampaña(traerCampaña(rs.getInt("idCampaña")));
                historico.setRevendedor(traerRevendedor(rs.getInt("dni")));               
                historico.setEstrellasRC(rs.getInt("estrellasRC"));
                historico.setEstadoRC(rs.getBoolean("estadoRC"));

                historicos.add(historico);
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE TIPO: " + ex);
        }

        return historicos;

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
