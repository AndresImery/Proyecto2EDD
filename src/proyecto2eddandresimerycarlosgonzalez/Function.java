/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author andresimery
 */
public class Function {
    
    public void readCSVs(ABB<Habitacion> arbol_habitaciones, ABB<Reserva> arbol_reservas, Hash hash) {
        
        try {
            File myObj;
            myObj = new File("habitaciones.csv");
//            if (file == null) {
//                myObj = new File("csv/habitaciones.csv");
//            } else {
//                myObj = file;
//
//            }
            if (myObj.createNewFile()) {
                System.out.println("Archivo creado: " + myObj.getName());
            } else {
                System.out.println("Archivo existe.");
                Scanner myReader = new Scanner(myObj);
                String data = myReader.nextLine();
                while (myReader.hasNextLine()) {
                    data = myReader.nextLine();
//                    System.out.println(data);
                    String split[] = data.split(",");
                    Habitacion habitacion = new Habitacion(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]));
                    arbol_habitaciones.insertHabitacion(arbol_habitaciones.getRoot(), habitacion);
                    System.out.println(habitacion.getNum() + " " + habitacion.getTipo() + " " + habitacion.getPiso());
                    
                    
                }
                myReader.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        

    }
    
//    public ABB<Reserva> readCSVReservas() {
//        try {
//            File myObj;
//            myObj = new File("csv/habitaciones.csv");
////            if (file == null) {
////                myObj = new File("csv/habitaciones.csv");
////            } else {
////                myObj = file;
////
////            }
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//                Scanner myReader = new Scanner(myObj);
//                while (myReader.hasNextLine()) {
//                    String data = myReader.nextLine();
//                    // Aqui crear arbol
//                    
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//    
//    public Hash readCSVEstado() {
//        //
//    }
//    
}
