/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;


//import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jean_Carlos
 */
public class Product {
    
     public static void main(String[] args) 
    {
       Lista l = new Lista();
        Scanner tcl = new Scanner(System.in);
        int opc = 0;
        
        do
        {
        System.out.println("\n::_Opciones_::\n");
        System.out.println("1.Agregar");
        System.out.println("2.Buscar");
        System.out.println("3.Borrar");
        System.out.println("4.Cargar Archivos");
        System.out.println("5.Salir");
        System.out.println("\n::_Escoja una Opcion_::\n");
        opc = tcl.nextInt();
        
        switch(opc){
            case 1: System.out.println("\n Agregar nodo \n");
            System.out.println("\n ingrese los datos 'Ref', 'Desc', 'Cat', 'prec', 'cos'\n");
            for(int i=0; i <=5;i++)
            { 
           int dto =  tcl.nextInt();
           Nodo d;
           d= new Nodo((int)dto);
            l.agregar(d);
            }l.print();break;
                
           case 4: System.out.println("\n Cargar Archivos");
           l.print();
           break;
        
        
        }
        
        
        }while(opc !=5);
       
        
    }
    
}
