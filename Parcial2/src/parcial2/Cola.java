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
public class Cola {
    Nodo1 start,end;
    public Cola(){
        start=null;
        end= null;
   
    }
    public void push(int elemento){
        if(start == null){
            start = new Nodo1(elemento);
        end=start;   }
        else
        {
            Nodo1 aux = new Nodo1(elemento);
            end.setNext(aux);
            end=aux;
            
        }
    }
    public void size()
    {
     Nodo1 aux = start;
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
        System.out.println("SPEEK : Next element : "+start.getDat());
        
    }
    public void pop()
    {
      System.out.println("POP : Next element : "+start.getDat());
//      Nodo1 aux = start;
      start= start.getNext();
    }
//    public boolean empty(){
//    
//    }  
    public void show(){
        Nodo1 aux = start;
        System.out.println("\nResult\n");
        while(aux!=null){
            
            System.out.println(aux.getDat());
            aux = aux.getNext();
        }
        
        
    }
    
}
