package com.diego.tallerjava;

import java.io.Serializable;

public class MetTransient implements Serializable {	
	
  private String nombre;
  private transient String password;
 
  public MetTransient(String nombre, String password) {
    this.nombre = nombre;
    this.password = password;
  }
 
  public String toString() {
    String pwd = (password == null) ? "(n/a)" : password;
    return "Información Usuario: \n   Nombre: " + nombre + "\n Contraseña: " + pwd;
  }
}
