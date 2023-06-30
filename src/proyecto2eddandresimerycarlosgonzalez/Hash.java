/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

/**
 *
 * @author andresimery
 */
public class Hash {
    private Lista<Estado>[] hashtable;
    private int size;

    public Hash() {
        this.hashtable = new Lista[13];
        this.size = 13;
    }

    public Lista<Estado>[] getHashtable() {
        return hashtable;
    }

    public void setHashtable(Lista<Estado>[] hashtable) {
        this.hashtable = hashtable;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    public int hashFunction(String name, String lastname) {
        String full_name = name.toLowerCase() + lastname.toLowerCase();
        int value = 0;
        for (int i = 0; i < full_name.length(); i++) {
            int ascii = full_name.charAt(i);
            value = value + ascii;
        }
        return value % getSize();
    }
    
    public void addEstado(Estado estado) {
        int key = hashFunction(estado.getCliente().getNombre(), estado.getCliente().getApellido());
        
        if (getHashtable()[key] == null) {
            getHashtable()[key] = new Lista<Estado>();
        }
        getHashtable()[key].insertLast(estado);
    }
    
    public Estado getEstado(String name, String lastname) {
        int key = hashFunction(name, lastname);
        
        Nodo<Estado> pointer = getHashtable()[key].getHead();
        while (pointer != null) {
            if (pointer.getElement().getCliente().getNombre().equals(name) && pointer.getElement().getCliente().getApellido().equals(lastname)) {
                return pointer.getElement();
            }
            pointer = pointer.getNext();
        }
        return null;
    }
    
    public void printHash() {
        Nodo<Estado> pointer;
        int index = 0;
        for (Lista<Estado> lista : getHashtable()) {
            System.out.println(index);
            if (lista != null) {
                pointer = lista.getHead();
                while (pointer != null) {
                    System.out.println(pointer.getElement().getCliente().getNombre() + " " + pointer.getElement().getCliente().getApellido() + " Hab: " + pointer.getElement().getHabitacion().getNum());
                    pointer = pointer.getNext();
                }
            }
            index++;
        }
    }
    
}
