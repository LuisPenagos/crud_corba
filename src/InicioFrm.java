/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucho
 */
public class InicioFrm extends javax.swing.JFrame {

    /**
     * Creates new form InicioFrm
     */
    public InicioFrm() {
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

        BtnPersonaFrm = new javax.swing.JButton();
        BtnGeneroFrm = new javax.swing.JButton();
        BtnEstadoFrm = new javax.swing.JButton();
        Inicio = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 51));

        BtnPersonaFrm.setBackground(new java.awt.Color(0, 0, 255));
        BtnPersonaFrm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnPersonaFrm.setText("Usuarios");
        BtnPersonaFrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPersonaFrmActionPerformed(evt);
            }
        });

        BtnGeneroFrm.setBackground(new java.awt.Color(255, 255, 0));
        BtnGeneroFrm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnGeneroFrm.setText("Genero");
        BtnGeneroFrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGeneroFrmActionPerformed(evt);
            }
        });

        BtnEstadoFrm.setBackground(new java.awt.Color(255, 0, 0));
        BtnEstadoFrm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnEstadoFrm.setText("Estado");
        BtnEstadoFrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEstadoFrmActionPerformed(evt);
            }
        });

        Inicio.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Inicio.setForeground(new java.awt.Color(153, 0, 0));
        Inicio.setText("Bienvenidos");

        BtnSalir.setBackground(new java.awt.Color(204, 0, 153));
        BtnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione una Opción:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPersonaFrm)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGeneroFrm, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(BtnEstadoFrm)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Inicio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Inicio)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPersonaFrm)
                    .addComponent(BtnGeneroFrm)
                    .addComponent(BtnEstadoFrm))
                .addGap(18, 18, 18)
                .addComponent(BtnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPersonaFrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPersonaFrmActionPerformed
        PersonaFrm verFormularioPersona = new PersonaFrm();
        verFormularioPersona.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnPersonaFrmActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnGeneroFrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGeneroFrmActionPerformed
        GeneroFrm verFormularioGenero = new GeneroFrm();
        verFormularioGenero.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnGeneroFrmActionPerformed

    private void BtnEstadoFrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEstadoFrmActionPerformed
        EstadoFrm verFormularioEstado = new EstadoFrm();
        verFormularioEstado.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnEstadoFrmActionPerformed

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
            java.util.logging.Logger.getLogger(InicioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEstadoFrm;
    private javax.swing.JButton BtnGeneroFrm;
    private javax.swing.JButton BtnPersonaFrm;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
