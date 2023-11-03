/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import modelo.EntidadLogin;


public class AdministradorDAO {
    PreparedStatement ps;
    ResultSet rs;
        
    Conexion con = new Conexion();
    Connection acceso;
    
    public EntidadLogin ValidarAdministrador (int idTraba,String contraUsu){
        EntidadLogin el= new EntidadLogin();
        String sql = "SELECT * FROM `iniciosesion` WHERE id_Trabajador=? and contraUsuario=?;";
        //String sql2= "SELECT trabajador.nomTrabajador FROM `iniciosesion` INNER JOIN trabajador ON iniciosesion.id_Trabajador=trabajador.id_Trabajador WHERE trabajador.id_Trabajador=? AND iniciosesion.contraUsuario=? GROUP BY trabajador.nomTrabajador;";
        try {
            acceso=con.realizarConexion();
            ps=acceso.prepareStatement(sql);            
            ps.setInt(1, idTraba);
            ps.setString(2, contraUsu);
            rs=ps.executeQuery();
            while (rs.next()){
                el.setIdUsu(rs.getInt(1));
                el.setContraUsu(rs.getString(2));
                el.setIdTraba(rs.getInt(3));
            }            
        } catch (Exception e) {
        }
        return el;
    }
    
}
