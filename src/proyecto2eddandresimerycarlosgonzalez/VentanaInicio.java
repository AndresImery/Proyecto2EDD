/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

/**
 *
 * @author Carlo
 */
public class VentanaInicio extends javax.swing.JFrame {
    public static Hash hash;
    public static ABB<Reserva> arbol_r;
    public static ABB<Habitacion> arbol_h;
    /**
     * Creates new form VentanaInicio
     */
    public VentanaInicio(Hash hash, ABB<Reserva> arbol_r, ABB<Habitacion> arbol_h) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        this.hash = hash;
        this.arbol_r = arbol_r;
        this.arbol_h = arbol_h;
    }
    public Hash getHash(){
        return this.hash;
    }
    public ABB<Reserva> getArbol_R(){
        return this.arbol_r;
    }
    public ABB<Habitacion> getArbol_H(){
        return this.arbol_h;
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
        BuscarReserva = new javax.swing.JButton();
        TituloPortada = new javax.swing.JLabel();
        Tituloportada2 = new javax.swing.JLabel();
        NoSeFia = new javax.swing.JLabel();
        BuscarHuesped = new javax.swing.JButton();
        CrearReserva = new javax.swing.JButton();
        BuscarHistorialHabitacion = new javax.swing.JButton();
        GuardarExit = new javax.swing.JButton();
        FondoRecepcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(612, 406));
        setMinimumSize(new java.awt.Dimension(612, 406));
        setResizable(false);
        setSize(new java.awt.Dimension(612, 406));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(612, 406));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuscarReserva.setBackground(new java.awt.Color(255, 153, 0));
        BuscarReserva.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BuscarReserva.setForeground(new java.awt.Color(0, 0, 0));
        BuscarReserva.setText("Buscar Reservacion / Check-In");
        BuscarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarReservaActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        TituloPortada.setBackground(new java.awt.Color(0, 0, 0));
        TituloPortada.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        TituloPortada.setForeground(new java.awt.Color(255, 153, 0));
        TituloPortada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPortada.setText("Bienvenido al Hotel Booking");
        TituloPortada.setOpaque(true);
        jPanel1.add(TituloPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        Tituloportada2.setBackground(new java.awt.Color(0, 0, 0));
        Tituloportada2.setFont(new java.awt.Font("Yu Gothic Medium", 3, 18)); // NOI18N
        Tituloportada2.setForeground(new java.awt.Color(255, 153, 0));
        Tituloportada2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tituloportada2.setText("¿Que quieres hacer pana?");
        Tituloportada2.setOpaque(true);
        jPanel1.add(Tituloportada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, 30));

        NoSeFia.setBackground(new java.awt.Color(0, 0, 0));
        NoSeFia.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        NoSeFia.setForeground(new java.awt.Color(255, 153, 0));
        NoSeFia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoSeFia.setText("No se fia. Hay recargas de saldo");
        NoSeFia.setOpaque(true);
        jPanel1.add(NoSeFia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 620, 30));

        BuscarHuesped.setBackground(new java.awt.Color(255, 153, 0));
        BuscarHuesped.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BuscarHuesped.setForeground(new java.awt.Color(0, 0, 0));
        BuscarHuesped.setText("Buscar Huesped / Check-Out");
        BuscarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarHuespedActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        CrearReserva.setBackground(new java.awt.Color(255, 153, 0));
        CrearReserva.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        CrearReserva.setForeground(new java.awt.Color(0, 0, 0));
        CrearReserva.setText("Crear Reservacion");
        CrearReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearReservaActionPerformed(evt);
            }
        });
        jPanel1.add(CrearReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        BuscarHistorialHabitacion.setBackground(new java.awt.Color(255, 153, 0));
        BuscarHistorialHabitacion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BuscarHistorialHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        BuscarHistorialHabitacion.setText("Buscar Historial de Habitacion");
        BuscarHistorialHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarHistorialHabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarHistorialHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        GuardarExit.setBackground(new java.awt.Color(255, 153, 0));
        GuardarExit.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        GuardarExit.setForeground(new java.awt.Color(0, 0, 0));
        GuardarExit.setText("Guardar y Salir");
        jPanel1.add(GuardarExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        FondoRecepcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FondoRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2eddandresimerycarlosgonzalez/fondorecepcion.jpg"))); // NOI18N
        jPanel1.add(FondoRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarReservaActionPerformed
        new BuscarReserva(this);
        setVisible(false);
    }//GEN-LAST:event_BuscarReservaActionPerformed

    private void BuscarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarHuespedActionPerformed
        new BuscarHuesped(this);
        setVisible(false);
    }//GEN-LAST:event_BuscarHuespedActionPerformed

    private void BuscarHistorialHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarHistorialHabitacionActionPerformed
        new HistorialHabitacion(this);
        setVisible(false);
    }//GEN-LAST:event_BuscarHistorialHabitacionActionPerformed

    private void CrearReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearReservaActionPerformed
        new ReservarEstadia(this);
        setVisible(false);
    }//GEN-LAST:event_CrearReservaActionPerformed

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
                new VentanaInicio(hash, arbol_r, arbol_h).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarHistorialHabitacion;
    private javax.swing.JButton BuscarHuesped;
    private javax.swing.JButton BuscarReserva;
    private javax.swing.JButton CrearReserva;
    private javax.swing.JLabel FondoRecepcion;
    private javax.swing.JButton GuardarExit;
    private javax.swing.JLabel NoSeFia;
    private javax.swing.JLabel TituloPortada;
    private javax.swing.JLabel Tituloportada2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
