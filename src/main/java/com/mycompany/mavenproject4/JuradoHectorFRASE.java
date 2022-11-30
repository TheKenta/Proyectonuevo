package com.mycompany.mavenproject4;

import java.util.Scanner;

public class JuradoHectorFRASE {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String palabra = entrada.nextLine(); // cambiar la palabra a minuscula
        palabra = palabra.toLowerCase(); // pasar las mayusculas a minusculas
        palabra = palabra.replace(" ", ""); // cadena para cambiar el espacio en una frase
        palabra = palabra.replace(",", ""); // cambiamos las comas
        palabra = palabra.replace(".", ""); // cambiamos los puntos
        // cambiar los acentos
        palabra = palabra.replace("á", "a");
        palabra = palabra.replace ("é", "e");
        palabra = palabra.replace("í", "i");
        palabra = palabra.replace("ó", "o");
        palabra = palabra.replace ("ú","u");
        


        //creamos las variables
        int fin = palabra.length() - 1; // invertimos el final
        int inicio = 0; // inicio de la frase
        boolean invertido = true; // si esta invertido es true

       
        while (inicio < fin) { 
            if (palabra.charAt(inicio) != palabra.charAt(fin)) { // si el inicio y el final no es igual es false
                invertido = false; 
            }

            inicio++;
            fin--;
        }
        if (invertido) // si la frase se lee de derecha a izquierda funciona
        {
            System.out.print(palabra + " Se puede leer de derecha a izquierda");
        } else { // si no es igual 
            System.out.print(palabra + " No se puede leer de derecha a izquierda");
        }

    }
}
