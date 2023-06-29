/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2eddandresimerycarlosgonzalez;

/**
 *
 * @author Carlo
 */
public class ABB<T> {
    private NodoArbol<T> root;

    public ABB(){
        this.root = null;
    }
    
    public NodoArbol getRoot() {
        return root;
    }

    public void setRoot(NodoArbol root) {
        this.root = root;
    }
    
    public void insertReserva(NodoArbol<Reserva> root, Reserva element) {
        NodoArbol<Reserva> newNode = new NodoArbol<>(element);
        if (this.root == null) {
            this.root = (NodoArbol<T>) newNode;
        } else {
            if (newNode.getElement().getId() < root.getElement().getId()) {
                if (root.getLeft() == null) {
                    root.setLeft(newNode);
                } else {
                    insertReserva(root.getLeft(), newNode.getElement());
                }
            } else if (newNode.getElement().getId() > root.getElement().getId()) {
                if (root.getRight() == null) {
                    root.setRight(newNode); 
                } else {
                    insertReserva(root.getRight(), newNode.getElement());
                }
            } else {
                System.out.println("El elemento ya se encuentra en el Árbol");
            }
        }
    }
    
    public void insertHabitacion(NodoArbol<Habitacion> root, Habitacion element) {
        NodoArbol<Habitacion> newNode = new NodoArbol<>(element);
        if (this.root == null) {
            this.root = (NodoArbol<T>) newNode;
        } else {
            if (newNode.getElement().getId() < root.getElement().getId()) {
                if (root.getLeft() == null) {
                    root.setLeft(newNode);
                } else {
                    insertHabitacion(root.getLeft(), newNode.getElement());
                }
            } else if (newNode.getElement().getId() > root.getElement().getId()) {
                if (root.getRight() == null) {
                    root.setRight(newNode); 
                } else {
                    insertHabitacion(root.getRight(), newNode.getElement());
                }
            } else {
                System.out.println("El elemento ya se encuentra en el Árbol");
            }
        }
    }
    
    
    public NodoArbol searchReserva(NodoArbol<Reserva> aux, Reserva element) {
        if (aux == null) return null;
        
        if (aux.getElement().getId() == element.getId()) {
            return aux;
        } else if(element.getId() < aux.getElement().getId()) {
            return searchReserva(aux.getLeft(), element);
        } else {
            return searchReserva(aux.getRight(), element);
        }
    }
    
    public NodoArbol searchHabitacion(NodoArbol<Habitacion> aux, Habitacion element) {
        if (aux == null) return null;
        
        if (aux.getElement().getId() == element.getId()) {
            return aux;
        } else if(element.getId() < aux.getElement().getId()) {
            return searchHabitacion(aux.getLeft(), element);
        } else {
            return searchHabitacion(aux.getRight(), element);
        }
    }
    
    public int getNodeLevel(NodoArbol<T> aux, T element, int level) {
        if (aux == null) return -1;
        
        if (aux.getElement().getId() == element.getId()) {
            return level;
        } else if (element.getId() < aux.getElement().getId()) {
            return getNodeLevel(aux.getLeft(), element, level + 1);
        } else {
            return getNodeLevel(aux.getRight(), element, level + 1);
        }
    }
    
    
    public boolean isInTheTreeReserva(NodoArbol<Reserva> aux, Reserva element) {
        if (aux == null) return false;
        
        if (aux.getElement().getId() == element.getId()) 
            return true;
        else
            return (isInTheTreeReserva(aux.getLeft(), element) || isInTheTreeReserva(aux.getRight(), element));
    }
    
    public boolean isInTheTreeHabitacion(NodoArbol<Habitacion> aux, Habitacion element) {
        if (aux == null) return false;
        
        if (aux.getElement().getId() == element.getId()) 
            return true;
        else
            return (isInTheTreeHabitacion(aux.getLeft(), element) || isInTheTreeHabitacion(aux.getRight(), element));
    }
    
    public NodoArbol deleteLeft(NodoArbol<T> p) {
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

    public NodoArbol deleteReserva(NodoArbol<Reserva> p, Reserva element) {
        if (this.root != null && getRoot().getElement().getId() == element.getId()) {
            return deleteRoot();
        } else if (p.getLeft() != null && p.getLeft().getElement().getId() == element.getId()) {
            return deleteLeft(p);
        } else if (p.getRight() != null && p.getRight().getElement().getId() == element.getId()) {
            return deleteRight(p);
        }
        return null;
    }
    
    public NodoArbol deleteHabitacion(NodoArbol<Habitacion> p, Habitacion element) {
        if (this.root != null && getRoot().getElement().getId() == element.getId()) {
            return deleteRoot();
        } else if (p.getLeft() != null && p.getLeft().getElement().getId() == element.getId()) {
            return deleteLeft(p);
        } else if (p.getRight() != null && p.getRight().getElement().getId() == element.getId()) {
            return deleteRight(p);
        }
        return null;
    }

    public NodoArbol deleteRight(NodoArbol<T> p) {
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
