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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jmb_MenuAivon = new javax.swing.JMenuBar();
        jmb_Campañas = new javax.swing.JMenu();
        jmi_Campañas = new javax.swing.JMenuItem();
        jmi_Historixo = new javax.swing.JMenuItem();
        jm_Pedido = new javax.swing.JMenu();
        jmi_Pedido = new javax.swing.JMenuItem();
        jmi_DetallePedido = new javax.swing.JMenuItem();
        jmb_revendedor = new javax.swing.JMenu();
        jm_Producto = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 148, 126));
        jDesktopPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jDesktopPane1.setForeground(new java.awt.Color(255, 148, 126));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jmb_MenuAivon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jmb_MenuAivon.setForeground(new java.awt.Color(255, 148, 126));
        jmb_MenuAivon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        jmi_Pedido.setText("Pedido");
        jm_Pedido.add(jmi_Pedido);

        jmi_DetallePedido.setText("Detalle Pedido");
        jm_Pedido.add(jmi_DetallePedido);

        jmb_MenuAivon.add(jm_Pedido);

        jmb_revendedor.setText("Revendedor ");
        jmb_MenuAivon.add(jmb_revendedor);

        jm_Producto.setText("Producto");
        jmb_MenuAivon.add(jm_Producto);

        setJMenuBar(jmb_MenuAivon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_HistorixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_HistorixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_HistorixoActionPerformed

    private void jmi_CampañasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CampañasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_CampañasActionPerformed

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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
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
