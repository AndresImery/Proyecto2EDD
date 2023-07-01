/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

/**
 *
 * @author Carlo
 * @param <T>
 */
public class NodoArbol<T>{
    private T element;
    private int height;
    private NodoArbol<T> left;
    private NodoArbol<T> right;

    public NodoArbol(T element){
        this.element = element;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
    
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
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
