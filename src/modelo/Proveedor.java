/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Proveedor {
    //Atributos
    int idProv,idDistriProv;
    String nomProv, correo, direccion;    
    String nomDistri;
    //Constructor
    public Proveedor() {
    }            

    public Proveedor(int idProv, int idDistriProv, String nomProv, String correo, String direccion, String nomDistri) {
        this.idProv = idProv;
        this.idDistriProv = idDistriProv;
        this.nomProv = nomProv;
        this.correo = correo;
        this.direccion = direccion;
        this.nomDistri = nomDistri;
    }
    //Metodos Getter and Setter
    public int getIdProv() {
        return idProv;
    }

    public void setIdProv(int idProv) {
        this.idProv = idProv;
    }

    public int getIdDistriProv() {
        return idDistriProv;
    }

    public void setIdDistriProv(int idDistriProv) {
        this.idDistriProv = idDistriProv;
    }

    public String getNomProv() {
        return nomProv;
    }

    public void setNomProv(String nomProv) {
        this.nomProv = nomProv;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNomDistri() {
        return nomDistri;
    }

    public void setNomDistri(String nomDistri) {
        this.nomDistri = nomDistri;
    }
}
