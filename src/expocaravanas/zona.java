
package Expocaravanas;

import java.util.Scanner;

public class zona {

    private int entradas = 0;

    public zona() {
    }

    public zona(int entradas) {
        this.entradas = entradas;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public int ventaentradas(int numeroentradas) {
        if (numeroentradas < 0) {
            System.out.println("Ese valor no es correcto");
        }
        else{
       if ((this.entradas - numeroentradas) < 0) {
            System.out.println("Error en la compra insuficientes tickets");
       }
       else{
       this.entradas -= numeroentradas;
       }
        }
        return this.entradas;

    }
}

