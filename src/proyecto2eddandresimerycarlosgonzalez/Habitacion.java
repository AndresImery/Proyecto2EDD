/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

/**
 *
 * @author andresimery
 */
public class Habitacion {
    private int num;
    private String tipo;
    private int piso;
    private Lista<Historico> historicos;
    private Estado estado;

    public Habitacion(int num, String tipo, int piso, Lista<Historico> historicos, Estado estado) {
        this.num = num;
        this.tipo = tipo;
        this.piso = piso;
        this.historicos = historicos;
        this.estado = estado;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public Lista<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(Lista<Historico> historicos) {
        this.historicos = historicos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
