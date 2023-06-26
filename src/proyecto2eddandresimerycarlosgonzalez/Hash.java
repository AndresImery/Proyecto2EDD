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
        String full_name = name + lastname;
        int value = 0;
        for (int i = 0; i < full_name.length(); i++) {
            int ascii = full_name.charAt(i);
            value = value + ascii;
        }
        return value % getSize();
    }
    
    public void addEstado(Estado estado) {
        
    }
    
    
}
