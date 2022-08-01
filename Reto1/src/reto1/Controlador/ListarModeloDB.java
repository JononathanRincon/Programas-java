package Reto1.Controlador;

import Reto1.Modelo.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarModeloDB { 
    Connection connection;
    Conexion conexion = new Conexion();
    Statement st;
    ResultSet rs;

    public ListarModeloDB() {
    }
    
    public ArrayList getListaSucursales(){
        System.out.println("Ingrese a la función getListaSucursales");
        ArrayList mListaSucursales = new ArrayList();
        Sucursal sucursal = null;
        String query = "SELECT idSucursal, nombreSucursal FROM `sucursal`;";
        try{
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                sucursal = new Sucursal();
                //el idSucursal que devuelve la consulta select
                int idSucursal = rs.getInt("idSucursal");
                String nombreSucursal = rs.getString("nombreSucursal");
                sucursal.setIdSucursal(idSucursal);
                sucursal.setNombreSucursal(nombreSucursal);
                mListaSucursales.add(sucursal);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        System.out.println(mListaSucursales);
        return mListaSucursales;
    }
    
    public ArrayList getListaGerentes(){
        ArrayList mListaGerentes = new ArrayList();
        String queryGerente = "SELECT personasCargo, salario, nombrePuestoTrabajo, idEmp, CONCAT(nombreEmp, ' ', apellidos) AS nombre, personasCargo, salario FROM `gerente` INNER JOIN empleado ON(FK_idEmp = idEmp) INNER JOIN puestotrabajo ON(FK_idPuestoTrabajo = idPuestoTrabajo) WHERE nombrePuestoTrabajo = 'Gerente';";
        try{
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery(queryGerente);
            while(rs.next()){
                String nombrePuestoTrabajo = rs.getString("nombrePuestoTrabajo");
                String nombreEmpleado = rs.getString("nombre");
                float salario = rs.getFloat("salario");
                int cantidadSubordinados = rs.getInt("personasCargo");
                System.out.println(nombrePuestoTrabajo + " - "+ nombreEmpleado + " - " + salario + " - " + cantidadSubordinados);
                
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        System.out.println(mListaGerentes);
        return mListaGerentes;
    }
    
    public ArrayList getListaOperarios(){
        ArrayList mListaOperarios = new ArrayList();
        Operario operario = null;
        String queryOperario = "SELECT idOperario, nombrePuestoTrabajo, CONCAT(nombreEmp, ' ', apellidos) AS nombre, manejoMaquinariaPesada, salario FROM operario INNER JOIN empleado ON(FK_idEmp = idEmp) INNER JOIN puestotrabajo ON(empleado.FK_idPuestoTrabajo = puestotrabajo.idPuestoTrabajo) WHERE puestotrabajo.nombrePuestoTrabajo = 'Operario';";
        try{
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery(queryOperario);
            while(rs.next()){
                String nombrePuestoTrabajo = rs.getString("nombrePuestoTrabajo");
                String nombreEmpleado = rs.getString("nombre");
                float salario = rs.getFloat("salario");
                boolean manejoMaquinaPesada = rs.getBoolean("manejoMaquinariaPesada");
                System.out.println(nombrePuestoTrabajo + " - "+ nombreEmpleado + " - " + salario + " - " + manejoMaquinaPesada);
                
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        System.out.println(mListaOperarios);
        return mListaOperarios;
    }
    
    public ArrayList getListaDomiciliarios(){
        ArrayList mListaDomiciliarios = new ArrayList();
        Domiciliario domiciliario = null;
        String queryDomiciliario = "SELECT idDomiciliario, nombrePuestoTrabajo, CONCAT(nombreEmp, ' ', apellidos) AS nombre, tipoTransporte, salario FROM domiciliario INNER JOIN empleado ON(FK_idEmp = idEmp) INNER JOIN puestotrabajo ON(empleado.FK_idPuestoTrabajo = puestotrabajo.idPuestoTrabajo) WHERE puestotrabajo.nombrePuestoTrabajo = 'Domiciliario';";
        try{
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery(queryDomiciliario);
            while(rs.next()){
                String nombrePuestoTrabajo = rs.getString("nombrePuestoTrabajo");
                String nombreEmpleado = rs.getString("nombre");
                float salario = rs.getFloat("salario");
                String tipoTransporte = rs.getString("tipoTransporte");
                System.out.println(nombrePuestoTrabajo + " - "+ nombreEmpleado + " - " + salario + " - " + tipoTransporte);
                
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        System.out.println(mListaDomiciliarios);
        return mListaDomiciliarios;
    }
}
