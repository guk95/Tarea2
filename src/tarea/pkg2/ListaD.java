/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg2;

/**
 *
 * @author Mario
 */
public class ListaD<T extends Comparable<T>> {

    private NodoD<T> cabeza;
    private int size;

    public ListaD() {
        this.size = 0;
        this.cabeza = null;

    }

    public char rndChar() {
        int rnd = (int) (Math.random() * 127); // or use Random or whatever
        char base = (rnd < 127) ? '!' : '~';
        return (char) (base + rnd % 50);

    }

    public boolean isEmpty() {

        return cabeza == null;
    }

    public boolean add(int dato) {
        
    NodoD nuevo=new NodoD(dato);

        if (isEmpty()) {

            cabeza = nuevo;
          

        } else {
            NodoD aux = cabeza;
            int cont = 0;
            while (cont < size - 1) {
                aux = aux.getSig();

                cont++;
            }
            nuevo.setAnt(aux);
            aux.setSig(nuevo);
         

        }
        size++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" ");

        NodoD aux = cabeza;

        int cont = 0;

        while (cont < size) {
            builder.append(aux.getDato());
            builder.append(aux.getPila().toString());
            builder.append(System.getProperty("line.separator"));
            builder.append(" ");
            aux = aux.getSig();
            ++cont;

        }
        builder.append("-");

        return builder.toString();
    }

    public boolean bubbleSort() {

        int cont = 0;

        while (cont < size) {
            NodoD aux = cabeza;
            NodoD aux2 = cabeza.getSig();
            int cont2 = 0;

            while (cont2 < size - 1) {

                if (aux.getDato().toString().compareTo(aux2.getDato().toString()) > 0) {
                    NodoD temp = aux;
                    NodoD ultimo = cabeza;
                    int cont3 = 0;
                    while (cont3 < size - 1) {
                        ultimo = ultimo.getSig();
                        cont3++;
                    }

                    if (aux == cabeza) {
                        aux2.getSig().setAnt(aux);
                        aux.setSig(aux2.getSig());
                        aux.setAnt(aux2);
                        aux2.setSig(aux);
                        aux2.setAnt(null);

                        cabeza = aux2;
                        aux = temp;
                        aux2 = temp.getSig();

                    } else if (aux2 == ultimo) {

                        aux.getAnt().setSig(aux2);
                        aux2.setAnt(aux.getAnt());
                        aux2.setSig(aux);
                        aux.setSig(null);
                        aux.setAnt(aux2);
                        ultimo = aux;
                        aux = temp;
                        aux2 = temp.getSig();
                        aux2 = temp;
                        aux = temp.getSig();

                    } else {
                        aux.getAnt().setSig(aux2);
                        aux2.getSig().setAnt(aux);
                        aux2.setAnt(aux.getAnt());
                        aux.setSig(aux2.getSig());
                        aux2.setSig(aux);
                        aux.setAnt(aux2);
                        aux2 = temp;
                        aux = aux2;
                        aux2 = temp;
                        aux = temp.getSig();

                    }

                } else {
                    aux = aux.getSig();
                    aux2 = aux2.getSig();

                }

                cont2++;
            }

            cont++;
        }

        return true;
    }

    public NodoD<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoD<T> cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
