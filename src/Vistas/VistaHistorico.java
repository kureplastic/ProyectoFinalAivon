package Vistas;

import entidades.*;
import static java.lang.Float.parseFloat;
import modelo.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VistaHistorico extends javax.swing.JInternalFrame {

    private HistoricoCampañaData historicoData;
    private Conexion conexion;
    
    public VistaHistorico() {    
        initComponents();
        conexion = new Conexion();
        historicoData = new HistoricoCampañaData(conexion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_IdHistoricoCampaña = new javax.swing.JTextField();
        jtf_IdRevendedor = new javax.swing.JTextField();
        jtf_EstrellasRC = new javax.swing.JTextField();
        jtf_IdCampaña = new javax.swing.JTextField();
        jcb_EstadoRC = new javax.swing.JCheckBox();
        jb_Guardar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();
        jb_Buscar = new javax.swing.JButton();
        jb_Actualizar = new javax.swing.JButton();
        jb_Limpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("AIVON");
        setToolTipText("");

        jl_Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Titulo.setForeground(new java.awt.Color(0, 0, 255));
        jl_Titulo.setText("-Historico-");

        jLabel1.setText("Id  Historico Campaña");

        jLabel2.setText("Campaña");

        jLabel3.setText("Revendedor");

        jLabel4.setText("Estrellas RC");

        jLabel5.setText("Estado RC");

        jb_Guardar.setText("Guardar");
        jb_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarActionPerformed(evt);
            }
        });

        jb_Eliminar.setText("Eliminar");

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        jb_Actualizar.setText("Actualizar");

        jb_Limpiar.setText("LIMPIAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_IdHistoricoCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_IdCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_IdRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_EstrellasRC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_EstadoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_Eliminar)
                                .addGap(28, 28, 28)
                                .addComponent(jb_Buscar)
                                .addGap(30, 30, 30)
                                .addComponent(jb_Actualizar)
                                .addGap(58, 58, 58)
                                .addComponent(jb_Limpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jb_Guardar)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtf_IdHistoricoCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtf_IdCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtf_IdRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtf_EstrellasRC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5))
                    .addComponent(jcb_EstadoRC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Guardar)
                    .addComponent(jb_Eliminar)
                    .addComponent(jb_Buscar)
                    .addComponent(jb_Actualizar)
                    .addComponent(jb_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
          int id = Integer.parseInt(jtf_IdHistoricoCampaña.getText());
        HistoricoCampaña c = new HistoricoCampaña();
        c  = historicoData.buscarHistorico(id);
        if (c != null){
            jtf_IdHistoricoCampaña.setText(c.getIdHistoricoCampaña() + "");
            jtf_IdRevendedor.setText(c.getRevendedor().getIdRevendedor() + "");
            jtf_IdCampaña.setText(c.getCampaña().getIdCampaña() + "");
            jtf_EstrellasRC.setText(c.getEstrellasRC() + "");
            jcb_EstadoRC.isSelected();
        }
    }//GEN-LAST:event_jb_BuscarActionPerformed

    private void jb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarActionPerformed
    //   HistoricoCampaña c = new HistoricoCampaña(-1, Integer.parseInt(jtf_IdCampaña.getText()),Integer.parseInt(jtf_IdRevendedor.getText()),
     //   Integer.parseInt(jtf_EstrellasRC.getText()), jcb_EstadoRC.isSelected());
     //      historicoData.guardarHistorico(c);
     //       jtf_IdHistoricoCampaña.setText(c.getIdHistoricoCampaña() + "");
        
    }//GEN-LAST:event_jb_GuardarActionPerformed
private void jb_BorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int id = Integer.parseInt(jtf_IdHistoricoCampaña.getText());
        HistoricoCampaña c = null;
        c = historicoData.buscarHistorico(id);
        historicoData.eliminarHistorico(c);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jb_Actualizar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Guardar;
    private javax.swing.JButton jb_Limpiar;
    private javax.swing.JCheckBox jcb_EstadoRC;
    private javax.swing.JLabel jl_Titulo;
    private javax.swing.JTextField jtf_EstrellasRC;
    private javax.swing.JTextField jtf_IdCampaña;
    private javax.swing.JTextField jtf_IdHistoricoCampaña;
    private javax.swing.JTextField jtf_IdRevendedor;
    // End of variables declaration//GEN-END:variables
}
