/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class VistaPedido extends javax.swing.JPanel {

    /**
     * Creates new form VistaPedido
     */
    public VistaPedido() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jl_TituloPedido = new javax.swing.JLabel();
        jl_IdPedido = new javax.swing.JLabel();
        jl_IdRevendedor = new javax.swing.JLabel();
        jl_IdCampaña = new javax.swing.JLabel();
        jl_FechaIngreso = new javax.swing.JLabel();
        jl_FechaEntrega = new javax.swing.JLabel();
        jl_FechaPago = new javax.swing.JLabel();
        jl_CantidadDeCajas = new javax.swing.JLabel();
        jl_EstrellaPorPedio = new javax.swing.JLabel();
        jl_Estado = new javax.swing.JLabel();
        jtf_IdPedido = new javax.swing.JTextField();
        jtf_IdRevendedor = new javax.swing.JTextField();
        jtf_IdCampaña = new javax.swing.JTextField();
        jtf_FechaIngreso = new javax.swing.JTextField();
        jtf_FechaEntrega = new javax.swing.JTextField();
        jtf_FechaPago = new javax.swing.JTextField();
        jtf_CantidadDeCajas = new javax.swing.JTextField();
        jtf_EstrellasPorPedido = new javax.swing.JTextField();
        jtf_EstadoPedido = new javax.swing.JTextField();
        jb_Guardar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();
        jb_Buscar = new javax.swing.JButton();
        jb_Actualizar = new javax.swing.JButton();
        jb_ListarPedido = new javax.swing.JButton();
        jb_PedidosPorCampaña = new javax.swing.JButton();

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setVisible(true);

        jl_TituloPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_TituloPedido.setForeground(new java.awt.Color(0, 0, 255));
        jl_TituloPedido.setText("-Pedido-");

        jl_IdPedido.setText("Id Pedido");

        jl_IdRevendedor.setText("Id Revendedor");

        jl_IdCampaña.setText("Id Campaña");

        jl_FechaIngreso.setText("Fecha Ingreso");

        jl_FechaEntrega.setText("Fecha Entrega");

        jl_FechaPago.setText("Fecha Pago");

        jl_CantidadDeCajas.setText("Cantidad de Cajas");

        jl_EstrellaPorPedio.setText("Estrella Por Pedido");

        jl_Estado.setText("Estado Pedido");

        jtf_EstadoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_EstadoPedidoActionPerformed(evt);
            }
        });

        jb_Guardar.setText("Guardar");

        jb_Eliminar.setText("Eliminar");

        jb_Buscar.setText("Buscar");

        jb_Actualizar.setText("Actualizar");

        jb_ListarPedido.setText("Listar Pedido");

        jb_PedidosPorCampaña.setText("Pedidos Por Campaña");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl_TituloPedido)
                .addGap(306, 306, 306))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jl_Estado)
                        .addGap(112, 112, 112)
                        .addComponent(jtf_EstadoPedido))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jl_EstrellaPorPedio)
                        .addGap(91, 91, 91)
                        .addComponent(jtf_EstrellasPorPedido))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jl_IdPedido)
                        .addGap(135, 135, 135)
                        .addComponent(jtf_IdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jl_IdRevendedor)
                        .addGap(108, 108, 108)
                        .addComponent(jtf_IdRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jl_IdCampaña)
                        .addGap(122, 122, 122)
                        .addComponent(jtf_IdCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jl_FechaIngreso)
                        .addGap(111, 111, 111)
                        .addComponent(jtf_FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_FechaEntrega)
                            .addComponent(jl_FechaPago)
                            .addComponent(jl_CantidadDeCajas))
                        .addGap(92, 92, 92)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_FechaPago, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jtf_FechaEntrega)
                            .addComponent(jtf_CantidadDeCajas))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Guardar)
                    .addComponent(jb_Eliminar)
                    .addComponent(jb_Buscar)
                    .addComponent(jb_Actualizar)
                    .addComponent(jb_ListarPedido)
                    .addComponent(jb_PedidosPorCampaña))
                .addGap(107, 107, 107))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_TituloPedido)
                .addGap(30, 30, 30)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_IdPedido)
                    .addComponent(jtf_IdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Guardar))
                .addGap(7, 7, 7)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_IdRevendedor)
                    .addComponent(jtf_IdRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_IdCampaña)
                    .addComponent(jtf_IdCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Buscar))
                .addGap(3, 3, 3)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_FechaIngreso)
                    .addComponent(jtf_FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_FechaEntrega)
                    .addComponent(jtf_FechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_ListarPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_FechaPago)
                    .addComponent(jtf_FechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_PedidosPorCampaña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CantidadDeCajas)
                    .addComponent(jtf_CantidadDeCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_EstrellaPorPedio)
                    .addComponent(jtf_EstrellasPorPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Estado)
                    .addComponent(jtf_EstadoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_EstadoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_EstadoPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_EstadoPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JButton jb_Actualizar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Guardar;
    private javax.swing.JButton jb_ListarPedido;
    private javax.swing.JButton jb_PedidosPorCampaña;
    private javax.swing.JLabel jl_CantidadDeCajas;
    private javax.swing.JLabel jl_Estado;
    private javax.swing.JLabel jl_EstrellaPorPedio;
    private javax.swing.JLabel jl_FechaEntrega;
    private javax.swing.JLabel jl_FechaIngreso;
    private javax.swing.JLabel jl_FechaPago;
    private javax.swing.JLabel jl_IdCampaña;
    private javax.swing.JLabel jl_IdPedido;
    private javax.swing.JLabel jl_IdRevendedor;
    private javax.swing.JLabel jl_TituloPedido;
    private javax.swing.JTextField jtf_CantidadDeCajas;
    private javax.swing.JTextField jtf_EstadoPedido;
    private javax.swing.JTextField jtf_EstrellasPorPedido;
    private javax.swing.JTextField jtf_FechaEntrega;
    private javax.swing.JTextField jtf_FechaIngreso;
    private javax.swing.JTextField jtf_FechaPago;
    private javax.swing.JTextField jtf_IdCampaña;
    private javax.swing.JTextField jtf_IdPedido;
    private javax.swing.JTextField jtf_IdRevendedor;
    // End of variables declaration//GEN-END:variables
}
