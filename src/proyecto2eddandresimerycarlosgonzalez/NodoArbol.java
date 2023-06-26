/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

/**
 *
 * @author Carlo
 */
public class NodoArbol {
    private int treeID;
    private NodoArbol left;
    private NodoArbol right;

    public NodoArbol(int treeID){
        this.treeID = treeID;
        this.left = left;
        this.right = right;
    }
    
    public int getTreeID() {
        return treeID;
    }


    public void setTreeID(int treeID) {
        this.treeID = treeID;
    }


    public NodoArbol getLeft() {
        return left;
    }


    public void setLeft(NodoArbol left) {
        this.left = left;
    }


    public NodoArbol getRight() {
        return right;
    }

    
    public void setRight(NodoArbol right) {
        this.right = right;
    }
    
    public boolean isLeaf() {
        return (this.left == null && this.right == null);
    }
    
    
}
