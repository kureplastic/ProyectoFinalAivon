/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class VistaCampaña extends javax.swing.JPanel {

    /**
     * Creates new form VistaCampaña
     */
    public VistaCampaña() {
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
        jl_TituloCampaña = new javax.swing.JLabel();
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
        jtf_EstrellasPorCampaña = new javax.swing.JTextField();
        jb_Buscar = new javax.swing.JButton();
        jb_Cargar = new javax.swing.JButton();
        jb_Borrar = new javax.swing.JButton();
        jb_Actualizar = new javax.swing.JButton();
        jb_Listar = new javax.swing.JButton();
        jb_Limpiar = new javax.swing.JButton();

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setVisible(true);

        jl_TituloCampaña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_TituloCampaña.setForeground(new java.awt.Color(0, 0, 255));
        jl_TituloCampaña.setText("-Campaña-");

        jl_IdCampaña.setText("Id Campaña");

        jl_FechaInicio.setText("Fecha Inicio ");

        jl_FechaFinal.setText("Fecha Final");

        jl_MontoMinimo.setText("Monto Minimo");

        jl_MontoMaximo.setText("Monto Maximo");

        jl_EstrellaPorCampaña.setText("Estrellas Por Camapaña");

        jb_Buscar.setText("Buscar");

        jb_Cargar.setText("Cargar");

        jb_Borrar.setText("Borrar");

        jb_Actualizar.setText("Actualizar");

        jb_Listar.setText("Listar");

        jb_Limpiar.setText("Limpiar");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jl_TituloCampaña))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_IdCampaña)
                            .addComponent(jl_FechaInicio)
                            .addComponent(jl_FechaFinal)
                            .addComponent(jl_MontoMinimo)
                            .addComponent(jl_MontoMaximo)
                            .addComponent(jl_EstrellaPorCampaña))
                        .addGap(45, 45, 45)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_IdCampaña)
                            .addComponent(jtf_FechaInicio)
                            .addComponent(jtf_FechaFinal)
                            .addComponent(jtf_MontoMinimo)
                            .addComponent(jtf_MontoMaximo)
                            .addComponent(jtf_EstrellasPorCampaña))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Buscar)
                    .addComponent(jb_Cargar)
                    .addComponent(jb_Borrar)
                    .addComponent(jb_Actualizar)
                    .addComponent(jb_Listar)
                    .addComponent(jb_Limpiar))
                .addGap(63, 63, 63))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_TituloCampaña)
                .addGap(14, 14, 14)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_IdCampaña)
                    .addComponent(jtf_IdCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_FechaInicio)
                    .addComponent(jtf_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Cargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_FechaFinal)
                    .addComponent(jtf_FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_MontoMinimo)
                    .addComponent(jtf_MontoMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_MontoMaximo)
                    .addComponent(jtf_MontoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Listar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_EstrellaPorCampaña)
                    .addComponent(jtf_EstrellasPorCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Limpiar))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JButton jb_Actualizar;
    private javax.swing.JButton jb_Borrar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Cargar;
    private javax.swing.JButton jb_Limpiar;
    private javax.swing.JButton jb_Listar;
    private javax.swing.JLabel jl_EstrellaPorCampaña;
    private javax.swing.JLabel jl_FechaFinal;
    private javax.swing.JLabel jl_FechaInicio;
    private javax.swing.JLabel jl_IdCampaña;
    private javax.swing.JLabel jl_MontoMaximo;
    private javax.swing.JLabel jl_MontoMinimo;
    private javax.swing.JLabel jl_TituloCampaña;
    private javax.swing.JTextField jtf_EstrellasPorCampaña;
    private javax.swing.JTextField jtf_FechaFinal;
    private javax.swing.JTextField jtf_FechaInicio;
    private javax.swing.JTextField jtf_IdCampaña;
    private javax.swing.JTextField jtf_MontoMaximo;
    private javax.swing.JTextField jtf_MontoMinimo;
    // End of variables declaration//GEN-END:variables
}
