package Vistas;

import entidades.*;
import static java.lang.Float.parseFloat;
import modelo.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VistaCampaña extends javax.swing.JInternalFrame {

    private CampañaData campañaData;
    private Conexion conexion;
    
    public VistaCampaña() {
        initComponents();
        conexion = new Conexion();
        campañaData = new CampañaData(conexion);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Campaña = new javax.swing.JLabel();
        jl_IdCampaña = new javax.swing.JLabel();
        jl_FechaInicio = new javax.swing.JLabel();
        jl_FechaFinal = new javax.swing.JLabel();
        jl_MontoMinimo = new javax.swing.JLabel();
        jl_MontoMaximo = new javax.swing.JLabel();
        jl_EstrellaPorCampaña = new javax.swing.JLabel();
        jtf_IdCampaña = new javax.swing.JTextField();
        jtf_FechaInicio = new javax.swing.JTextField();
        jtf_FechaFinal = new javax.swing.JTextField();
        jtf_MontoMinimo = new javax.swing.JTextField();
        jtf_MontoMaximo = new javax.swing.JTextField();
        jtf_EstrellaPorCampaña = new javax.swing.JTextField();
        jb_Buscar = new javax.swing.JButton();
        jb_Cargar = new javax.swing.JButton();
        jb_Borrar = new javax.swing.JButton();
        jb_Actualizar = new javax.swing.JButton();
        jb_Listar = new javax.swing.JButton();
        jb_Limpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jl_Campaña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Campaña.setForeground(new java.awt.Color(0, 0, 225));
        jl_Campaña.setText("-Campaña-");

        jl_IdCampaña.setText("Id Campaña");

        jl_FechaInicio.setText("Fecha Inicio");

        jl_FechaFinal.setText("Fecha Final");

        jl_MontoMinimo.setText("Monto Minimo");

        jl_MontoMaximo.setText("Monto Maximo");

        jl_EstrellaPorCampaña.setText("Estrella Por Campaña");

        jtf_MontoMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_MontoMaximoActionPerformed(evt);
            }
        });

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        jb_Cargar.setText("Cargar");
        jb_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CargarActionPerformed(evt);
            }
        });

        jb_Borrar.setText("Borrar");
        jb_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BorrarActionPerformed(evt);
            }
        });

        jb_Actualizar.setText("Actualizar");
        jb_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ActualizarActionPerformed(evt);
            }
        });

        jb_Listar.setText("Listar");

        jb_Limpiar.setText("Limpiar");
        jb_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jl_Campaña))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_IdCampaña)
                            .addComponent(jl_EstrellaPorCampaña)
                            .addComponent(jl_MontoMaximo)
                            .addComponent(jl_MontoMinimo)
                            .addComponent(jl_FechaFinal)
                            .addComponent(jl_FechaInicio))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_MontoMinimo)
                            .addComponent(jtf_FechaFinal)
                            .addComponent(jtf_FechaInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_MontoMaximo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_IdCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 67, Short.MAX_VALUE))
                            .addComponent(jtf_EstrellaPorCampaña))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_Actualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_Listar)
                            .addComponent(jb_Borrar)
                            .addComponent(jb_Cargar)
                            .addComponent(jb_Buscar)
                            .addComponent(jb_Limpiar))))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_Campaña)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_IdCampaña)
                    .addComponent(jtf_IdCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_FechaInicio)
                    .addComponent(jtf_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Cargar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_FechaFinal)
                    .addComponent(jtf_FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Borrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_MontoMinimo)
                    .addComponent(jtf_MontoMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Actualizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_MontoMaximo)
                    .addComponent(jtf_MontoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Listar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_EstrellaPorCampaña)
                    .addComponent(jtf_EstrellaPorCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Limpiar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Falta Listar Campaña
    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
        int id = Integer.parseInt(jtf_IdCampaña.getText());
        Campaña c = new Campaña();
        c  = campañaData.buscarCampaña(id);
        if (c != null){
            jtf_IdCampaña.setText(c.getIdCampaña() + "");
            jtf_FechaInicio.setText(c.getFechaInicio().toString());
            jtf_FechaFinal.setText(c.getFechaFinal().toString());
            jtf_MontoMinimo.setText(c.getMontoMin() + "");
            jtf_MontoMaximo.setText(c.getMontoTope() + "");
            jtf_EstrellaPorCampaña.setText(c.getEstrellasXCampaña() + "");
        }
    }//GEN-LAST:event_jb_BuscarActionPerformed

    private void jtf_MontoMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_MontoMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_MontoMaximoActionPerformed

    private void jb_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CargarActionPerformed
    //  float montominimo = parseFloat(jtf_MontoMinimo.getText());
        Campaña c = new Campaña(-1, LocalDate.parse(jtf_FechaInicio.getText(),
           DateTimeFormatter.ofPattern("yyyy-MM-dd")),
           LocalDate.parse(jtf_FechaFinal.getText(),DateTimeFormatter.ofPattern("yyyy-MM-dd")),
           parseFloat(jtf_MontoMinimo.getText()),
           parseFloat(jtf_MontoMaximo.getText()), Integer.parseInt(jtf_EstrellaPorCampaña.getText()), true);
           campañaData.guardarCampaña(c);
        jtf_IdCampaña.setText(c.getIdCampaña() + "");
    }//GEN-LAST:event_jb_CargarActionPerformed

    private void jb_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BorrarActionPerformed
        int id = Integer.parseInt(jtf_IdCampaña.getText());
        Campaña c = null;
        c = campañaData.buscarCampaña(id);
        campañaData.eliminarCampaña(c);
    }//GEN-LAST:event_jb_BorrarActionPerformed

    private void jb_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ActualizarActionPerformed
        if (jtf_IdCampaña != null)
        {
            int id = Integer.parseInt(jtf_IdCampaña.getText());
            Campaña c = new Campaña(id, LocalDate.parse(jtf_FechaInicio.getText(),
               DateTimeFormatter.ofPattern("yyyy-MM-dd")),
               LocalDate.parse(jtf_FechaFinal.getText(),DateTimeFormatter.ofPattern("yyyy-MM-dd")),
               parseFloat(jtf_MontoMinimo.getText()),
               parseFloat(jtf_MontoMaximo.getText()), Integer.parseInt(jtf_EstrellaPorCampaña.getText()), true);
           campañaData.actualizarCampaña(c);
        }
    }//GEN-LAST:event_jb_ActualizarActionPerformed

    private void jb_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_LimpiarActionPerformed
        jtf_IdCampaña.setText("");
        jtf_FechaInicio.setText("");
        jtf_FechaFinal.setText("");
        jtf_MontoMinimo.setText("");
        jtf_MontoMaximo.setText("");
        jtf_EstrellaPorCampaña.setText("");
    }//GEN-LAST:event_jb_LimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Actualizar;
    private javax.swing.JButton jb_Borrar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Cargar;
    private javax.swing.JButton jb_Limpiar;
    private javax.swing.JButton jb_Listar;
    private javax.swing.JLabel jl_Campaña;
    private javax.swing.JLabel jl_EstrellaPorCampaña;
    private javax.swing.JLabel jl_FechaFinal;
    private javax.swing.JLabel jl_FechaInicio;
    private javax.swing.JLabel jl_IdCampaña;
    private javax.swing.JLabel jl_MontoMaximo;
    private javax.swing.JLabel jl_MontoMinimo;
    private javax.swing.JTextField jtf_EstrellaPorCampaña;
    private javax.swing.JTextField jtf_FechaFinal;
    private javax.swing.JTextField jtf_FechaInicio;
    private javax.swing.JTextField jtf_IdCampaña;
    private javax.swing.JTextField jtf_MontoMaximo;
    private javax.swing.JTextField jtf_MontoMinimo;
    // End of variables declaration//GEN-END:variables
}
