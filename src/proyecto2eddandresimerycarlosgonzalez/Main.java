/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

import java.util.Date;

/**
 *
 * @author andresimery
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ABB<Reserva> arbol = new ABB<>();
        
        Cliente cliente1 = new Cliente(12345, "Name", "LastName", "email@correo.com", "04242773364", "msculino");
        Reserva reserva1 = new Reserva(cliente1, "doble", new Date(25), new Date(26));
        Cliente cliente2 = new Cliente(123456, "Andres", "Imery", "emailimery@correo.com", "04242563364", "Macho");
        Reserva reserva2 = new Reserva(cliente2, "single", new Date(20), new Date(21));
        arbol.insertReserva(arbol.getRoot(), reserva1);
        arbol.insertReserva(arbol.getRoot(), reserva2);
    }
    
}
