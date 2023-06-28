/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

/**
 *
 * @author Carlo
 */
public class ABB <T>{
    private NodoArbol<T> root;

    public ABB(){
        this.root = null;
    }
    
    public ABB(NodoArbol<T> nodo){
        this.root = nodo;
    }

    
    public NodoArbol getRoot() {
        return root;
    }

    public void setRoot(NodoArbol root) {
        this.root = root;
    }
    
    public void insert(NodoArbol<T> root, NodoArbol<T> newNode) {
        if (this.root == null) {
            this.root = newNode;
        } else {
            if (newNode.getTreeID() < root.getTreeID()) {
                if (root.getLeft() == null) {
                    root.setLeft(newNode);
                } else {
                    insert(root.getLeft(), newNode);
                }
            } else if (newNode.getTreeID().getID > root.getTreeID()) {
                if (root.getRight() == null) {
                    root.setRight(newNode);
                } else {
                    insert(root.getRight(), newNode);
                }
            } else {
                System.out.println("El elemento ya se encuentra en el Árbol");
            }
        }
    }
    
    
    public NodoArbol search(NodoArbol<T> aux, T treeID) {
        if (aux == null) return null;
        
        if (aux.getTreeID() == treeID) {
            return aux;
        } else if(treeID < aux.getTreeID()) {
            return search(aux.getLeft(), treeID);
        } else {
            return search(aux.getRight(), treeID);
        }
    }
    
    public int getNodeLevel(NodoArbol aux, int treeID, int level) {
        if (aux == null) return -1;
        
        if (aux.getTreeID() == treeID) {
            return level;
        } else if (treeID < aux.getTreeID()) {
            return getNodeLevel(aux.getLeft(), treeID, level + 1);
        } else {
            return getNodeLevel(aux.getRight(), treeID, level + 1);
        }
    }
    
    
    public boolean isInTheTree(NodoArbol aux, int treeID) {
        if (aux == null) return false;
        
        if (aux.getTreeID() == treeID) 
            return true;
        else
            return (isInTheTree(aux.getLeft(), treeID) || isInTheTree(aux.getRight(), treeID));
    }
    
    public NodoArbol deleteLeft(NodoArbol p) {
        if (p.getLeft() != null) {
            NodoArbol aux = p.getLeft();
            p.setLeft(null);
            if (aux.getLeft() != null && aux.getRight() != null) {
                NodoArbol aux2 = aux.getLeft();
                p.setLeft(aux.getLeft());
                while (aux2.getRight() != null) {
                    aux2 = aux2.getRight();
                }
                aux2.setRight(aux.getRight());
            } else if (aux.getLeft() != null) {
                p.setLeft(aux.getLeft());
            } else if (aux.getRight() != null) {
                p.setLeft(aux.getRight());
            }
            return aux;
        }
        return null;

    }


    public NodoArbol deleteRoot() {
        NodoArbol aux = this.root;
        this.root = null;
        if (aux.getLeft() != null && aux.getRight() != null) {
            this.root = aux.getRight();
            NodoArbol aux2 = aux.getRight();
            while (aux2.getLeft() != null) {
                aux2 = aux2.getLeft();
            }
            aux2.setLeft(aux.getLeft());
            return aux;
        } else if (aux.getLeft() != null) {
            this.root = aux.getLeft();
            return aux;
        } else if (aux.getRight() != null) {
            this.root = aux.getRight();
            return aux;
        }
        return null;
    }

    public NodoArbol delete(NodoArbol p, int treeID) {
        if (this.root != null && this.root.getTreeID() == treeID) {
            return deleteRoot();
        } else if (p.getLeft() != null && p.getLeft().getTreeID() == treeID) {
            return deleteLeft(p);
        } else if (p.getRight() != null && p.getRight().getTreeID() == treeID) {
            return deleteRight(p);
        }
        return null;
    }

    public NodoArbol deleteRight(NodoArbol p) {
        if (p.getRight() != null) {
            NodoArbol aux = p.getRight();
            p.setRight(null);

            if (aux.getLeft() != null && aux.getRight() != null) {
                NodoArbol aux2 = aux.getRight();
                p.setRight(aux.getRight());
                while (aux2.getLeft() != null) {
                    aux2 = aux2.getLeft();
                }
                aux2.setLeft(aux.getLeft());
            } else if (aux.getLeft() != null) {
                p.setRight(aux.getLeft());
            } else if (aux.getRight() != null) {
                p.setRight(aux.getRight());
            }
            return aux;
        }
        return null;
    }
}
