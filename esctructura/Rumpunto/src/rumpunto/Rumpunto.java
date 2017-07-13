/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumpunto;



/**
 *
 * @author Jean_Carlos*/
 import java.util.Scanner;
public class Rumpunto {
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { // TODO code application logic here
       System.out.println("_______*_{Ejercicio 1: Punto}_*______________\n");
      //-----------------------------------//
        Punto p1;
        p1=new Punto();
        p1.setX(3f);
        p1.setY(2f);
        
        p1.mover(4f,0f);
        
        p1.printf();
        System.out.println();
        System.out.println("_______*_{Ejercicio 2: Recta}_*______________\n");
      //-----------------------------------//
    
      Recta R=new Recta();
      R.setP1(3f,4f);
      R.setP2(new Punto(3f,5f));
    
          R.printf();
          
          System.out.println();
        System.out.println("_____*_{Ejercicio 3:Triangulo}_*______________\n");
      //-----------------------------------//
          
          
         
        Scanner tcl = new Scanner(System.in);
      Triangulo Tr=new Triangulo();
      Scanner tcll = new Scanner(System.in);
        int opc = 0;
        do{ try{  
         System.out.printf("~~~~~~~~~~~~~~~~~~\n");   
        System.out.println("::_Opciones_::");
        System.out.printf("~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("1.Triangulo");
        System.out.println("2.Salir");
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("::_Escoja una Opcion_::");
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        opc = tcll.nextInt();
       switch(opc){
            case 1:
        System.out.println("Digite la Coordenada de P1 'X' y 'Y' : ");
        float x1=(float)tcl.nextFloat();
        float y1=(float)tcl.nextFloat();
        
      Tr.setP1(x1,y1);
       System.out.println("Digite la Coordenada de P2 'X' y 'Y' : ");
        float x2=(float)tcl.nextFloat();
        float y2=(float)tcl.nextFloat();
      Tr.setP2(new Punto(x2,y2));
      
       System.out.println("Digite la Coordenada de P3 'X' y 'Y' Del P3: ");
        float x3=(float)tcl.nextFloat();
        float y3=(float)tcl.nextFloat();
      Tr.setP3(new Punto(x3,y3));
        }
      } 
      catch (Exception e) {
            System.out.println("Ha digitado un valor no permitido,(Force Sierre).");
            System.exit(0);
      
        } if (Tr.Verificar())
      {
           Tr.printfTr();
       }
       else
           System.out.println("\n Aviso:(Las Coordenada de los puntos ingresados no forman un Triangulo)"); 
        }while(opc !=2);
      
    }
    
}
