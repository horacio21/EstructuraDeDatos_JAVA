/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donodo;

/**
 *
 * @author Jean_Carlos
 */
public class Profesores 
{
    private String  codigo;
    private String  nombre;
    private String  apellido;
    private String  direccion;
    private String  carrera;
    
    Profesores(){}
    
      Profesores(String cod, String nom, String ape, String dir,String car )
    { codigo=cod; nombre=nom; apellido=ape; direccion=dir; carrera=car;}
      
    public String getcodigo(){return codigo;}
    public String getnombre(){return nombre;}
    public String getapellido(){return apellido;}
    public String getdireccion(){return direccion;}
    public String getcarreraa(){return carrera;}
  
    
    public void setcodigo(String n){this.codigo=n;}
    public void setnombre(String n){this.nombre=n;}
    public void setapellido(String n){this.apellido=n;}
    public void setdireccion(String n){this.direccion=n;}
    public void setcarreraa(String n){this.carrera=n;}
   
}
