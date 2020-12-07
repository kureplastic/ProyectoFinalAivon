package Vistas;

import entidades.*;
import static java.lang.Float.parseFloat;
import modelo.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VistaPedido extends javax.swing.JInternalFrame {

    private PedidoData pedidoData;
    private Conexion conexion;
    private CampañaData campañaData;
    private RevendedorData revendedorData;
    
    public VistaPedido() {
        initComponents();
        conexion = new Conexion();
        pedidoData = new PedidoData(conexion);
        campañaData= new CampañaData(conexion);
        revendedorData= new RevendedorData(conexion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jtf_EstrellasPorPedido = new javax.swing.JTextField();
        jtf_CantidadDeCajas = new javax.swing.JTextField();
        jtf_FechaPago = new javax.swing.JTextField();
        jtf_FechaEntrega = new javax.swing.JTextField();
        jtf_FechaIngreso = new javax.swing.JTextField();
        jtf_IdCampaña = new javax.swing.JTextField();
        jtf_IdRevendedor = new javax.swing.JTextField();
        jtf_IdPedido = new javax.swing.JTextField();
        jb_PedidosPorCampaña = new javax.swing.JButton();
        jb_ListarPedido = new javax.swing.JButton();
        jb_Actualizar = new javax.swing.JButton();
        jb_Buscar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();
        jb_Guardar = new javax.swing.JButton();
        jcb_EstadoPedido = new javax.swing.JCheckBox();
        jl_ImporteTotal = new javax.swing.JLabel();
        jtf_ImporteTotal = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jl_TituloPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_TituloPedido.setForeground(new java.awt.Color(0, 0, 225));
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

        jb_PedidosPorCampaña.setText("Pedidos Por Campaña");

        jb_ListarPedido.setText("Listar Pedido");

        jb_Actualizar.setText("Actualizar");

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        jb_Eliminar.setText("Eliminar");
        jb_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_EliminarActionPerformed(evt);
            }
        });

        jb_Guardar.setText("Guardar");
        jb_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarActionPerformed(evt);
            }
        });

        jcb_EstadoPedido.setText("Pedido Activo");

        jl_ImporteTotal.setText("Importe Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jl_TituloPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Estado)
                    .addComponent(jl_EstrellaPorPedio)
                    .addComponent(jl_IdPedido)
                    .addComponent(jl_IdRevendedor)
                    .addComponent(jl_IdCampaña)
                    .addComponent(jl_FechaIngreso)
                    .addComponent(jl_FechaEntrega)
                    .addComponent(jl_FechaPago)
                    .addComponent(jl_CantidadDeCajas)
                    .addComponent(jl_ImporteTotal))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_IdRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_IdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_IdCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_FechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_FechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_CantidadDeCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_EstrellasPorPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_ListarPedido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_Actualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_PedidosPorCampaña, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_Guardar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_Buscar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_EstadoPedido)
                            .addComponent(jtf_ImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_TituloPedido)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_IdPedido)
                    .addComponent(jtf_IdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Buscar))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_IdRevendedor)
                            .addComponent(jtf_IdRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_IdCampaña)
                            .addComponent(jtf_IdCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_FechaIngreso)
                            .addComponent(jtf_FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_FechaEntrega)
                            .addComponent(jtf_FechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jb_Actualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_ListarPedido)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_FechaPago)
                            .addComponent(jtf_FechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_CantidadDeCajas)
                            .addComponent(jtf_CantidadDeCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_EstrellaPorPedio)
                            .addComponent(jtf_EstrellasPorPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_Eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_PedidosPorCampaña)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_ImporteTotal)
                    .addComponent(jtf_ImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_EstadoPedido)
                    .addComponent(jl_Estado))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarActionPerformed
       Pedido p = new Pedido(-1, campañaData.buscarCampaña(Integer.parseInt(jtf_IdCampaña.getText())),
         revendedorData.buscarRevendedor(Integer.parseInt(jtf_IdRevendedor.getText())),
         LocalDate.parse(jtf_FechaIngreso.getText(),DateTimeFormatter.ofPattern("yyyy-MM-dd")),
       LocalDate.parse(jtf_FechaEntrega.getText(),DateTimeFormatter.ofPattern("yyyy-MM-dd")),
      LocalDate.parse(jtf_FechaPago.getText(),DateTimeFormatter.ofPattern("yyyy-MM-dd")),
      Integer.parseInt(jtf_CantidadDeCajas.getText()),  parseFloat(jtf_ImporteTotal.getText()), 
         Integer.parseInt(jtf_EstrellasPorPedido.getText()), jcb_EstadoPedido.isSelected());
       pedidoData.guardarPedido(p);
        jtf_IdPedido.setText(p.getIdPedido() + "");
    }//GEN-LAST:event_jb_GuardarActionPerformed

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
        int id = Integer.parseInt(jtf_IdPedido.getText());
        Pedido p = new Pedido();
        p = pedidoData.buscarPedido(id);
        if (p != null)
        {
            jtf_IdPedido.setText(p.getIdPedido() + "");
            jtf_IdRevendedor.setText(pedidoData.traerRevendedor(id) + "");
            jtf_IdCampaña.setText(pedidoData.traerCampaña(id) + "");
            jtf_FechaIngreso.setText(p.getFechaIngreso().toString());
            jtf_FechaEntrega.setText(p.getFechaEntrega().toString());
            jtf_FechaPago.setText(p.getFechaPago().toString());
            jtf_CantidadDeCajas.setText(p.getCantCajas() + "");
            jtf_EstrellasPorPedido.setText(p.getEstrellaXpedido() + "");
            jcb_EstadoPedido.setSelected(p.isEstadoPedido());           
        }
    }//GEN-LAST:event_jb_BuscarActionPerformed

    private void jb_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_EliminarActionPerformed
        int id = Integer.parseInt(jtf_IdPedido.getText());
        Pedido p = null;
        p = pedidoData.buscarPedido(id);
        pedidoData.eliminarPedido(p);
    }//GEN-LAST:event_jb_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Actualizar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Guardar;
    private javax.swing.JButton jb_ListarPedido;
    private javax.swing.JButton jb_PedidosPorCampaña;
    private javax.swing.JCheckBox jcb_EstadoPedido;
    private javax.swing.JLabel jl_CantidadDeCajas;
    private javax.swing.JLabel jl_Estado;
    private javax.swing.JLabel jl_EstrellaPorPedio;
    private javax.swing.JLabel jl_FechaEntrega;
    private javax.swing.JLabel jl_FechaIngreso;
    private javax.swing.JLabel jl_FechaPago;
    private javax.swing.JLabel jl_IdCampaña;
    private javax.swing.JLabel jl_IdPedido;
    private javax.swing.JLabel jl_IdRevendedor;
    private javax.swing.JLabel jl_ImporteTotal;
    private javax.swing.JLabel jl_TituloPedido;
    private javax.swing.JTextField jtf_CantidadDeCajas;
    private javax.swing.JTextField jtf_EstrellasPorPedido;
    private javax.swing.JTextField jtf_FechaEntrega;
    private javax.swing.JTextField jtf_FechaIngreso;
    private javax.swing.JTextField jtf_FechaPago;
    private javax.swing.JTextField jtf_IdCampaña;
    private javax.swing.JTextField jtf_IdPedido;
    private javax.swing.JTextField jtf_IdRevendedor;
    private javax.swing.JTextField jtf_ImporteTotal;
    // End of variables declaration//GEN-END:variables
}
