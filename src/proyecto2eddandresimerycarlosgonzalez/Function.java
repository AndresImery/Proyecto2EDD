/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

import java.io.File;
import java.io.IOException;
import java.util.Date;
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
//                    System.out.println(habitacion.getNum() + " " + habitacion.getTipo() + " " + habitacion.getPiso());
                    
                    
                }
                myReader.close();
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }
        
        try {
            File myObj;
            myObj = new File("estado.csv");
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
                    if (!data.startsWith(",")) {
                        String split[] = data.split(",");
                        Cliente cliente = new Cliente(null, split[1], split[2], split[3], split[5], split[4]);
                        Habitacion habitacion = arbol_habitaciones.searchHabitacionNum(arbol_habitaciones.getRoot(), Integer.parseInt(split[0]));
                        String date_split[] = split[6].split("/");
                        Date date = new Date(Integer.parseInt(date_split[2]), Integer.parseInt(date_split[1]), Integer.parseInt(date_split[0]));
                        Estado estado = new Estado(habitacion, cliente, date);
                        habitacion.setEstado(estado);
                        hash.addEstado(estado);
                    } else {
                        // si no tienen habitacion
                        String split[] = data.split(",");
                        Cliente cliente = new Cliente(null, split[1], split[2], split[3], split[5], split[4]);
                        String date_split[] = split[6].split("/");
                        Date date = new Date(Integer.parseInt(date_split[2]), Integer.parseInt(date_split[1]), Integer.parseInt(date_split[0]));
                        Estado estado = new Estado(null, cliente, date);
                        hash.addEstado(estado);
                    }
                    
                }
                myReader.close();
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }
        
        try {
            File myObj;
            myObj = new File("historico.csv");
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
                    // 0 cedula, 1 nombre, 2 apellido, 3 email, 4 genero, 5 llegada, 6 num_hab
                    
                    String split[] = data.split(",");
                    
                    String date_split[] = split[5].split("/");
                    Date date = new Date(Integer.parseInt(date_split[2]), Integer.parseInt(date_split[1]), Integer.parseInt(date_split[0]));
                    String cedula = split[0].replace(".", "");
                    
                    Habitacion habitacion = arbol_habitaciones.searchHabitacionNum(arbol_habitaciones.getRoot(), Integer.parseInt(split[6]));
                    Cliente cliente = new Cliente(Integer.parseInt(cedula), split[1], split[2], split[3], null, split[4]);
                    cliente.setHabitacion(habitacion);
                    Historico historico = new Historico(cliente, date, habitacion);
                    habitacion.addHistorico(historico);
                    
                    
                }
                myReader.close();
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }
        
        try {
            File myObj;
            myObj = new File("reservas.csv");
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
                    // 0 cedula, 1 nombre, 2 apellido, 3 email, 4 genero, 5 tipo_habitacion, 6 celular, 7 llegada, 8 salida
                    
                    String split[] = data.split(",");
                    
                    String date_split[] = split[7].split("/");
                    Date date_llegada = new Date(Integer.parseInt(date_split[2]), Integer.parseInt(date_split[1]), Integer.parseInt(date_split[0]));
                    String date_split_salida[] = split[8].split("/");
                    Date date_salida = new Date(Integer.parseInt(date_split_salida[2]), Integer.parseInt(date_split_salida[1]), Integer.parseInt(date_split_salida[0]));
                    String cedula = split[0].replace(".", "");
                    
                    Cliente cliente = new Cliente(Integer.parseInt(cedula), split[1], split[2], split[3], split[6], split[4]);
                    Reserva reserva = new Reserva(cliente, split[5], date_llegada, date_salida);
                    
                    arbol_reservas.insertReserva(arbol_reservas.getRoot(), reserva);
                    
                    
                }
                myReader.close();
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
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
