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
public class Triangulo 
{

    private Punto p1 = new Punto();
    private Punto p2 = new Punto();
    private Punto p3 = new Punto();
    
    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    public Punto getP3() {
        return p3;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public void setP3(Punto p3) {
        this.p3 = p3;
    }
    
    public void setP1(float x1, float y1) {
        this.p1.setX(x1);
        this.p1.setY(y1);
    }

    public void setP2(float x2, float y2){
        this.p2.setX(x2);
        this.p2.setY(y2);
    }
    
    public void setP3(float x3, float y3){
        this.p3.setX(x3);
        this.p3.setY(y3);
    }
    
    public void Triangulo(){
        
    }
    
    public void Triangulo (Punto p1,Punto p2,Punto p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public void Triangulo(float x1, float y1, float x2, float y2, float x3, float y3){
        this.p1.setX(x1);
        this.p1.setY(y1);
        this.p2.setX(x2);
        this.p2.setY(y2);
        this.p3.setX(x3);
        this.p3.setY(y3);
    }
    
    public boolean Verificar (){
        float a = p1.Pendiente(p2);
        float b = p1.Pendiente(p3);
        float c = p2.Pendiente(p3);
        
        if (a == b && b == c)
            return false;
        else
            return true;
    }
    
    public String Angulos (){
        
        String p = "Los puntos ingresados forman un triangulo: ";
        float dc = (float) (Math.pow(p1.Distancia(p2),2));
        float da = (float) (Math.pow(p2.Distancia(p3),2));
        float db = (float) (Math.pow(p3.Distancia(p1),2));
        
        float A = (float) (Math.round((Math.toDegrees(Math.acos((dc+db-da)/(2* (Math.sqrt(db)) * (Math.sqrt(dc))))))*1000.0)/1000.0);
        float B = (float) (Math.round((Math.toDegrees(Math.acos((dc-db+da)/(2* (Math.sqrt(da)) * (Math.sqrt(dc))))))*1000.0)/1000.0);
        float C = (float) (Math.round((Math.toDegrees(Math.acos((db+da-dc)/(2* (Math.sqrt(db)) * (Math.sqrt(da))))))*1000.0)/1000.0);
        
        if (A == 90 || B == 90 || C == 90)
            return p + "Rectangulo";
        else if (A > 90 || B > 90 || C > 90)
            return  p + "Obtusangulo";
        else
            return  p + "Acutangulo";
    }
    
    public void Print_Triangulo(){
        System.out.println("Los Puntos Escritos Son");
        System.out.print("Punto #1: ");
        p1.print_putno();
        System.out.print("Punto #2: ");
        p2.print_putno();
        System.out.print("Punto #3: ");
        p3.print_putno();
        System.out.println();
    }

}

