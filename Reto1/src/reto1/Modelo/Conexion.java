/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1.Modelo;

import com.sun.jdi.connect.spi.Connection;



/**
 *
 * @author jonat
 */
public class Conexion {
    Connection Connection;
    String Driver = "com.mysql.jdbc.Driver";
    String URL = "jdbc:mysql://localhost:3306/reto1_g54_db";
    String usuario = "root";
    String password = "199230CMFg1.";
    
    public Conexion getConexion(){
        Connection con = null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, usuario, password);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
