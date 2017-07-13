/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Jean_Carlos
 */
public class Nodo {
     private Object  dato;
    private Nodo link;
    
    Nodo()
    { dato=new Object(); link=null; }
    
    Nodo(Object n )
    { dato=n; link=null;}
    
    public void setlink(Nodo n){link=n;}
    
    public Nodo getlink(){return link;}
    
    public void setdato(Object n){dato=n;}
    public Object getdato(){return dato;}
    
}
