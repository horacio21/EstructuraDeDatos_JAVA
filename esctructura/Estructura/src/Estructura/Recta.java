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
public class Recta 
{
    private Punto p1 = new Punto();
    private Punto p2 = new Punto();

    public Punto getP1() {
        return p1;
    }

    public Punto getP2(){
        return p2;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2){
        this.p2 = p2;
    }
    
    public void setP1(float x1, float y1) {
        this.p1.setX(x1);
        this.p1.setY(y1);
    }

    public void setP2(float x2, float y2){
        this.p2.setX(x2);
        this.p2.setY(y2);
    }
    
    public void Recta() {

    }
    
    public void Recta (Punto p1, Punto p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public void Recta (float x1, float y1, float x2, float y2){
        this.p1.setX(x1);
        this.p1.setY(y1);
        this.p2.setX(x2);
        this.p2.setY(y2);
    }
    
    public void print_recta(){
        p1.print_putno();
        p2.print_putno();
    }
    
}
