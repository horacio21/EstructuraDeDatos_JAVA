/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumpunto;

/**
 *
 * @author Jean_Carlos
 */
public class Recta 
{

   private Punto p1,p2;
   
Recta(){p1=new Punto();p2=new Punto();}

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }
   
    
   public void printf()
     {
         //System.out.println("X="+p1.getX()+","+"Y="+p2);
     p1.printf();
     p2.printf();
     System.out.println("Distancia= "+segmentoRecta());
     
        
     }

    void setP1(float x, float y) {
        p1.set(x, y);
    }
   
    
    public float segmentoRecta()
    {
        return p1.distancia(p2);
   
    }
    
   

    

    
}
