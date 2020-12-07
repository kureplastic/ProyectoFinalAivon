package Vistas;


import entidades.*;
import static java.lang.Float.parseFloat;
import modelo.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class VistaRevendedor extends javax.swing.JInternalFrame {

private RevendedorData revendedorData;
private Conexion conexion;
    
    
    public VistaRevendedor() {
        initComponents();
         conexion = new Conexion();
         revendedorData = new RevendedorData(conexion);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jl_Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtf_idRevendedor = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_dni = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jtf_mail = new javax.swing.JTextField();
        jtf_nivel = new javax.swing.JTextField();
        jtf_apellido = new javax.swing.JTextField();
        jcb_activo = new javax.swing.JCheckBox();
        jb_guardar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jb_actualizar = new javax.swing.JButton();
        jb_buscar = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("AIVON");

        jLabel1.setText("ID");

        jl_Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Titulo.setForeground(new java.awt.Color(0, 0, 255));
        jl_Titulo.setText("-Revendedor-");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Telefono");

        jLabel5.setText("Mail");

        jLabel6.setText("Activo");

        jLabel7.setText("Nivel");

        jLabel8.setText("DNI");

        jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreActionPerformed(evt);
            }
        });

        jcb_activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_activoActionPerformed(evt);
            }
        });

        jb_guardar.setText("Guardar");
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        jb_eliminar.setText("Eliminar");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });

        jb_actualizar.setText("Actualizar");
        jb_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizarActionPerformed(evt);
            }
        });

        jb_buscar.setText("Buscar");
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });

        jb_limpiar.setText("LIMPIAR");
        jb_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_idRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtf_nombre)
                                .addComponent(jtf_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(jtf_dni)
                                .addComponent(jtf_telefono))
                            .addComponent(jtf_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_activo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(115, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_Titulo)
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_idRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_apellido)
                    .addComponent(jb_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jb_eliminar))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jb_limpiar))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcb_activo))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreActionPerformed

    private void jcb_activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_activoActionPerformed
        
        
    }//GEN-LAST:event_jcb_activoActionPerformed

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed

        Revendedor r = new Revendedor(-1 ,Long.parseLong(jtf_dni.getText()), jtf_nombre.getText(), jtf_apellido.getText(),
         Long.parseLong(jtf_telefono.getText()), jtf_mail.getText(),jcb_activo.isSelected(),Integer.parseInt(jtf_nivel.getText()));
        revendedorData.guardarRevendedor(r);
        jtf_idRevendedor.setText(r.getIdRevendedor() + "");
        
        
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        int id = Integer.parseInt(jtf_idRevendedor.getText());
        Revendedor r = null;
        r = revendedorData.buscarRevendedor(id);
        revendedorData.eliminarRevendedor(r);
    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void jb_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizarActionPerformed
        if (jtf_idRevendedor.getText() != null)
        {
            int id = Integer.parseInt(jtf_idRevendedor.getText());
            Revendedor r = new Revendedor(Long.parseLong(jtf_dni.getText()), jtf_nombre.getText(), jtf_apellido.getText(),
         Long.parseLong(jtf_telefono.getText()), jtf_mail.getText(),jcb_activo.isSelected(),Integer.parseInt(jtf_nivel.getText()));
            revendedorData.actualizarRevendedor(r);
        }
    }//GEN-LAST:event_jb_actualizarActionPerformed

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
         int id = Integer.parseInt(jtf_idRevendedor.getText());
        Revendedor r = new Revendedor();
        r = revendedorData.buscarRevendedor(id);
        if (r != null){
            jtf_idRevendedor.setText(r.getIdRevendedor() + "");
            jtf_nombre.setText(r.getNombreRevendedor());
            jtf_apellido.setText(r.getApellidoRevendedor());
            jtf_dni.setText(r.getDni()+ "");
            jtf_telefono.setText(r.getTelefono()+ "");
            jtf_mail.setText(r.getMail());
            jtf_nivel.setText(r.getNivel()+ "");
            jcb_activo.setSelected(r.isActivo());

        }
    }//GEN-LAST:event_jb_buscarActionPerformed

    private void jb_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarActionPerformed
         jtf_nombre.setText("");
         jtf_apellido.setText("");
         jtf_idRevendedor.setText("");
         jcb_activo.setEnabled(true);
    }//GEN-LAST:event_jb_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jb_actualizar;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_limpiar;
    private javax.swing.JCheckBox jcb_activo;
    private javax.swing.JLabel jl_Titulo;
    private javax.swing.JTextField jtf_apellido;
    private javax.swing.JTextField jtf_dni;
    private javax.swing.JTextField jtf_idRevendedor;
    private javax.swing.JTextField jtf_mail;
    private javax.swing.JTextField jtf_nivel;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
