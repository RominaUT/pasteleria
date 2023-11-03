/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;

public interface Crud {
  public List listar();
  public int insertar(Object[] o);//Este objeto es una arreglo es por ello que se le coloca el []
  public int actualizar (Object[] o);
  public void eliminar(int idInsu);  
}
