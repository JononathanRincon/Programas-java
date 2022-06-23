package main.Ejercicio6;

import java.util.Scanner;

public class Ejercicio_6 {

    //2. Variables necesarias para esta clase
    private static String wifiPassword = "";
    private static int numberAttempts = 1;
    private static int numberAttempts2 = 1;
    static Scanner scannerInstance = new Scanner(System.in);

    public static void main(String[] args) {
        ValidateWifiPassword();
    }
    public static void ValidateWifiPassword() {
        System.out.println("        INGRESA TU CONTRASEÑA DEL WIFI");
        System.out.println("            Password:");
        wifiPassword = scannerInstance.nextLine();

        while (numberAttempts < 3) {
            // if((wifiPassword.equals("ABC123")){} se valida si son iguales
            // if(!(wifiPassword.equals("ABC123")){} se valida si son diferentes
            if (!(wifiPassword.equals("ABC123"))) {
                System.out.println("Contraseña incorrecta intento número " + numberAttempts);
                System.out.println("            Password:");
                wifiPassword = scannerInstance.nextLine();
            }else{
                System.out.println("Contraseña correcta, conectado a tu red WIFI.");

                while(numberAttempts2 < 4){

                    System.out.println("Ingrese el numero de la serie :\n" +
                            "| 2 | 9 | 16 | 23 | 30 | 37 | 44 |");
                    int value = scannerInstance.nextInt();

                    if (value != 51){
                        System.out.println("Numero de la serie incorrecto, numero de intento = " +  numberAttempts2);

                    }else{
                        System.out.println("Bienvenido al sistema");
                        numberAttempts2=3;
                        break;
                    }
                    numberAttempts2 += 1;
                }
                break;

            }
            numberAttempts += 1;
        }
    }
}
