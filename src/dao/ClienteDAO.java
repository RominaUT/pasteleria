/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTextField;
import modelo.Cliente;

public class ClienteDAO implements Crud
{
    PreparedStatement ps;
    ResultSet rs;        
    Conexion con = new Conexion();
    Connection acceso;
   
    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql="SELECT * FROM `cliente`;";
        try {
            acceso = con.realizarConexion();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();//Ejecuta la consulta
            while (rs.next()){
                Cliente cli = new Cliente();
                cli.setIdC(rs.getInt(1));
                cli.setDniC(rs.getInt(2));
                cli.setNomC(rs.getString(3));
                cli.setApeP(rs.getString(4));
                cli.setApeM(rs.getString(5));     
                cli.setDire(rs.getString(6));
                lista.add(cli);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int insertar(Object[] o) {
        int r = 0;
        String sql="INSERT INTO `cliente`(`DniCliente`, `nomCliente`, `apePaterno`, `apeMaterno`, `direccion`) VALUES (?,?,?,?,?);";
        try {
            acceso = con.realizarConexion();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();           
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql="UPDATE `cliente` SET `DniCliente`=?,`nomCliente`=?,`apePaterno`=?,`apeMaterno`=?, `direccion`=? WHERE `id_Cliente`=?";
        try {
            acceso = con.realizarConexion();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
    /*public void actualizar(JTextField nomInsu, JTextField Stock, JTextField precioInsu, JTextField idCateInsu, JTextField idInsu){
        String sql="UPDATE `insumos` SET `nomInsumo`=?,`precioInsumo`=?,`stock`=?,`id_CateInsumo`=?' WHERE `id_Insumo`=?";
    }*/

    @Override
    public void eliminar(int idC) {        
        String sql = "DELETE FROM `cliente` where `id_Cliente`=?";
        try {
            acceso = con.realizarConexion();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, idC);            
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
    
    public List<Cliente> buscarPorNombreC(String nombre) {
    List<Cliente> lista = new ArrayList<>();
    String sql = "SELECT * FROM `cliente` WHERE `nomCliente` LIKE ?";

    try {
        acceso = con.realizarConexion();
        ps = acceso.prepareStatement(sql);
        ps.setString(1, "%" + nombre + "%"); // Usamos "%" para buscar nombres parciales
        rs = ps.executeQuery();

        while (rs.next()) {
            Cliente clie = new Cliente();
            clie.setIdC(rs.getInt(1));
            clie.setDniC(rs.getInt(2));
            clie.setNomC(rs.getString(3));
            clie.setApeP(rs.getString(4));
            clie.setApeM(rs.getString(5));
            clie.setDire(rs.getString(6));
            lista.add(clie);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return lista;
    }
}
