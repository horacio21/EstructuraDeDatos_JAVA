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
public class DoNodo 
{
    
   private Profesores  dato;
    private DoNodo Prox; 
    private DoNodo before;

    public DoNodo getBefore() {
        return before;
    }

    public void setBefore(DoNodo before) {
        this.before = before;
    }
    
     DoNodo()
    { dato=new Profesores (); Prox=null; }
    
    DoNodo(Profesores  n )
    { dato=n; Prox=null;}

    public Profesores  Dato() {return dato;}

    public void setDato(Profesores  dato) { this.dato = dato; }

    public DoNodo next() {return Prox; }   public void setnext(DoNodo Prox) {this.Prox = Prox; }
  
}
