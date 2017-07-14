package tarea.pkg2;

/**
 *
 * @author Mario
 */
public class NodoP<T> {

    private NodoP sig;
    private T dato;

    public NodoP(T dato) {

        this.dato = dato;

    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}
