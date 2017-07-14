package tarea.pkg2;

public class NodoD<T> {

    private NodoD sig;
    private T dato;
    private NodoD ant;
    private Pila pila;

    public NodoD(T dato) {
        this.dato = dato;
        this.pila=new Pila();

    }



    public Pila getPila() {
        return pila;
    }

    public void setPila(Pila pila) {
        this.pila = pila;
    }
    
    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoD getAnt() {
        return ant;
    }

    public void setAnt(NodoD ant) {
        this.ant = ant;
    }

}
