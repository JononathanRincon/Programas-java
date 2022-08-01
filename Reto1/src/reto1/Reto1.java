/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;

import Reto1.vistas.login;
import Reto1.Modelo.Conexion;
/**
 *
 * @author jonat
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login lg = new login();
        lg.setVisible(true);
        Conexion Con = new Conexion();
        
    }
    
}
