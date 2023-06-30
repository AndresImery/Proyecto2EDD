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
        Hash hash = new Hash();
        
        Habitacion habitacion1 = new Habitacion(12, "doble", 2, null);
        Habitacion habitacion2 = new Habitacion(14, "single", 1, null);
        
        
        
        Cliente cliente1 = new Cliente(12345, "Name", "LastName", "email@correo.com", "04242773364", "msculino");
        Reserva reserva1 = new Reserva(cliente1, "doble", new Date(25), new Date(26));
        Cliente cliente2 = new Cliente(123456, "Andres", "Imery", "emailimery@correo.com", "04242563364", "Macho");
        Reserva reserva2 = new Reserva(cliente2, "single", new Date(20), new Date(21));
        
        Estado estado1 = new Estado(habitacion1, cliente1, reserva1.getLlegada());
        habitacion1.setEstado(estado1);
        Estado estado2 = new Estado(habitacion2, cliente2, reserva2.getLlegada());
        habitacion2.setEstado(estado2);
        
        hash.addEstado(estado1);
        hash.addEstado(estado2);
        
        hash.printHash();
        
        arbol.insertReserva(arbol.getRoot(), reserva1);
        arbol.insertReserva(arbol.getRoot(), reserva2);
        
        
    }
    
}
