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
public class Punto 
{
    Punto(float x , float y){ this.x=x; this.y=y;}
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
   private float x,y;
      Punto(){x=y=0;}
     public void mover(float a, float b)
     {
         x=x+a; y=y+b;
     }
     
     public void set(float x,float y){ this.x=x;  this.y=y;}
     
     public void printf()
     {
         System.out.println("X= "+x+","+"Y= "+y);
         
     
     }

 
     public float distancia(Punto P1)
     {
     float d,dd;
     d=(P1.x-x)*(P1.x-x)+(P1.y-y)*(P1.y-y);
     dd=(float)(Math.sqrt(d));
     return dd;
     
     }
     
        public float Pendiente(Punto p1){
        return ((this.y - p1.y)/(this.x - p1.x));
    }
    
  
}
