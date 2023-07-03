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
    
    // ----------------------------
    public void storeBSTNodes(NodoArbol<T> root, Lista<NodoArbol<T>> nodes) {
        // Base case
        if (root == null)
            return;
 
        // Store nodes in Inorder (which is sorted
        // order for BST)
        storeBSTNodes(root.getLeft(), nodes);
        nodes.insertLast(root);
        storeBSTNodes(root.getRight(), nodes);
    }
    
    public NodoArbol<T> buildTreeUtil(Lista<NodoArbol<T>> nodes, int start, int end) {
        // base case
        if (start > end)
            return null;
 
        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        NodoArbol<T> node = nodes.getElementByIndex(mid);
 
        /* Using index in Inorder traversal, construct
           left and right subtress */
        node.setLeft(buildTreeUtil(nodes, start, mid - 1));
        node.setRight(buildTreeUtil(nodes, mid + 1, end));
 
        return node;
        
    }
    
    
    public NodoArbol<T> buildTree(NodoArbol<T> root) {
        // Store nodes of given BST in sorted order
        Lista<NodoArbol<T>> nodes = new Lista<>();
        storeBSTNodes(root, nodes);
 
        // Constructs BST from nodes[]
        int n = nodes.getSize();
        return buildTreeUtil(nodes, 0, n - 1);
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
    
    //////////////////////abajo
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
    
    public NodoArbol searchReservaCedulaNodo(NodoArbol<Reserva> aux, int cedula) {
        if (aux == null) return null;
        
        if (aux.getElement().getId() == cedula) {
            return aux;
        } else if(cedula < aux.getElement().getId()) {
            return searchReservaCedulaNodo(aux.getLeft(), cedula);
        } else {
            return searchReservaCedulaNodo(aux.getRight(), cedula);
        }
    }
    
    public Reserva searchReservaCedula(NodoArbol<Reserva> aux, int cedula) {
        return (Reserva) searchReservaCedulaNodo(aux, cedula).getElement();
    }
    
    ///////////////////////abajo
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
    
    public NodoArbol searchHabitacionNumNodo(NodoArbol<Habitacion> aux, int num) {
        if (aux == null) return null;
        
        if (aux.getElement().getId() == num) {
            return aux;
        } else if(num < aux.getElement().getId()) {
            return searchHabitacionNumNodo(aux.getLeft(), num);
        } else {
            return searchHabitacionNumNodo(aux.getRight(), num);
        }
    }
    
    public Habitacion searchHabitacionNum(NodoArbol<Habitacion> aux, int num) {
        return (Habitacion) searchHabitacionNumNodo(aux, num).getElement();
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
        } else if (p.getLeft() != null && p.getLeft().getElement().getId() == element.getId()) {
            return deleteReservaLeft(p);
        } else if (p.getRight() != null && p.getRight().getElement().getId() == element.getId()) {
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
            System.out.println(root.getElement().getNum() + "|"+ root.getElement().getTipo() + "|"+ root.getElement().getPiso());
            Nodo<Historico> pointer = root.getElement().getHistoricos().getHead();
            while (pointer != null) {
                System.out.println(pointer.getElement().getCliente().getNombre() + " " + pointer.getElement().getCliente().getApellido() + " " + pointer.getElement().getLlegada().toString());
                
                pointer = pointer.getNext();
            }
            printHabitacionInOrder(root.getRight());
        }
    }
    
    public void printReservaInOrder(NodoArbol<Reserva> root) {
        if (root != null) {
            printReservaInOrder(root.getLeft());
            System.out.println(root.getElement().getCliente().getCedula() + "|"+ root.getElement().getCliente().getNombre()+ "|"+ root.getElement().getCliente().getApellido()+ "|"+ root.getElement().getCliente().getGenero());
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
    public void printHabitacionPostOrder(NodoArbol<Habitacion> root) {
        if (root != null) {
            printHabitacionPostOrder(root.getLeft());
            printHabitacionPostOrder(root.getRight());
            System.out.println(root.getElement().getNum() + "|"+ root.getElement().getTipo() + "|"+ root.getElement().getPiso());
            Nodo<Historico> pointer = root.getElement().getHistoricos().getHead();
            while (pointer != null) {
                System.out.println(pointer.getElement().getCliente().getNombre() + " " + pointer.getElement().getCliente().getApellido() + " " + pointer.getElement().getLlegada().toString());
                
                pointer = pointer.getNext();
            }
            
        }
        
    }
    public void printReservaPreOrder(NodoArbol<Reserva> root) {
        if (root != null) {
            System.out.println(root.getElement().getId() + "|"+ root.getElement().getCliente().getNombre()+ "|"+ root.getElement().getCliente().getApellido()+ "|"+ root.getElement().getCliente().getGenero()+"///////");
            printReservaPreOrder(root.getLeft());
            printReservaPreOrder(root.getRight());
        }
    }
    public void printHabitacionPreOrder(NodoArbol<Habitacion> root) {
        if (root != null) {
            System.out.println(root.getElement().getNum() + "|"+ root.getElement().getTipo() + "|"+ root.getElement().getPiso());
            Nodo<Historico> pointer = root.getElement().getHistoricos().getHead();
            while (pointer != null) {
                System.out.println(pointer.getElement().getCliente().getNombre() + " " + pointer.getElement().getCliente().getApellido() + " " + pointer.getElement().getLlegada().toString());
                
                pointer = pointer.getNext();
            }
            printHabitacionPreOrder(root.getLeft());
            printHabitacionPreOrder(root.getRight());
        }
    }
    
    public String createArbolStringReserva(NodoArbol<Reserva> root, String string) {
        if (root != null) {
            string = string + createArbolStringReserva(root.getLeft(), string);
            Reserva reserva = root.getElement();
            string = string + reserva.getCliente().getCedula() + "," + reserva.getCliente().getNombre() + "," + reserva.getCliente().getApellido() + "," + reserva.getCliente().getCorreo() + "," + reserva.getCliente().getGenero() + "," + reserva.getTipo() + "," + reserva.getCliente().getCelular() + "," + reserva.getLlegada().getDate() + "/" + reserva.getLlegada().getMonth() + "/" + reserva.getLlegada().getYear() + "," +reserva.getSalida().getDate() + "/" + reserva.getSalida().getMonth() + "/" + reserva.getSalida().getYear() + "\n";
            string = string + createArbolStringReserva(root.getRight(), string);
        }
        return string;
    }
    
    public String createArbolStringHistorico(NodoArbol<Habitacion> root, String string) {
        if (root != null) {
            string = string + createArbolStringHistorico(root.getLeft(), string);
            Lista<Historico> historicos = root.getElement().getHistoricos();
            if (historicos != null) {
                Nodo<Historico> pointer = historicos.getHead();
                while (pointer != null) {
                    Historico historico = pointer.getElement();
                    string = string + historico.getCliente().getCedula() + "," + historico.getCliente().getNombre() + "," + historico.getCliente().getApellido() + "," + historico.getCliente().getCorreo() + "," + historico.getCliente().getGenero() + "," + historico.getLlegada().getDate() + "/" + historico.getLlegada().getMonth() + "/" + historico.getLlegada().getYear() + "," + root.getElement().getNum() + "\n";
                    pointer = pointer.getNext();
                }
            }
            string = string + createArbolStringHistorico(root.getRight(), string);
        }
        return string;
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
}
