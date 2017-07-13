/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;
import java.util.Scanner;

/**
 *
 * @author Alvin Castillo Gomez
 */
public class Main
{
    public static void main(String [ ] args)
    {    
       System.out.println("Bienvenido Al Sistema De Verificacion De Triangulos");
       
       Triangulo t = new Triangulo();
       
       try{
        for(int x = 0; x <= 2; x ++){
              System.out.println("Por Favor Digite Las Coordenadas En X y Y Del Punto " + (x+1) +" Del Triangulo");
                Scanner s = new Scanner (System.in);
            switch (x) {
                case 0:
                    t.setP1((float)s.nextDouble(), (float)s.nextDouble());
                    System.out.println();
                    break;
                case 1:
                    t.setP2((float)s.nextDouble(), (float)s.nextDouble());
                    System.out.println();
                    break;
                case 2:
                    t.setP3((float)s.nextDouble(), (float)s.nextDouble());
                    System.out.println();
                    break;
            }
          }
       }
       catch (Exception e) {
            System.out.println("Ha digitado un valor no permitido por el sistema, el programa se cerrara.");
            System.exit(0);
        }
       
       if (t.Verificar()){
           t.Print_Triangulo();
           System.out.println(t.Angulos());
       }
       else
           System.out.println("Los puntos ingresados no forman un Triangulo"); 
       
    } 
}
