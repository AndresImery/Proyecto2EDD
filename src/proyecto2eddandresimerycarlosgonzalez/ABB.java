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
//    public int maxReserva(int a,int b){
//        return (a > b) ? a : b;
//    }
    
//    public int getNodeReservaLevel(NodoArbol<Reserva> H) {
//        if (H == null) {
//            return 0;
//        }
//        
//        return H.getHeight();
//    }
    

//    public NodoArbol rotateReservaRight(NodoArbol<Reserva> y, Reserva element){
//        NodoArbol<Reserva> x = new NodoArbol<>(y.getLeft().getElement());
//        NodoArbol<Reserva> T2 = new NodoArbol<>(x.getRight().getElement());
//        x.setRight(y);
//        y.setLeft(T2);
//        y.setHeight(maxReserva(y.getLeft().getHeight(),y.getRight().getHeight())+1);
//        x.setHeight(maxReserva(x.getLeft().getHeight(),x.getRight().getHeight())+1);
//        return x;
//    }
//    
//    public NodoArbol rotateReservaLeft(NodoArbol<Reserva> x, Reserva element){
//        NodoArbol<Reserva> y = new NodoArbol<>(x.getRight().getElement());
//        NodoArbol<Reserva> T2 = new NodoArbol<>(y.getLeft().getElement());
//        y.setLeft(x);
//        x.setRight(T2);
//        x.setHeight(maxReserva(x.getLeft().getHeight(),x.getRight().getHeight())+1);
//        y.setHeight(maxReserva(y.getLeft().getHeight(),y.getRight().getHeight())+1);
//        return y;
//    }
//    
//    public int getReservaBalance(NodoArbol<Reserva> H){
//        if (H == null) {
//            return 0;
//        }
//        
//        return H.getLeft().getHeight() - H.getRight().getHeight();
//    }
//    
//    public void insertReserva(NodoArbol<Reserva> root, Reserva element) {
//        NodoArbol<Reserva> newNode = new NodoArbol<>(element);
//        
//        if (this.root == null) {
//            return newNode;
//        }
//           
//        if (element.getId()< root.getElement().getId()) {
//            root.setLeft(insertReserva(root.getLeft(),element));
//        } else if (element.getId()> root.getElement().getId()) {
//            root.setRight(insertReserva(root.getRight(),element));
//        } else {
//            System.out.println("Una Persona con la misma cedula ya tiene una reservacion hecha");
//            return root;
//        }
//        root.setHeight(1 + maxReserva(root.getLeft().getHeight(), root.getRight().getHeight()));
// 
//        /* 3. Get the balance factor of this ancestor
//              node to check whether this node became
//              unbalanced */
//        int balance = getReservaBalance(root);
// 
//        // If this node becomes unbalanced, then there
//        // are 4 cases Left Left Case
//        if (balance > 1 && element.getId() < root.getLeft().getElement().getId()){
//            return rotateReservaRight(root, element);
//        }
//        // Right Right Case
//        if (balance < -1 && element.getId() > root.getLeft().getElement().getId()){
//            return rotateReservaLeft(root, element);
//        
//        }
//        // Left Right Case
//        if (balance > 1 && element.getId() > root.getLeft().getElement().getId()) {
//            root.setLeft(rotateReservaLeft(root.getLeft() , element));
//            return rotateReservaRight(root, element);
//        }
// 
//        // Right Left Case
//        if (balance < -1 && element.getId() < root.getRight().getElement().getId()) {
//            root.setRight(rotateReservaRight(root.getRight() , element));
//            return rotateReservaLeft(root, element);
//        }
//        
//        return root;
//    }
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
        NodoArbol<Habitacion> newNode = new NodoArbol(element);
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
    
    public int getNodeReservaLevel(NodoArbol<Reserva> aux, Reserva element, int level) {
        if (aux == null) return -1;
        
        if (aux.getElement().getId() == element.getId()) {
            return level;
        } else if (element.getId() < aux.getElement().getId()) {
            return getNodeReservaLevel(aux.getLeft(), element, level + 1);
        } else {
            return getNodeReservaLevel(aux.getRight(), element, level + 1);
        }
    }
    
    public int getNodeHabitacionLevel(NodoArbol<Habitacion> aux, Habitacion element, int level) {
        if (aux == null) return -1;
        
        if (aux.getElement().getId() == element.getId()) {
            return level;
        } else if (element.getId() < aux.getElement().getId()) {
            return getNodeHabitacionLevel(aux.getLeft(), element, level + 1);
        } else {
            return getNodeHabitacionLevel(aux.getRight(), element, level + 1);
        }
    }
    
//    public int getNodeLevel(NodoArbol<T> aux, T element, int level) {
//        if (aux == null) return -1;
//        
//        if (aux.getElement().getId() == element.getId()) {
//            return level;
//        } else if (element.getId() < aux.getElement().getId()) {
//            return getNodeLevel(aux.getLeft(), element, level + 1);
//        } else {
//            return getNodeLevel(aux.getRight(), element, level + 1);
//        }
//    }
    
    
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
    



    public NodoArbol deleteRoot() {
        NodoArbol<T> aux = this.root;
        this.root = null;
        if (aux.getLeft() != null && aux.getRight() != null) {
            this.root = aux.getRight();
            NodoArbol<T> aux2 = aux.getRight();
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
        if (this.root != null && p.getElement().getId() == element.getId()) {
            return deleteRoot();
        } else if (p.getLeft() != null && p.getLeft().getElement().getCliente().getCedula() == element.getCliente().getCedula()) {
            return deleteReservaLeft(p);
        } else if (p.getRight() != null && p.getRight().getElement().getCliente().getCedula() == element.getCliente().getCedula()) {
            return deleteReservaRight(p);
        }
        return null;
    }
    public NodoArbol deleteReservaLeft(NodoArbol<Reserva> p) {
        if (p.getLeft() != null) {
            NodoArbol<Reserva> aux = p.getLeft();
            p.setLeft(null);
            if (aux.getLeft() != null && aux.getRight() != null) {
                NodoArbol<Reserva> aux2 = aux.getLeft();
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
    
    public NodoArbol deleteReservaRight(NodoArbol<Reserva> p) {
        if (p.getRight() != null) {
            NodoArbol<Reserva> aux = p.getRight();
            p.setRight(null);

            if (aux.getLeft() != null && aux.getRight() != null) {
                NodoArbol<Reserva> aux2 = aux.getRight();
                p.setRight(aux.getRight());
                while (aux2.getLeft() != null) {
                    aux2 = aux2.getLeft();
                }
                aux2.setLeft(aux.getLeft());
            } else if (aux.getLeft() != null) {
                p.setRight(aux.getRight());
            } else if (aux.getRight() != null) {
                p.setRight(aux.getLeft());
            }
            return aux;
        }
        return null;
    }
    
    
    public NodoArbol deleteHabitacion(NodoArbol<Habitacion> p, Habitacion element) {
        if (this.root != null && p.getElement().getId() == element.getId()) {
            return deleteRoot();
        } else if (p.getLeft() != null && p.getLeft().getElement().getId() == element.getId()) {
            return deleteHabitacionLeft(p);
        } else if (p.getRight() != null && p.getRight().getElement().getId() == element.getId()) {
            return deleteHabitacionRight(p);
        }
        return null;
    }
    
    
    public NodoArbol deleteHabitacionLeft(NodoArbol<Habitacion> p) {
        if (p.getLeft() != null) {
            NodoArbol<Habitacion> aux = p.getLeft();
            p.setLeft(null);
            if (aux.getLeft() != null && aux.getRight() != null) {
                NodoArbol<Habitacion> aux2 = aux.getLeft();
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
        
        
    public NodoArbol deleteHabitacionRight(NodoArbol<Habitacion> p) {
        if (p.getRight() != null) {
            NodoArbol<Habitacion> aux = p.getRight();
            p.setRight(null);

            if (aux.getLeft() != null && aux.getRight() != null) {
                NodoArbol<Habitacion> aux2 = aux.getRight();
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
    
    public void printHabitacionInOrder(NodoArbol<Habitacion> root) {
        if (root != null) {
            printHabitacionInOrder(root.getLeft());
            System.out.println(root.getElement().getEstado().getCliente().getNombre() + "|"+ root.getElement().getEstado().getCliente().getApellido()+ "|"+ root.getElement().getEstado().getCliente().getGenero());
            printHabitacionInOrder(root.getRight());
        }
    }
    
    public void printReservaInOrder(NodoArbol<Reserva> root) {
        if (root != null) {
            printReservaInOrder(root.getLeft());
            System.out.println(root.getElement().getCliente().getCedula() + "|"+ root.getElement().getCliente().getNombre()+ "|"+ root.getElement().getCliente().getApellido()+ "|"+ root.getElement().getCliente().getGenero()+"///////");
            printReservaInOrder(root.getRight());
        }
        
    }
    public void printReservaPostOrder(NodoArbol<Reserva> root) {
        if (root != null) {
            printReservaPostOrder(root.getLeft());
            printReservaPostOrder(root.getRight());
            System.out.println(root.getElement().getCliente().getCedula() + "|"+ root.getElement().getCliente().getNombre()+ "|"+ root.getElement().getCliente().getApellido()+ "|"+ root.getElement().getCliente().getGenero()+"///////");
            
        }
        
    }
    public void printReservaPreOrder(NodoArbol<Reserva> root) {
        if (root != null) {
            System.out.println(root.getElement().getId() + "|"+ root.getElement().getCliente().getNombre()+ "|"+ root.getElement().getCliente().getApellido()+ "|"+ root.getElement().getCliente().getGenero()+"///////");
            printReservaPreOrder(root.getLeft());
            printReservaPreOrder(root.getRight());
        }
    }

}
