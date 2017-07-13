/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author My Live
 */
public class Punto
{
    private float x;
    private float y;

    
    
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
    
    public Punto() {
        
    }

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public float Pendiente(Punto p2){
        return ((this.y - p2.y)/(this.x - p2.x));
    }
    
    public float Distancia(Punto p2){
        float dx = (float) (Math.pow((p2.x - this.x),2));
        float dy = (float) (Math.pow((p2.y - this.y),2));
        float rp = (float) (Math.sqrt((dx + dy ))) ;
        return rp;   
    }
    
    public void print_putno(){
        System.out.println(x + " , " + y);
    }
}
