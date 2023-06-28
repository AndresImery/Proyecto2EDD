/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

/**
 *
 * @author Carlo
 */
public class NodoArbol <T>{
    private T treeID;
    private NodoArbol <T> left;
    private NodoArbol <T> right;

    public NodoArbol(T treeID){
        this.treeID = treeID;
        this.left = null;
        this.right = null;
    }
    
    public T getTreeID() {
        return treeID;
    }


    public void setTreeID(T treeID) {
        this.treeID = treeID;
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
