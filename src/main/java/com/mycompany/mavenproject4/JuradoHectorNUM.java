package com.mycompany.mavenproject4;

import java.util.Scanner;

public class JuradoHectorNUM {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // creamos las variables
        int numero; // numero que añadimos
        int numInvertido = 0; // el numero invertido
        int resto; 
        int falta;
        do {
            System.out.println("Introduce un numero entero");

            numero = entrada.nextInt(); // introducimos un numero

            if (numero < 10) { // para que el numero tenga que tener 2 cifras y sea mayor que 10
                System.out.println("No es valido, vuelve a intentarlo");
            }

        } while (numero < 10);
        resto = numero; // resto igual al numero que creamos
        while (resto != 0) { //resto no es igual a 0
            // lo dividimos y multiplicamos para invertir el numero
            falta = resto % 10;
            numInvertido = numInvertido * 10 + falta;
            resto = resto / 10;

        }
        if (numero == numInvertido) { // si el numero es igual al numero invertido funciona
            System.out.println(" es igual de derecha a izquierda");
        } else { // si no es igual
            System.out.println(" no es igual de derecha a izquierda");
        }
    }
}
