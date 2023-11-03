/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Producto {
    //Atributos
    int idProd, stock, idCateProd;
    double precioProd;
    String nomProd;
    //
    String nombreTipoprod;
    //Constructor

    public Producto() {
    }                  

    public Producto(int idProd, int stock, int idCateProd, double precioProd, String nomProd, String nombreTipoprod) {
        this.idProd = idProd;
        this.stock = stock;
        this.idCateProd = idCateProd;
        this.precioProd = precioProd;
        this.nomProd = nomProd;
        this.nombreTipoprod = nombreTipoprod;
    }
    //Metodos Getter and Setter

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdCateProd() {
        return idCateProd;
    }

    public void setIdCateProd(int idCateProd) {
        this.idCateProd = idCateProd;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getNombreTipoprod() {
        return nombreTipoprod;
    }

    public void setNombreTipoprod(String nombreTipoprod) {
        this.nombreTipoprod = nombreTipoprod;
    }
}
