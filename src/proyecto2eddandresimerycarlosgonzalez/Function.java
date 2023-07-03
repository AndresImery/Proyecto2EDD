/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
    
    public void writeCSVs(Hash hash, ABB<Reserva> arbol_r, ABB<Habitacion> arbol_h) {
        
        writeCSVReservas(arbol_r);
        
        writeCSVEstado(hash);
        
        writeCSVHistoricos(arbol_h);
        
//        String string_estado = "num_hab,primer_nombre,apellido,email,genero,celular,llegada\n";
//        
//        String string_reservas = "ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida\n";
//        
//        String string_historicos = "ci,primer_nombre,apellido,email,genero,llegada,num_hab\n";
//        
//        for (Lista<Estado> lista : hash.getHashtable()) {
//            if (lista !=  null) {
//                Nodo<Estado> pointer = lista.getHead();
//                while (pointer != null) {
//                    Estado estado = pointer.getElement();
//                    if (estado.getHabitacion() != null) {
//                        string_estado = string_estado + "" + estado.getHabitacion().getNum() + "," + estado.getCliente().getNombre() + "," + estado.getCliente().getApellido() + "," + estado.getCliente().getCorreo() + "," + estado.getCliente().getGenero() + "," + estado.getCliente().getCelular() + "," + estado.getLlegada().getDate() + "/" + estado.getLlegada().getMonth() + "/" + estado.getLlegada().getYear() + "\n";
//                    } else {
//                        string_estado = string_estado + "," + estado.getCliente().getNombre() + "," + estado.getCliente().getApellido() + "," + estado.getCliente().getCorreo() + "," + estado.getCliente().getGenero() + "," + estado.getCliente().getCelular() + "," + estado.getLlegada().getDate() + "/" + estado.getLlegada().getMonth() + "/" + estado.getLlegada().getYear() + "\n";
//                    }
//                    pointer = pointer.getNext();
//                }
//            }
//        }
//        
//        string_reservas = string_reservas + arbol_r.createArbolStringReserva(arbol_r.getRoot(), "");
//        
//        string_historicos = string_historicos + arbol_h.createArbolStringHistorico(arbol_h.getRoot(), "");
//        
//        
//        
//        
////        System.out.println(string);
//        
//        try {
//            FileWriter myWriter = new FileWriter("reservas.csv");
//            
//            myWriter.write(string_reservas);
//            myWriter.close();
//            System.out.println("Escribio exitosamente en el archivo.");
//        } catch (IOException e) {
//            System.out.println("Ocurrio un error.");
//            e.printStackTrace();
//        }
//        
//        try {
//            FileWriter myWriter = new FileWriter("estado.csv");
//            
//            myWriter.write(string_estado);
//            myWriter.close();
//            System.out.println("Escribio exitosamente en el archivo.");
//        } catch (IOException e) {
//            System.out.println("Ocurrio un error.");
//            e.printStackTrace();
//        }
//        
//       try {
//            FileWriter myWriter = new FileWriter("historico.csv");
//            
//            myWriter.write(string_historicos);
//            myWriter.close();
//            System.out.println("Escribio exitosamente en el archivo.");
//        } catch (IOException e) {
//            System.out.println("Ocurrio un error.");
//            e.printStackTrace();
//        }
        
    }
    
    public void writeCSVEstado(Hash hash) {
        String string_estado = "num_hab,primer_nombre,apellido,email,genero,celular,llegada\n";
        
        for (Lista<Estado> lista : hash.getHashtable()) {
            if (lista !=  null) {
                Nodo<Estado> pointer = lista.getHead();
                while (pointer != null) {
                    Estado estado = pointer.getElement();
                    if (estado.getHabitacion() != null) {
                        string_estado = string_estado + "" + estado.getHabitacion().getNum() + "," + estado.getCliente().getNombre() + "," + estado.getCliente().getApellido() + "," + estado.getCliente().getCorreo() + "," + estado.getCliente().getGenero() + "," + estado.getCliente().getCelular() + "," + estado.getLlegada().getDate() + "/" + estado.getLlegada().getMonth() + "/" + estado.getLlegada().getYear() + "\n";
                    } else {
                        string_estado = string_estado + "," + estado.getCliente().getNombre() + "," + estado.getCliente().getApellido() + "," + estado.getCliente().getCorreo() + "," + estado.getCliente().getGenero() + "," + estado.getCliente().getCelular() + "," + estado.getLlegada().getDate() + "/" + estado.getLlegada().getMonth() + "/" + estado.getLlegada().getYear() + "\n";
                    }
                    pointer = pointer.getNext();
                }
            }
        }
        
        try {
            FileWriter myWriter = new FileWriter("estado.csv");
            
            myWriter.write(string_estado);
            myWriter.close();
            System.out.println("Escribio exitosamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }
        
    }
    
    public void writeCSVReservas(ABB<Reserva> arbol_r) {
        String string_reservas = "ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida\n";
        
        string_reservas = string_reservas + arbol_r.createArbolStringReserva(arbol_r.getRoot(), "");
        
        try {
            FileWriter myWriter = new FileWriter("reservas.csv");
            
            myWriter.write(string_reservas);
            myWriter.close();
            System.out.println("Escribio exitosamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }
        
    }
    
    public void writeCSVHistoricos(ABB<Habitacion> arbol_h) {
        String string_historicos = "ci,primer_nombre,apellido,email,genero,llegada,num_hab\n";
        
        string_historicos = string_historicos + arbol_h.createArbolStringHistorico(arbol_h.getRoot(), "");
        
        try {
            FileWriter myWriter = new FileWriter("historico.csv");
            
            myWriter.write(string_historicos);
            myWriter.close();
            System.out.println("Escribio exitosamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }
        
    }
    
    public void write(Hash hash, ABB<Reserva> arbol_r, ABB<Habitacion> arbol_h) {
        String outputPath = "estado.csv";

        try {
            FileWriter fileWriter = new FileWriter(outputPath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write header line to the CSV file
            String header = "num_hab,primer_nombre,apellido,email,genero,celular,llegada";
            bufferedWriter.write(header);
            bufferedWriter.newLine(); // Move to the next line

            // Write data to the CSV file
            for (Lista<Estado> lista : hash.getHashtable()) {
                if (lista !=  null) {
                    Nodo<Estado> pointer = lista.getHead();
                    while (pointer != null) {
                        Estado estado = pointer.getElement();
//                        String[] data = {"", "", "", "", "", "", ""};
                        if (estado.getHabitacion() != null) {
                            String[] info = {String.valueOf(estado.getHabitacion().getNum()), estado.getCliente().getNombre(), estado.getCliente().getApellido(), estado.getCliente().getCorreo(), estado.getCliente().getGenero(), estado.getCliente().getCelular(), estado.getLlegada().getDate() + "/" + estado.getLlegada().getMonth() + "/" + estado.getLlegada().getYear()};
                            String dataLine = String.join(",", info);
                            bufferedWriter.write(dataLine);
                            bufferedWriter.newLine();
                        } else {
                            String[] info = {"", estado.getCliente().getNombre(), estado.getCliente().getApellido(), estado.getCliente().getCorreo(), estado.getCliente().getGenero(), estado.getCliente().getCelular(), estado.getLlegada().getDate() + "/" + estado.getLlegada().getMonth() + "/" + estado.getLlegada().getYear()};
                            String dataLine = String.join(",", info);
                            bufferedWriter.write(dataLine);
                            bufferedWriter.newLine();
                        }
//                        String dataLine = String.join(",", info);
//                        bufferedWriter.write(dataLine);
//                        bufferedWriter.newLine();
                        
                        pointer = pointer.getNext();
                    }
                }
            }
            bufferedWriter.close();
            
//            String[] data = {estado.getHabitacion().getNum(), estado.getCliente().getNombre(), estado.getCliente().getApellido(), estado.getCliente().getCorreo(), estado.getCliente().getGenero(), estado.getCliente().getCelular(), estado.getLlegada().getDate() + "/" + estado.getLlegada().getMonth() + "/" + estado.getLlegada().getYear()};
//            String dataLine = String.join(",", data);
//            bufferedWriter.write(dataLine);
//            bufferedWriter.newLine();
//
//            // Write more data if needed
//            data = new String[]{"Jane", "Doe", "30"};
//            dataLine = String.join(",", data);
//            bufferedWriter.write(dataLine);
//            bufferedWriter.newLine();

            // Close the BufferedWriter
            

            System.out.println("CSV file created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while writing to the CSV file.");
            
            
        }
    }
    
    
}


