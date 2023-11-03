/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import modelo.Proveedor;

public class ProveedorDAO implements Crud{
    PreparedStatement ps;
    ResultSet rs;        
    Conexion con = new Conexion();
    Connection acceso;
    
    @Override
    public List listar() {
        List<Proveedor> lista = new ArrayList<>();
        String sql="SELECT proveedor.id_Proveedor, proveedor.nomProveedor, proveedor.correo, proveedor.direccion, proveedor.id_DistritoProve, distritoproveedor.nomDistrito\n" +
"FROM `proveedor` INNER JOIN distritoproveedor\n" +
"ON proveedor.id_DistritoProve=distritoproveedor.id_DistritoProve;";
        try {
            acceso = con.realizarConexion();
            ps=acceso.prepareStatement(sql);
            rs=ps.executeQuery();//Ejecuta la consulta
            while (rs.next()){
                Proveedor prov =new Proveedor();
                prov.setIdProv(rs.getInt(1));
                prov.setNomProv(rs.getString(2));
                prov.setCorreo(rs.getString(3));
                prov.setDireccion(rs.getString(4));
                prov.setIdDistriProv(rs.getInt(5));
                //
                prov.setNomDistri(rs.getString(6));
                lista.add(prov);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int insertar(Object[] o) {
        int r=0;
        String sql="INSERT INTO `proveedor`(`nomProveedor`, `correo`, `direccion`, `id_DistritoProve`) VALUES (?,?,?,?);";
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
        String sql="UPDATE `proveedor` SET `nomProveedor`=?,`correo`=?,`direccion`=?,`id_DistritoProve`=? WHERE `id_Proveedor`=?";
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

    @Override
    public void eliminar(int idProv) {        
        String sql ="DELETE FROM `proveedor` WHERE `id_Proveedor`=?";
        try {
            acceso=con.realizarConexion();
            ps=acceso.prepareStatement(sql);
            ps.setInt(1, idProv);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
    
    public List<Proveedor> buscarPorNombre(String nombre) {
    List<Proveedor> lista = new ArrayList<>();
    String sql = "SELECT * FROM `proveedor` WHERE `nomProveedor` LIKE ?";

    try {
        acceso = con.realizarConexion();
        ps = acceso.prepareStatement(sql);
        ps.setString(1, "%" + nombre + "%"); // Usamos "%" para buscar nombres parciales
        rs = ps.executeQuery();

        while (rs.next()) {
            Proveedor provee = new Proveedor();
            provee.setIdProv(rs.getInt(1));
            provee.setNomProv(rs.getString(2));
            provee.setCorreo(rs.getString(3));
            provee.setDireccion(rs.getString(4));
            provee.setIdDistriProv(rs.getInt(5));
            lista.add(provee);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return lista;
    }
}
