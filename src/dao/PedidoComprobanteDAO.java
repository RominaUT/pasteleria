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
import modelo.PedidoComprobante;

/**
 *
 * @author Usuario
 */
public class PedidoComprobanteDAO implements Crud
{
    PreparedStatement psr;
    ResultSet rst;        
    Conexion con1 = new Conexion();
    Connection acceso1;
   
    @Override
    public List listar() {
        List<PedidoComprobante> lista = new ArrayList<>();
//        String sql="SELECT pedido_comprobante.id_Pedido, pedido_comprobante.preciopedido, pedido_comprobante.cantidadPedido, "
//                + "pedido_comprobante.dscto, pedido_comprobante.fechaEmision, pedido_comprobante.id_Cliente, pedido_comprobante.id_Usuario, "
//                + "cliente.nomCliente\n" + 
//                "FROM `pedido_comprobante` INNER JOIN cliente\n" + 
//                "ON pedido_comprobante.id_Cliente = cliente.id_Cliente" +
//                "INNER JOIN iniciosesion ON pedido_comprobante.id_Usuario = iniciosesion.id_Usuario;" +
//                "SELECT producto.nomProducto ";
//        String sql = "SELECT pedido_comprobante.id_Pedido, pedido_comprobante.id_Usuario, "
//                + "pedido_comprobante.id_Cliente, pedido_comprobante.fechaEmision, producto.nomProducto, "
//                + "pedido_comprobante.cantidadPedido, producto.precioProd\n" +
//                "FROM pedido_comprobante\n" +
//                "LEFT JOIN pedicom_producto ON pedicom_producto.id_Pedido = pedido_comprobante.id_Pedido\n" +
//                "LEFT JOIN producto ON pedicom_producto.id_Producto = producto.id_Producto";
        String sql = "SELECT * FROM pedido_comprobante";
        try {
            acceso1 = con1.realizarConexion();
            psr = acceso1.prepareStatement(sql);
            rst = psr.executeQuery();//Ejecuta la consulta
            while (rst.next()){
                PedidoComprobante pco = new PedidoComprobante();
                pco.setId_PC(rst.getInt(1));
                pco.setId_Cli(rst.getInt(2));
                pco.setId_Usua(rst.getInt(3));
                pco.setPrePedC(rst.getDouble(4));
                pco.setDesc(rst.getDouble(5));     
                pco.setCantPedCli(rst.getString(6));
                pco.setFecEmi(rst.getDate(7));
                lista.add(pco);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int insertar(Object[] o) {
        int r = 0;
        String sql="INSERT INTO `pedido_comprobante`(`preciopedido`, `cantidadPedido`, "
                + "`dscto`, `fechaEmision`, `id_Cliente`, `id_Usuario`) VALUES (?,?,?,?,?)";
//                + "INSERT INTO `producto`(`nomProducto`) VALUES (?)";
        try {
            acceso1 = con1.realizarConexion();
            psr = acceso1.prepareStatement(sql);
            psr.setObject(1, o[0]);
            psr.setObject(2, o[1]);
            psr.setObject(3, o[2]);
            psr.setObject(4, o[3]);
            psr.setObject(5, o[4]);
            psr.setObject(6, o[5]);
            r = psr.executeUpdate();           
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql="UPDATE `pedido_comprobante` SET `preciopedido`=?, `cantidadPedido`=?, `dscto`=?, `fechaEmision`=?, `id_Cliente`=?, `id_Usuario`=? WHERE `id_Pedido`=?";
        try {
            acceso1 = con1.realizarConexion();
            psr = acceso1.prepareStatement(sql);
            psr.setObject(1, o[0]);
            psr.setObject(2, o[1]);
            psr.setObject(3, o[2]);
            psr.setObject(4, o[3]);
            psr.setObject(5, o[4]);
            psr.setObject(6, o[5]);
            psr.setObject(7, o[6]);
            psr.setObject(8, o[7]);
            r = psr.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
    /*public void actualizar(JTextField nomInsu, JTextField Stock, JTextField precioInsu, JTextField idCateInsu, JTextField idInsu){
        String sql="UPDATE `insumos` SET `nomInsumo`=?,`precioInsumo`=?,`stock`=?,`id_CateInsumo`=?' WHERE `id_Insumo`=?";
    }*/

    @Override
    public void eliminar(int id_PC) {        
        String sql = "DELETE FROM `pedido_comprobante` where `id_Pedido`=?";
        try {
            acceso1 = con1.realizarConexion();
            psr = acceso1.prepareStatement(sql);
            psr.setInt(1, id_PC);            
            psr.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
    
    public List<PedidoComprobante> buscarPorId(String id_PC) {
    List<PedidoComprobante> lista = new ArrayList<>();
    String sql = "SELECT * FROM pedido_comprobante WHERE id_Pedido LIKE ?";

    try {
        acceso1 = con1.realizarConexion();
        psr = acceso1.prepareStatement(sql);
        psr.setString(1, "%" + id_PC + "%"); // Usamos "%" para buscar nombres parciales
        rst = psr.executeQuery();

        while (rst.next()) {
            PedidoComprobante pcom = new PedidoComprobante();
            pcom.setId_PC(rst.getInt(1));
            pcom.setId_Cli(rst.getInt(2));
            pcom.setId_Usua(rst.getInt(3));
            pcom.setProducto(rst.getString(4));
            pcom.setPrePedC(rst.getDouble(5));
            pcom.setCantPedCli(rst.getString(6));
            pcom.setDesc(rst.getDouble(7));
            pcom.setFecEmi(rst.getDate(8));
            lista.add(pcom);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return lista;
    }
}
