/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

//import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
import java.lang.Exception;
/**
 *
 * @author Carlo
 */
public class BuscarHuesped extends javax.swing.JFrame {
    private static VentanaInicio inicio;
    private Estado estado;
    /**
     * Creates new form BuscarHuesped
     */
    public BuscarHuesped(VentanaInicio inicio) {
        initComponents();
        this.jLabelCedula.setVisible(false);
        this.jTextFieldCedula.setVisible(false);
        setLocationRelativeTo(null);
        setVisible(true);
        this.inicio = inicio;
        this.estado = null;
    }
    
    public VentanaInicio getInicio() {
        return this.inicio;
    }
    
    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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
        jLabelNumeroHabitacion = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabelGenero = new javax.swing.JLabel();
        jLabelLlegada = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonCheckOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(612, 406));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(612, 406));
        jPanel1.setMinimumSize(new java.awt.Dimension(612, 406));
        jPanel1.setPreferredSize(new java.awt.Dimension(612, 406));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNumeroHabitacion.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelNumeroHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelNumeroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 110, 30));

        jLabelCedula.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabelCedula.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCedula.setText("Ingrese su cédula:");
        jPanel1.add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 170, 40));
        jPanel1.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 180, -1));

        jButtonBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 153, 0));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, 30));

        jLabelGenero.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 230, 30));

        jLabelLlegada.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelLlegada.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 180, 30));

        jTextFieldApellido.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldApellido.setForeground(new java.awt.Color(255, 153, 0));
        jTextFieldApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldApellido.setText("Apellido");
        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, 30));

        jLabelCorreo.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 500, 30));

        jTextFieldNombre.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(255, 153, 0));
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.setText("Nombre");
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 110, 30));

        jLabelTelefono.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 190, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hotel Booking Hospedaje");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 60));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Informacion del Huesped:");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 310, 30));

        jButtonVolver.setBackground(new java.awt.Color(0, 0, 0));
        jButtonVolver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(255, 153, 0));
        jButtonVolver.setText("Volver a la Ventana de Inicio");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jButtonCheckOut.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCheckOut.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCheckOut.setForeground(new java.awt.Color(255, 153, 0));
        jButtonCheckOut.setText("Check-Out");
        jButtonCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckOutActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 153, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("<html>\nNumero de Habitacion:<br>\nEmail:<br>\nGenero:<br>\nTelefono Celular:<br>\nLlegada:\n<html>");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2eddandresimerycarlosgonzalez/fondorecepcion.jpg"))); // NOI18N
        jLabel1.setText("jLabel2");
        jLabel1.setMaximumSize(new java.awt.Dimension(612, 406));
        jLabel1.setMinimumSize(new java.awt.Dimension(612, 406));
        jLabel1.setPreferredSize(new java.awt.Dimension(612, 406));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String nombre = this.jTextFieldNombre.getText();
        String apellido = this.jTextFieldApellido.getText();
        Estado estado = getInicio().getHash().getEstado(nombre, apellido);
        this.estado = estado;
        if (estado != null) {
            if (estado.getHabitacion() != null) {
                this.jLabelNumeroHabitacion.setText(String.valueOf(estado.getHabitacion().getNum()));
            } else {
                this.jLabelNumeroHabitacion.setText("No se ubica en una habitación");
            }
            this.jLabelCorreo.setText(estado.getCliente().getCorreo());
            this.jLabelGenero.setText(estado.getCliente().getGenero());
            this.jLabelTelefono.setText(estado.getCliente().getCelular());

            String llegada = estado.getLlegada().toString();
            estado.getLlegada().getYear();
            System.out.println(llegada);
            this.jLabelLlegada.setText(estado.getLlegada().getDate() + "/" + estado.getLlegada().getMonth() + "/" + estado.getLlegada().getYear());
//            this.setEstado(estado);
            if (estado.getCliente().getCedula() == null) {
                this.jLabelCedula.setVisible(true);
                this.jTextFieldCedula.setVisible(true);
            }
        } else {
            new JOptionPane().showMessageDialog(null, "El CLiente no ha sido encontrado.");
        }
        
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckOutActionPerformed
        if (this.estado != null) { 
            if (getEstado().getCliente().getCedula() == null) {
                ////
//                new JOptionPane().showMessageDialog(null, "aqui");
                String cedula_string = this.jTextFieldCedula.getText();
                if (cedula_string.matches("\\d+")) {
                    Integer cedula = Integer.parseInt(this.jTextFieldCedula.getText());
                    getEstado().getCliente().setCedula(cedula);
                } else {
                    new JOptionPane().showMessageDialog(null, "La cédula debe ser unicamente números. (sin \".\")");
                    getInicio().setVisible(true);
                    this.dispose();
                }
                
                ////
//                try {
//                    Integer cedula = Integer.parseInt(this.jTextFieldCedula.getText());
//                    getEstado().getCliente().setCedula(cedula);
//                    getEstado().getCliente().setCedula(cedula);
//                } catch (Exception e) {
//                    new JOptionPane().showMessageDialog(null, "La cédula debe ser unicamente números. (sin \".\")");
//                }
            } 
            if (getEstado().getCliente().getCedula() != null) {
                if (getEstado().getHabitacion() != null) {
                    Habitacion habitacion = getEstado().getHabitacion();
                    Historico historico = new Historico(getEstado().getCliente(), getEstado().getLlegada(), habitacion);
                    habitacion.getHistoricos().insertLast(historico);
                    habitacion.setEstado(null);
                }
                getInicio().getHash().deleteEstado(getEstado().getCliente().getNombre(), getEstado().getCliente().getApellido());
                new JOptionPane().showMessageDialog(null, "El cliente ha realizado Check-Out");
                this.inicio.setVisible(true);
                this.dispose();
            }
        } else {
            new JOptionPane().showMessageDialog(null, "No ha buscado a ningun huesped");
        }
    }//GEN-LAST:event_jButtonCheckOutActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarHuesped(inicio).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCheckOut;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelLlegada;
    private javax.swing.JLabel jLabelNumeroHabitacion;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
