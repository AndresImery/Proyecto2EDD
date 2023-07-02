/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

/**
 *
 * @author Carlo
 */
public class BuscarReserva extends javax.swing.JFrame {
    private static VentanaInicio inicio;
    /**
     * Creates new form BuscarReserva
     */
    public BuscarReserva(VentanaInicio inicio) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        this.inicio = inicio;
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
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelBNombre = new javax.swing.JLabel();
        jLabelBApellido = new javax.swing.JLabel();
        jLabelBEmail = new javax.swing.JLabel();
        jLabelBGenero = new javax.swing.JLabel();
        jLabelBNombre1 = new javax.swing.JLabel();
        jLabelBNombre2 = new javax.swing.JLabel();
        jLabelBNombre3 = new javax.swing.JLabel();
        jLabelBNombre4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(612, 406));
        setMinimumSize(new java.awt.Dimension(612, 406));
        setSize(new java.awt.Dimension(612, 406));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(612, 406));
        jPanel1.setPreferredSize(new java.awt.Dimension(612, 406));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 120, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CHECK-IN HOTEL BOOKING");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 620, 70));

        jButtonVolver.setBackground(new java.awt.Color(0, 0, 0));
        jButtonVolver.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(255, 153, 0));
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jLabelBNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelBNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 340, 20));

        jLabelBApellido.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBApellido.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelBApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 340, 20));

        jLabelBEmail.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBEmail.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelBEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 360, 20));

        jLabelBGenero.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBGenero.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelBGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 340, 20));

        jLabelBNombre1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBNombre1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelBNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 220, 20));

        jLabelBNombre2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBNombre2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelBNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 240, 20));

        jLabelBNombre3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBNombre3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelBNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 230, 20));

        jLabelBNombre4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBNombre4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelBNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 240, 20));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 100, 30));

        jLabel3.setBackground(new java.awt.Color(255, 153, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("<html>\nIngrese la cedula del cliente:<br>\nNombre:<br>\nApellido:<br>\nEmail:<br>\nGenero:<br>\nTipo de Habitacion:<br>\nTelefono Celular:<br>\nFecha de Llegada:<br>\nFecha de Salida:\n<html>\n");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 620, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2eddandresimerycarlosgonzalez/fondorecepcion.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarReserva(inicio).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBApellido;
    private javax.swing.JLabel jLabelBEmail;
    private javax.swing.JLabel jLabelBGenero;
    private javax.swing.JLabel jLabelBNombre;
    private javax.swing.JLabel jLabelBNombre1;
    private javax.swing.JLabel jLabelBNombre2;
    private javax.swing.JLabel jLabelBNombre3;
    private javax.swing.JLabel jLabelBNombre4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
