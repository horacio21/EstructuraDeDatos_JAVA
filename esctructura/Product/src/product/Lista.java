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
public class Lista {
     private Nodo first; private  int gty=0;
    Lista(){}
    Lista(Nodo n){first=n;gty++;}
    
    Lista(Object r){gty++; first=new Nodo(r);}
    
    public void agregar(Nodo n)
    { Nodo l=first;
    if(first==null){first=n;}else
    {
    for(l=first;l.getlink()!=null;l=l.getlink());l.setlink(n);
    }gty++;
    
    }
    public int getcont(){return gty;}
    
    public void print()
    {  
       System.out.print("\n*-*-*-*-*-*-*-*-*-*-*-*-");
       System.out.print("\n");
      for(Nodo l=first;l.getlink()!=null;l=l.getlink()){System.out.print(l.getdato() + " "); }
      System.out.print("\n");
      System.out.print("\n*-*-*-*-*-*-*-*-*-*-*-*-");
      System.out.print("\n");
      System.out.print("\n");
    }
    
    public void desp()
    {
    Nodo act = new Nodo();
    act = first;
    
    do{
    
    {System.out.println(act.getdato() + " "); }
    
    
    }while(act != first);
    
    
    }
   
    
    
    public void agregarfirst(Nodo n)
    {
        if(first==null){first=n;}else
        {n.setlink(first); first=n;}gty++;
    }
    
    public void  insertar(Nodo n)
    {  Nodo l,k;
    
    if(first==null){first=n;}
    else
    {
        if(Double.parseDouble(n.getdato().toString())< Double.parseDouble(first.getdato().toString())){n.setlink(first);first=n;}
        else
        {
        
        for(l=first;Double.parseDouble(l.getdato().toString())< Double.parseDouble(n.getdato().toString())&& l.getlink()!=null;l=l.getlink());    
          {
            if(l.getlink()!=null)
            {   n.setlink(l);
         
              for(k=first;k.getlink()!=l;k=k.getlink());
                {k.setlink(n);}
            }else {l.setlink(n);}
        
          }
        }
    }
    
    }
    
}
