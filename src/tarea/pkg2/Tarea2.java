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
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
            public static ListaD doble = new ListaD();
    public static void main(String[] args) {


        Pila pila = new Pila();

        doble.add(1);
        doble.add(2);
        doble.add(3);
        doble.add(4);
       
        pila.push(10,0);
        pila.push(2,0);
         System.out.println(doble.toString());

// TODO code application logic here
    }

}
