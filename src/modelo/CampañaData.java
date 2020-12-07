/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.Campaña;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran Gonzalez
 */
public class CampañaData {

   private Connection con;

    public CampañaData(Conexion conexion) {
        con = conexion.getConnection();
    }

    public void guardarCampaña(Campaña campaña) {

        String sql = "INSERT INTO `campaña`(`fechaInicio`, `fechaFinal`, `montoMin`, `montoTope`, `estrellasXCampaña`, `estadoCampaña`)"
                + "VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(campaña.getFechaInicio()));
            ps.setDate(2, Date.valueOf(campaña.getFechaFinal()));
            ps.setFloat(3, campaña.getMontoMin());
            ps.setFloat(4, campaña.getMontoTope());
            ps.setInt(5, campaña.getEstrellasXCampaña());
            ps.setBoolean(6, campaña.isEstadoCamapaña());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                campaña.setIdCampaña(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El revendedor ha sido cargado");
            } else {
                JOptionPane.showMessageDialog(null, "No puedo obtener id");
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public Campaña buscarCampaña(int idCampaña) {
        Campaña campaña = null;
        String sql = "SELECT * FROM campaña WHERE idCampaña = ?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCampaña);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                campaña = new Campaña();
                campaña.setIdCampaña(rs.getInt("idCampaña"));
                campaña.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                campaña.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                campaña.setMontoMin(rs.getFloat("montoMin"));
                campaña.setMontoTope(rs.getFloat("montoTope"));
                campaña.setEstrellasXCampaña(rs.getInt("estrellasXCampaña"));
                campaña.setEstadoCamapaña(rs.getBoolean("estadoCampaña"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro Campaña con dicho ID");
            }

            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }

        return campaña;
    }

    public void eliminarCampaña(Campaña campaña) {
        String sql = "DELETE FROM campaña WHERE idCampaña = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, campaña.getIdCampaña());
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }

    }

    public void actualizarCampaña(Campaña campaña) {
        String sql = "UPDATE campaña SET fechaInicio = ?, fechaFinal = ?, montoMin = ?, montoTope = ?, estrellasXCampaña = ?, estadoCampaña = ? "
                + "WHERE idCampaña = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, Date.valueOf(campaña.getFechaInicio()));
            ps.setDate(2, Date.valueOf(campaña.getFechaFinal()));
            ps.setFloat(3, campaña.getMontoMin());
            ps.setFloat(4, campaña.getMontoTope());
            ps.setInt(5, campaña.getEstrellasXCampaña());
            ps.setBoolean(6, campaña.isEstadoCamapaña());
            ps.setInt(7, campaña.getIdCampaña());

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO CAMPAÑA");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR CAMPAÑA");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }

    }
    
    public List<Campaña> obtenerCampañas(){
        Campaña campaña = null;
        List<Campaña> campañas = new ArrayList<>();
        String sql = "SELECT * FROM campaña";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            JOptionPane.showConfirmDialog(null, "CAMPAÑAS ENCONTRADAS");
            
            while(rs.next()){
                campaña = new Campaña();
                campaña.setIdCampaña(rs.getInt("idCampaña"));
                campaña.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                campaña.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                campaña.setMontoMin(rs.getFloat("montoMin"));
                campaña.setMontoTope(rs.getFloat("montoTope"));
                campaña.setEstrellasXCampaña(rs.getInt("estrellasXCampaña"));
                campaña.setEstadoCamapaña(rs.getBoolean("estadoCampaña"));
                
                campañas.add(campaña);
            }
            ps.close();
            rs.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return campañas;
    }
}
