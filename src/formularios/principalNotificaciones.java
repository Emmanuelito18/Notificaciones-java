/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author Emmanuel
 */
public class principalNotificaciones extends javax.swing.JFrame {

    /**
     * Creates new form principalNotificaciones
     */
    public principalNotificaciones() {
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

        pnl_titulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_cuerpo = new javax.swing.JPanel();
        lbl_opcionesNotificaciones = new javax.swing.JLabel();
        btn_notificacionesJava = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_notificacionesDS = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prueba de notificaciones en Java");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_titulo.setBackground(new java.awt.Color(51, 51, 255));
        pnl_titulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lbl_titulo.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Prueba de notificaciones en Java");

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        getContentPane().add(pnl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        lbl_opcionesNotificaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_opcionesNotificaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_opcionesNotificaciones.setText("Opciones de notificaciones");

        btn_notificacionesJava.setText("Java");

        jButton2.setText("jButton2");

        btn_notificacionesDS.setText("DS");

        jButton4.setText("jButton4");

        javax.swing.GroupLayout pnl_cuerpoLayout = new javax.swing.GroupLayout(pnl_cuerpo);
        pnl_cuerpo.setLayout(pnl_cuerpoLayout);
        pnl_cuerpoLayout.setHorizontalGroup(
            pnl_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_opcionesNotificaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(pnl_cuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_notificacionesJava)
                    .addComponent(btn_notificacionesDS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(42, 42, 42))
        );
        pnl_cuerpoLayout.setVerticalGroup(
            pnl_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_opcionesNotificaciones)
                .addGap(36, 36, 36)
                .addGroup(pnl_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_notificacionesJava)
                    .addComponent(jButton2))
                .addGap(54, 54, 54)
                .addGroup(pnl_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_notificacionesDS)
                    .addComponent(jButton4))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_cuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(principalNotificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalNotificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalNotificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalNotificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalNotificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_notificacionesDS;
    private javax.swing.JButton btn_notificacionesJava;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel lbl_opcionesNotificaciones;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_cuerpo;
    private javax.swing.JPanel pnl_titulo;
    // End of variables declaration//GEN-END:variables
}
