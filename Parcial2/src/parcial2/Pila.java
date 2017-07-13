/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Arrow
 */
public class Pila {
    Nodo1 end;
    public Pila(){
        end=null;
   
    }
    public void push(int elemento){
        if(end == null)
            end = new Nodo1(elemento);
        else
        {
            Nodo1 aux = new Nodo1(elemento);
            aux.setBefore(end);
            end = aux;
        }
    }
    public void size()
    {
     Nodo1 aux = end;
     int count=0;
        System.out.print("\nSize of list... ");
        while(aux!=null){
            
            count++;
            aux = aux.getBefore();
        }
        System.out.println(count);
    }
    public void speek()
    {
        System.out.println("SPEEK : Next element : "+end.getDat());
        
    }
    public void pop()
    {
      System.out.println("POP : Next element : "+end.getDat());
//      Nodo1 aux = end;
      end = end.getBefore();
    }
//    public boolean empty(){
//    
//    }  
    public void show(){
        Nodo1 aux = end;
        System.out.println("\nResult\n");
        while(aux!=null){
            
            System.out.println(aux.getDat());
            aux = aux.getBefore();
        }
        
        
    }
    
}
