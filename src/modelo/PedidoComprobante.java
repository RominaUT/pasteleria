/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class PedidoComprobante 
{
    //ATRIBUTOS
    int id_PC, id_Cli, id_Usua;
    double prePedC, desc;
    String cantPedCli, producto;
    Date fecEmi;
    //
    String nomCliente;  
    
    //CONSTRUCTOR
    public PedidoComprobante() {
    }

    public PedidoComprobante(int id_PC, int id_Cli, int id_Usua, double prePedC, double desc, String cantPedCli, String producto, Date fecEmi, String nomCliente) {
        this.id_PC = id_PC;
        this.id_Cli = id_Cli;
        this.id_Usua = id_Usua;
        this.prePedC = prePedC;
        this.desc = desc;
        this.cantPedCli = cantPedCli;
        this.producto = producto;
        this.fecEmi = fecEmi;
        this.nomCliente = nomCliente;
    }
    
    //Metodos getter and setter

    public int getId_PC() {
        return id_PC;
    }

    public void setId_PC(int id_PC) {
        this.id_PC = id_PC;
    }

    public int getId_Cli() {
        return id_Cli;
    }

    public void setId_Cli(int id_Cli) {
        this.id_Cli = id_Cli;
    }

    public int getId_Usua() {
        return id_Usua;
    }

    public void setId_Usua(int id_Usua) {
        this.id_Usua = id_Usua;
    }

    public double getPrePedC() {
        return prePedC;
    }

    public void setPrePedC(double prePedC) {
        this.prePedC = prePedC;
    }

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    public String getCantPedCli() {
        return cantPedCli;
    }

    public void setCantPedCli(String cantPedCli) {
        this.cantPedCli = cantPedCli;
    }
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Date getFecEmi() {
        return fecEmi;
    }

    public void setFecEmi(Date fecEmi) {
        this.fecEmi = fecEmi;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }
    
}
