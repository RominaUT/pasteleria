/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

public class EntidadLogin {
    //Atributos
    int idUsu,idTraba;
    String contraUsu;    

    //Constructores

    public EntidadLogin() {
    }

    public EntidadLogin(int idUsu, int idTraba, String contraUsu) {
        this.idUsu = idUsu;
        this.idTraba = idTraba;
        this.contraUsu = contraUsu;
    }
    //Metodos Getter and Setter

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public int getIdTraba() {
        return idTraba;
    }

    public void setIdTraba(int idTraba) {
        this.idTraba = idTraba;
    }

    public String getContraUsu() {
        return contraUsu;
    }

    public void setContraUsu(String contraUsu) {
        this.contraUsu = contraUsu;
    }    
        
}
