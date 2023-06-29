/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

/**
 *
 * @author Carlo
 */
public class NodoArbol<T>{
    private T element;
    private NodoArbol<T> left;
    private NodoArbol<T> right;

    public NodoArbol(T element){
        this.element = element;
        this.left = null;
        this.right = null;
    }
    
    public T getElement() {
        return element;
    }


    public void setTreeID(T element) {
        this.element = element;
    }


    public NodoArbol<T> getLeft() {
        return left;
    }


    public void setLeft(NodoArbol<T> left) {
        this.left = left;
    }


    public NodoArbol<T> getRight() {
        return right;
    }

    
    public void setRight(NodoArbol<T> right) {
        this.right = right;
    }
    
    public boolean isLeaf() {
        return (this.left == null && this.right == null);
    }
    
    
}
