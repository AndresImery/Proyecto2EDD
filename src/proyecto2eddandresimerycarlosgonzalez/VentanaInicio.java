/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

import java.util.Date;
/**
 *
 * @author Carlo
 */
public class VentanaInicio extends javax.swing.JFrame {
    private static Hash hash;
    private static ABB<Habitacion> arbol_h;
    private static ABB<Reserva> arbol_r;
    /**
     * Creates new form VentanaInicio
     */
    public VentanaInicio(Hash hash, ABB<Habitacion> arbol_h, ABB<Reserva> arbol_r) {
        
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        this.hash = hash;
        this.arbol_h = arbol_h;
        this.arbol_r = arbol_r;
        
    }
    
    public Hash getHash() {
        return this.hash;
    }
    
    public ABB<Habitacion> getArbolH() {
        return this.arbol_h;
    }
    
    public ABB<Reserva> getArbolR() {
        return this.arbol_r;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButtonSearchReserva = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Guardar Cambios y Cerrar el Programa");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jButton7.setText("Check-In");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 217, -1, -1));

        jButtonSearchReserva.setText("Buscar Reservacion");
        jButtonSearchReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchReservaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSearchReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 141, -1, -1));

        jButton8.setText("Check-Out");
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 217, -1, -1));

        jButton2.setText("Buscar Huesped");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 141, -1, -1));

        jButton3.setText("Buscar Historial de Huespedes por Habitacion");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 182, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido al Hotel EuroMet");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 400, 34));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("¿Que gestión desea realizar?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 66, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 153, 51));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Hacer una Nueva Reservacion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 106, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 153, 51));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Borrar una reservacion");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 106, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonSearchReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchReservaActionPerformed
        new BuscarReservacion(this);
        this.setVisible(false);
        
        this.getHash().printHash();
    }//GEN-LAST:event_jButtonSearchReservaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio(hash, arbol_h, arbol_r).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonSearchReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
