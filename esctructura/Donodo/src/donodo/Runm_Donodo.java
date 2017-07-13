/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donodo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Jean_Carlos
 */
public class Runm_Donodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Profesores pr;
    DoNodo r;
    String []Datos= new String[5];
    DoLista k=new DoLista();
        // TODO code application logic here
        /*
         DoNodo r;
        DoLista lis;
        lis=new DoLista();
        System.out.println("-------------------------");
        System.out.println("------ Ejercicio 1-------");
        System.out.println("-------------------------");
        System.out.print("\n Insertar :\n");
        for(int i=65; i <=90;i++)
        {
            
           // r=new Nodo(new Random().nextInt(80));
            //c=new Char(i);
            //r=new Nodo((Object)c);
            r=new DoNodo((char)i);
            lis.add(r 
        }
        lis.printf();
        
        //Insertar cabesa
       lis=new DoLista();
        System.out.print("\n Insertar head:\n");
        for(int i=65; i <=90;i++)
        {
            r=new DoNodo((char)i);
            //r=new Nodo(new Random().nextInt(80));
            lis.addhead(r);   
        }
        lis.printf();
        
         //Organizar
       lis=new DoLista();
        System.out.print("\n Agregar:\n");
        for(int i=65; i <=90;i++)
        {
           //r=new Nodo((char)i);
            r=new DoNodo(new Random().nextInt(80));
            lis.insertar(r);   
        }
        lis.printf();*/
        System.out.println("\n-------------------------");
        System.out.println("------ Ejercicio 2-------");
        System.out.println("-------------------------");
         //DoLista k = new DoLista();
        Scanner tcl = new Scanner(System.in);
        int opc = 0;
       
        do
        {
        System.out.println("\n::_Opciones_::\n");
        System.out.println("1.Agregar");
        System.out.println("2.Mostrar Datos");
        System.out.println("3.Buscar");
        System.out.println("4.Cargar Archivos");
        System.out.println("5.Guardar");
        System.out.println("6.Borrar");
        System.out.println("7.Salir");
        System.out.println("\n::_Escoja una Opcion_::\n");
        opc = tcl.nextInt();
        
        switch(opc){
            case 1: System.out.println("\n*----opcion 1 (Agregar)----*");
            System.out.println("\n Cantidad De profesores:'\n");
            
                  int cp;
                cp=tcl.nextInt();
                pr = new Profesores();
                //Profesores pr = new Profesores();DoNodo r;
                //DoLista k;
               // k=new DoLista();
                
             for(int i=1; i <=cp;i++)
           { pr = new Profesores();
           System.out.println("\n ***** Profesor: "+i+" *****");
           try{//---------------codigo----------------//
           
               System.out.print("\n Codigo:\t");
           String codigo=tcl.next();
           pr.setcodigo((codigo.toString()));
            //-------------Nombre------------------//
           System.out.print("\n Nombre:\t");
           String nombre=tcl.next();
           pr.setnombre((nombre.toString()));
            //-------------Apellido------------------//
           System.out.print("\n Apellido:\t");
           String apellido=tcl.next();
           pr.setapellido((apellido.toString()));
            //-------------Direccion------------------//
           System.out.print("\n Direccion:\t");
           String direccion=tcl.next();
           pr.setdireccion((direccion.toString()));
          //-------------carrera------------------//
            System.out.print("\n carrera:\t");
           String carrera=tcl.next();
           pr.setcarreraa((carrera.toString()));
           
           r=new DoNodo(pr);
           k.ins(r);
          }catch(Exception e){System.out.printf(e.getMessage());}
           }k.print();break;
          
           case 2: System.out.println("\n*----opcion 2 (Mostrar Datos)----*");
           k.print();break;
        
           case 3: System.out.println("\n*----opcion 3 (Buscar)----*");
           k.print();break;
   
        case 4: System.out.println("\n*----opcion 4 (Cargar Archivos)----*");
        JFileChooser explorador = new JFileChooser("//");
        explorador.setDialogTitle("Abrir documento...");
        int seleccion = explorador.showDialog(null, "Abrir!");
       
        switch(seleccion) {
case JFileChooser.APPROVE_OPTION:
 //seleccionó abrir
 break;

case JFileChooser.CANCEL_OPTION:
 //dio click en cancelar o cerro la ventana
 break;

case JFileChooser.ERROR_OPTION:
 //llega aqui si sucede un error
 break;
}
        
        File archivo2 = explorador.getSelectedFile();
        String ruta2 = archivo2.getPath();
        
        System.out.print("\n"+ruta2+"\n");
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
     try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (ruta2);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         
         // Lectura del fichero
         String linea;
          //DefaultListModel model_lista = new DefaultListModel();
          //DefaultTableModel model_tabla = new DefaultTableModel();
         
         while((linea=br.readLine())!=null)
         {Datos = linea.split(","); int c=0; String li; 
         System.out.print("\n"+linea+"\n");
        while(c!=1 && (li=br.readLine())!=null   ) 
        {
         pr=new Profesores();
         pr.setcodigo(Datos[0]);
         pr.setnombre(Datos[1]);
         pr.setapellido(Datos[2]);
         pr.setdireccion(Datos[3]);
         pr.setcarreraa(Datos[4]);c++; 
         r=new DoNodo(pr);
         k.ins(r);
         } 
        
         }
      }      
      catch(IOException e){}finally{try{if( null != fr ){fr.close();}}catch (IOException e2){}
      } break;              
        
            case 5: System.out.println("\n*----opcion 5 (Guardar)----*");
           break; 
           
           case 6: System.out.println("\n*----opcion 6 (Borrar)----*");
           System.out.print("\n Regristro a eliminar:'\t");
           String eliminar=tcl.next();
           k.borrar((eliminar.toString()));break;
        }
        
       
        }while(opc !=7);
         
        
    }
    
  private void guarda() throws IOException
    {
      JFileChooser  jfc = new JFileChooser();       
        jfc.showSaveDialog(null);
            //String sucursalesCSVFile = "DatosTabla.txt";
           // FileWriter fw= new FileWriter(new File(jfc.getSelectedFile().getPath())); 
            BufferedWriter bfw = new BufferedWriter(new FileWriter(jfc.getSelectedFile().getPath()));
             
    }  
 
 
}
