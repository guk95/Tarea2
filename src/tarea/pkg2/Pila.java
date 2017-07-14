package tarea.pkg2;

public class Pila<T extends Comparable<T>> {

    private NodoP cabeza;

    public Pila() {

    }

    public boolean isEmpty() {

        return cabeza == null;
    }

    public boolean push(T dato, int index) {
        NodoP nuevo = new NodoP(dato);

        NodoD auxd = Tarea2.doble.getCabeza();
        int cont=0;

        while (cont<index) {
            auxd = auxd.getSig();
            cont++;

        }

        if (auxd.getPila().getCabeza() == null) {
        cabeza=nuevo;

        } else {

            NodoP aux = cabeza;
            while (aux != null) {

                aux = aux.getSig();

            }

            aux.setSig(nuevo);

        }

        return true;

    }

    public boolean pop() {

        NodoP aux = cabeza;
        if (cabeza.getSig() == null) {

            cabeza = null;

        } else {
            while (aux.getSig().getSig() != null) {

                aux = aux.getSig();

            }
            aux.setSig(null);

        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        NodoP aux = cabeza;

        while (aux != null) {
            builder.append(" ");
            builder.append(aux.getDato());
            builder.append(System.getProperty("line.separator"));

            aux = aux.getSig();
        }

        return builder.toString();
    }

    public NodoP getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoP cabeza) {
        this.cabeza = cabeza;
    }

}
