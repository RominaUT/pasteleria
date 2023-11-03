/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    //Variable tipo Connection
    Connection conexion;
    //Metodo
    public  Connection realizarConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, user , password;
            url = "jdbc:mysql://localhost/sistpasteleria";
            user = "root";
            password = "";
            
            conexion=DriverManager.getConnection(url,user,password);
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println("error" + e.toString());
            conexion=null;
        }
        return conexion;
    }
}
