/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio7 {

    /**
     * Lee un número por teclado y muestra por consola, el carácter al que
     * pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre
     * una a.
     */

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int Numero;
        System.out.println("Digite un numero: ");
        Numero = Teclado.nextInt();

        char Letra = (char) Numero;

        System.out.println("Corresponde al Caracter ASCII: " + Letra);
    }
}
