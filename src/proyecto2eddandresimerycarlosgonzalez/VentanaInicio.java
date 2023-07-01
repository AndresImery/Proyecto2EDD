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
    private static Hash hash;
    private static ABB<Reserva> arbol_r;
    private static ABB<Habitacion> arbol_h;
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

        BuscarReserva = new javax.swing.JButton();
        TituloPortada = new javax.swing.JLabel();
        Tituloportada2 = new javax.swing.JLabel();
        NoSeFia = new javax.swing.JLabel();
        BuscarHuesped = new javax.swing.JButton();
        BuscarHistorial = new javax.swing.JButton();
        NuevaReserva = new javax.swing.JButton();
        CheckIn = new javax.swing.JButton();
        CheckOut = new javax.swing.JButton();
        GuardarExit = new javax.swing.JButton();
        FondoRecepcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(653, 406));
        setMinimumSize(new java.awt.Dimension(653, 406));
        setSize(new java.awt.Dimension(653, 406));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuscarReserva.setText("Buscar Reservacion");
        getContentPane().add(BuscarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        TituloPortada.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        TituloPortada.setForeground(new java.awt.Color(255, 0, 0));
        TituloPortada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPortada.setText("Bienvenido al Hotel Booking");
        getContentPane().add(TituloPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 50));

        Tituloportada2.setBackground(new java.awt.Color(0, 0, 0));
        Tituloportada2.setFont(new java.awt.Font("Yu Gothic Medium", 3, 18)); // NOI18N
        Tituloportada2.setForeground(new java.awt.Color(255, 0, 0));
        Tituloportada2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tituloportada2.setText("¿En que podemos ser de inutilidad?");
        getContentPane().add(Tituloportada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 610, 60));

        NoSeFia.setBackground(new java.awt.Color(0, 0, 0));
        NoSeFia.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        NoSeFia.setForeground(new java.awt.Color(255, 0, 0));
        NoSeFia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoSeFia.setText("No se fia. Hay recargas de saldo");
        getContentPane().add(NoSeFia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 610, 40));

        BuscarHuesped.setText("Buscar Huesped");
        getContentPane().add(BuscarHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        BuscarHistorial.setText("Crear Reservacion");
        getContentPane().add(BuscarHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        NuevaReserva.setText("Buscar Historial de Habitacion");
        getContentPane().add(NuevaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        CheckIn.setText("Check In");
        getContentPane().add(CheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        CheckOut.setText("Check Out");
        getContentPane().add(CheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        GuardarExit.setText("Guardar y Salir");
        getContentPane().add(GuardarExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        FondoRecepcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FondoRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2eddandresimerycarlosgonzalez/fondorecepcion.jpg"))); // NOI18N
        getContentPane().add(FondoRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    private javax.swing.JButton BuscarHistorial;
    private javax.swing.JButton BuscarHuesped;
    private javax.swing.JButton BuscarReserva;
    private javax.swing.JButton CheckIn;
    private javax.swing.JButton CheckOut;
    private javax.swing.JLabel FondoRecepcion;
    private javax.swing.JButton GuardarExit;
    private javax.swing.JLabel NoSeFia;
    private javax.swing.JButton NuevaReserva;
    private javax.swing.JLabel TituloPortada;
    private javax.swing.JLabel Tituloportada2;
    // End of variables declaration//GEN-END:variables
}