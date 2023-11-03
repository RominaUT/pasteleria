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
import modelo.Producto;

public class ProductoDAO implements Crud{
    PreparedStatement ps;
    ResultSet rs;        
    Conexion con = new Conexion();
    Connection acceso;
    
   

    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql="SELECT producto.id_Producto, producto.nomProducto, producto.precioProd, producto.stock, producto.id_CateProducto, categoriaproducto.nomTipoProducto\n" +
"FROM `producto` INNER JOIN categoriaproducto\n" +
"ON producto.id_CateProducto = categoriaproducto.id_CateProducto;";
        try {
            acceso = con.realizarConexion();
            ps=acceso.prepareStatement(sql);
            rs=ps.executeQuery();//Ejecuta la consulta
            while (rs.next()){
                Producto prod=new Producto();
                prod.setIdProd(rs.getInt(1));
                prod.setNomProd(rs.getString(2));
                prod.setPrecioProd(rs.getDouble(3));
                prod.setStock(rs.getInt(4));
                prod.setIdCateProd(rs.getInt(5));                
                //
                prod.setNombreTipoprod(rs.getString(6));
                lista.add(prod);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int insertar(Object[] o) {
        int r=0;
        String sql="INSERT INTO `producto`(`nomProducto`, `precioProd`, `stock`, `id_CateProducto`) VALUES (?,?,?,?);";
        try {
            acceso=con.realizarConexion();
            ps=acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);            
            r=ps.executeUpdate();           
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="UPDATE `producto` SET `nomProducto`=?,`precioProd`=?,`stock`=?,`id_CateProducto`=? WHERE `id_Producto`=?";
        try {
            acceso=con.realizarConexion();
            ps=acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
    /*public void actualizar(JTextField nomInsu, JTextField Stock, JTextField precioInsu, JTextField idCateInsu, JTextField idInsu){
        String sql="UPDATE `insumos` SET `nomInsumo`=?,`precioInsumo`=?,`stock`=?,`id_CateInsumo`=?' WHERE `id_Insumo`=?";
    }*/

    @Override
    public void eliminar(int idInsu) {        
        String sql ="DELETE FROM `producto` where `id_Producto`=?";
        try {
            acceso=con.realizarConexion();
            ps=acceso.prepareStatement(sql);
            ps.setInt(1, idInsu);            
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
    
    public List<Producto> buscarPorNombre(String nombre) {
    List<Producto> lista = new ArrayList<>();
    String sql = "SELECT * FROM producto WHERE nomProducto LIKE ?";

    try {
        acceso = con.realizarConexion();
        ps = acceso.prepareStatement(sql);
        ps.setString(1, "%" + nombre + "%"); // Usamos "%" para buscar nombres parciales
        rs = ps.executeQuery();

        while (rs.next()) {
            Producto ins = new Producto();
            ins.setIdProd(rs.getInt(1));
            ins.setNomProd(rs.getString(2));
            ins.setPrecioProd(rs.getDouble(3));
            ins.setStock(rs.getInt(4));
            ins.setIdCateProd(rs.getInt(5));
            lista.add(ins);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return lista;
    }

}
