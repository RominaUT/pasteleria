/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Angel
 */
public class Cliente {
    //ATRIBUTOS
    int idC, dniC;
    String nomC, apeP, apeM, dire;

    //CONSTRUCTOR
    public Cliente() {
    }

    public Cliente(int idC, int dniC, String nomC, String apeP, String apeM, String dire) {
        this.idC = idC;
        this.dniC = dniC;
        this.nomC = nomC;
        this.apeP = apeP;
        this.apeM = apeM;
        this.dire = dire;
    }

    //GETTER AND SETTER
    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public int getDniC() {
        return dniC;
    }

    public void setDniC(int dniC) {
        this.dniC = dniC;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public String getApeP() {
        return apeP;
    }

    public void setApeP(String apeP) {
        this.apeP = apeP;
    }

    public String getApeM() {
        return apeM;
    }

    public void setApeM(String apeM) {
        this.apeM = apeM;
    } 
    
    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }
}
