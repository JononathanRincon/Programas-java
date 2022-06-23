/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer7reto;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class Ejer7Reto {
    private static String Nombre;
    private static Scanner sc = new Scanner(System.in);
    private static boolean val = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("Ingrese el nombre del usuario");
        Nombre = sc.nextLine().toLowerCase();
        System.out.println("Ingrese la letra que desea buscar en el nombre");
        char caracter = sc.next().toLowerCase().charAt(0);
        for (int i = 0; i < Nombre.length(); i++) {
            char caracterIndice = Nombre.charAt(i);
            if (caracterIndice == caracter) {
                System.out.println("--------------\n"
                        + "el nombre " + Nombre +
                        "\nLetra a buscar: "+ caracter +
                        "\nCantidad de ocurrencias:"+ (i+1)+
                        "\n--------------\n");
                val = true;
            }
            
        }
        if (val == false) {
            System.out.println("No se encontro el caracter");
        }
    }
    
}
