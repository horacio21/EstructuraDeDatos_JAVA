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
public class DoLista 
{
    private DoNodo head;
    private DoNodo fin;
    private int cantidad_nodo;
     DoLista(){}
     DoLista(DoNodo n){head=n;cantidad_nodo++;}
     DoLista(Profesores  r){cantidad_nodo++; head=new DoNodo(r);}
    public DoNodo befor(){return fin;} 
    
    public void add(DoNodo n)
    {
      DoNodo l;
      if(head==null){head=n;}else
      {
        for(l=head;l.next()!=null;l=l.next());l.setnext(n);cantidad_nodo++;
    
      }
    }
    
    public void addhead(DoNodo n)
    {
        if(head==null){head=n;}else
        {
            n.setnext(head); head=n;
        
        }cantidad_nodo++;
    
    }
    /*
    public void  insertar(DoNodo n)
    {  DoNodo l,k;
    
    if(head==null){head=n;}
    else
    {
        if(Double.parseDouble(n.Dato().toString())<= Double.parseDouble(head.Dato().toString())){n.setnext(head);head=n;}
        else
        {
        
        for(l=head;Double.parseDouble(n.Dato().toString())> Double.parseDouble(l.Dato().toString())&& l.next()!=null;l=l.next());    
          {
            if(l.next()!=null)
            {  
         
              for(k=head;k.next()!=l;k=k.next());
                {k.setnext(n);n.setnext(l);}
            }else {l.setnext(n);}
        
          }
        }
    }
    } */
    
     public void  ins(DoNodo n)
    {  DoNodo l,k;
    
    if(head==null){head=n;}
    else
    {
        if(Double.parseDouble(n.Dato().getcodigo())<= Double.parseDouble(head.Dato().getcodigo())){n.setnext(head);head=n;}
        else
        {
        
        for(l=head;Double.parseDouble(n.Dato().getcodigo())> Double.parseDouble(l.Dato().getcodigo())&& l.next()!=null;l=l.next());    
          {
            if(l.next()!=null)
            {  
         
              for(k=head;k.next()!=l;k=k.next());
                {k.setnext(n);n.setnext(l);}
            }else {l.setnext(n);}
        
          }
        }
    }
    } 
    
     public void delete(DoNodo n)
    {
        DoNodo l;
        if(head==n){head=head.next();head.setnext(null);}
        else
        {
        for(l=head;l.next()!=n;l=l.next());
        l.setnext(n.next());
        }
    
    }
 
 
      public int borrar(String dato)
    {
        DoNodo l,k;
        for(l=head;(!l.Dato().getcodigo().equals(dato))&& l.next()!=null;l=l.next());
        
        if(l==head)
        {
            
            head=head.next();
            l.setnext(null);
            
            return 1;
        }
        if(l==null) return -1;
        
        else
        {
            for(k=head;k.next()!=l && k.next()!=null;k=k.next());
            k.setnext(l.next());
            l.setnext(null);
            
         return 1;
        }
    }
     
     
     
     
     
     
     
    
     public void printf()
     {
         DoNodo l;
         
         System.out.print("\n");
         for(l=head; l!=null;l=l.next()){System.out.print(l.Dato().toString() + " "); }
         System.out.print("\n");
     }
     
      public void print()
    {System.out.print("\n");
      System.out.print("\n*-*-*-*-*-*-*-*-*-*-*-*-");
      System.out.print("\n Lista De Profesores");
      System.out.print("\n*-*-*-*-*-*-*-*-*-*-*-*-");
      System.out.print("\n");
     DoNodo l=head;
    
    for(l=head; l!=null;l=l.next()){ System.out.print("\tCodigo: "+l.Dato().getcodigo().toString() + "\t \tnombre: "+l.Dato().getnombre().toString()+ 
            "\t \tApellido: "+l.Dato().getapellido().toString()+ "\t \tDireccion: "+l.Dato().getdireccion().toString()+ 
            "\t \tCarrera: "+l.Dato().getcarreraa().toString()+"\n");}
   /* do{
         l=l.next();
      System.out.print("\tCodigo: "+l.Dato().getcodigo() + "\tnombre: "+l.Dato().getnombre()+ "\tApellido: "+l.Dato().getapellido()+ "\tDireccion: "+l.Dato().getdireccion()+ "\tCarrera: "+l.Dato().getcarreraa()+"\n");
         
       }while(l.next()!=null);
      
      System.out.print("\n*-*-*-*-*-*-*-*-*-*-*-*-");
      System.out.print("\n");
      System.out.print("\n*-*-*-*-*-*-*-*-*-*-*-*-");
       System.out.print("\n");*/
    } 
    
}
