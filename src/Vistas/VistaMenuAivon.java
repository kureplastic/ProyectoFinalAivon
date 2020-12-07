package Vistas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class VistaMenuAivon extends javax.swing.JFrame {

    /**
     * Creates new form Aivon
     */
    public VistaMenuAivon() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jmb_MenuAivon = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmb_Campañas = new javax.swing.JMenu();
        jmi_Campañas = new javax.swing.JMenuItem();
        jmi_Historixo = new javax.swing.JMenuItem();
        jm_Pedido = new javax.swing.JMenu();
        jmi_Pedido = new javax.swing.JMenuItem();
        jmi_DetallePedido = new javax.swing.JMenuItem();
        jmb_revendedor = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jm_Producto = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jmb_MenuAivon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jmb_MenuAivon.setForeground(new java.awt.Color(255, 148, 126));
        jmb_MenuAivon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu2.setText("Archivo ");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jmb_MenuAivon.add(jMenu2);

        jmb_Campañas.setText("Campañas");

        jmi_Campañas.setText("Campaña");
        jmi_Campañas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CampañasActionPerformed(evt);
            }
        });
        jmb_Campañas.add(jmi_Campañas);

        jmi_Historixo.setText("Historico ");
        jmi_Historixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_HistorixoActionPerformed(evt);
            }
        });
        jmb_Campañas.add(jmi_Historixo);

        jmb_MenuAivon.add(jmb_Campañas);

        jm_Pedido.setText("Pedidos");
        jm_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_PedidoActionPerformed(evt);
            }
        });

        jmi_Pedido.setText("Pedido");
        jmi_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_PedidoActionPerformed(evt);
            }
        });
        jm_Pedido.add(jmi_Pedido);

        jmi_DetallePedido.setText("Detalle Pedido");
        jmi_DetallePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_DetallePedidoActionPerformed(evt);
            }
        });
        jm_Pedido.add(jmi_DetallePedido);

        jmb_MenuAivon.add(jm_Pedido);

        jmb_revendedor.setText("Revendedor ");

        jMenuItem2.setText("Revendedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmb_revendedor.add(jMenuItem2);

        jmb_MenuAivon.add(jmb_revendedor);

        jm_Producto.setText("Producto");

        jMenuItem3.setText("Producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jm_Producto.add(jMenuItem3);

        jmb_MenuAivon.add(jm_Producto);

        setJMenuBar(jmb_MenuAivon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_HistorixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_HistorixoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaHistorico aVista = new VistaHistorico();
        aVista.setVisible(true);
        escritorio.add(aVista);
        escritorio.moveToFront(aVista);
    }//GEN-LAST:event_jmi_HistorixoActionPerformed

    private void jmi_CampañasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CampañasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaCampaña aVista = new VistaCampaña();
        aVista.setVisible(true);
        escritorio.add(aVista);
        escritorio.moveToFront(aVista);
    }//GEN-LAST:event_jmi_CampañasActionPerformed

    private void jm_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_PedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_PedidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmi_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_PedidoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaPedido aVista = new VistaPedido();
        aVista.setVisible(true);
        escritorio.add(aVista);
        escritorio.moveToFront(aVista);
    }//GEN-LAST:event_jmi_PedidoActionPerformed

    private void jmi_DetallePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_DetallePedidoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaDetallePedido aVista = new VistaDetallePedido();
        aVista.setVisible(true);
        escritorio.add(aVista);
        escritorio.moveToFront(aVista);
    }//GEN-LAST:event_jmi_DetallePedidoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaRevendedor aVista = new VistaRevendedor();
        aVista.setVisible(true);
        escritorio.add(aVista);
        escritorio.moveToFront(aVista);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaProducto aVista = new VistaProducto();
        aVista.setVisible(true);
        escritorio.add(aVista);
        escritorio.moveToFront(aVista);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMenuAivon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuAivon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuAivon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuAivon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenuAivon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jm_Pedido;
    private javax.swing.JMenu jm_Producto;
    private javax.swing.JMenu jmb_Campañas;
    private javax.swing.JMenuBar jmb_MenuAivon;
    private javax.swing.JMenu jmb_revendedor;
    private javax.swing.JMenuItem jmi_Campañas;
    private javax.swing.JMenuItem jmi_DetallePedido;
    private javax.swing.JMenuItem jmi_Historixo;
    private javax.swing.JMenuItem jmi_Pedido;
    // End of variables declaration//GEN-END:variables
}
