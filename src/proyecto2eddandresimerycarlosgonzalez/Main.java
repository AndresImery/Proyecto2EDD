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
        Function func = new Function();
        ABB<Habitacion> arbol_habitaciones = new ABB<>();
        ABB<Reserva> arbol_reservas = new ABB<>();
        Hash hash = new Hash();
        
//        Habitacion habitacion1 = new Habitacion(12, "doble", 2);
//        Habitacion habitacion2 = new Habitacion(14, "single", 1);
//        
//        
//        
//        Cliente cliente1 = new Cliente(12345, "Name", "LastName", "email@correo.com", "04242773364", "msculino");
//        Reserva reserva1 = new Reserva(cliente1, "doble", new Date(25), new Date(26));
//        Cliente cliente2 = new Cliente(123456, "Andres", "Imery", "emailimery@correo.com", "04242563364", "Macho");
//        Reserva reserva2 = new Reserva(cliente2, "single", new Date(20), new Date(21));
//        
//        Estado estado1 = new Estado(habitacion1, cliente1, reserva1.getLlegada());
//        habitacion1.setEstado(estado1);
//        Estado estado2 = new Estado(habitacion2, cliente2, reserva2.getLlegada());
//        habitacion2.setEstado(estado2);
//        
//        hash.addEstado(estado1);
//        hash.addEstado(estado2);
//        
//        hash.printHash();
//        
//        hash.deleteEstado("Andres", "Imery");
//        System.out.println("--");
//        hash.printHash();
//        hash.addEstado(estado2);
//        System.out.println("--1");
//        hash.printHash();
//        
//        arbol.insertReserva(arbol.getRoot(), reserva1);
//        arbol.insertReserva(arbol.getRoot(), reserva2);
        
       
        
//        arbol.insertReserva(arbol.getRoot(), reserva1);
//        arbol.insertReserva(arbol.getRoot(), reserva2);
//        arbol.insertReserva(arbol.getRoot(), reserva3);
//        arbol.printReservaInOrder( arbol.getRoot());
//        System.out.println("-----------");
//        arbol.deleteReserva(arbol.getRoot(), reserva3);
//        arbol.printReservaInOrder( arbol.getRoot());
//        System.out.println("-----------");
//        arbol.deleteReserva(arbol.getRoot(), reserva3);
//        arbol.printReservaInOrder( arbol.getRoot());

        func.readCSVs(arbol_habitaciones, arbol_reservas, hash);
        
        arbol_habitaciones.printHabitacionInOrder(arbol_habitaciones.getRoot());
        System.out.println("-------------------------------------------");
        hash.printHash();
        System.out.println("-------------------------------------------");
        arbol_reservas.printReservaInOrder(arbol_reservas.getRoot());
    }
    
}
