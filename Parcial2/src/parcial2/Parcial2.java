/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Arrow
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opcion=0,elemento; 
      
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "1. List tail\n"
                        + "2. List heap\n"
                        + "3. Close" + "\nChoose an Option...",
                        "List Simple",
                        JOptionPane.QUESTION_MESSAGE));
                
                switch(opcion){
                    case 1:
                        int opcion2=0;
                         Pila n = new Pila();
                       do{ try {
                opcion2 = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "1. Push\n"
                        + "2.Pop\n"+
                          "3.Speek\n" +
                                "4.Show\n"+
                                "5.Size\n"
                        + "6. Back" + "\n Choose an option...",
                        "List Tail",
                        JOptionPane.QUESTION_MESSAGE));
                       //Opciones en ejecucion
                       
                       switch(opcion2){
                       
                           case 1:
                               elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Add the element",
                                "Add...", JOptionPane.QUESTION_MESSAGE));
                        n.push(elemento);
                               break;
                           case 2:
                               n.pop();
                               break;
                           case 3:
                               n.speek();
                               break;
                           case 4 :
                               n.show();
                               break;
                           case 5:
                               n.size();
                               break;
                       }
                       
                       
                       }
                 catch (NumberFormatException fuck) {
                JOptionPane.showMessageDialog(null, "Error " + fuck.getMessage());}}while(opcion2!=6);
                        break;
                          case 2:
                                    int opcion3=0;
                         Cola n2 = new Cola();
                       do{ try {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "1. Push\n"
                        + "2.Pop\n"+
                          "3.Speek\n" +
                                "4.Show\n"+
                                "5.Size\n"
                        + "6. Back" + "\n Choose an option...",
                        "List Heap",
                        JOptionPane.QUESTION_MESSAGE));
                       //Opciones en ejecucion
                       
                       switch(opcion3){
                       
                           case 1:
                               elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Add the element",
                                "Add...", JOptionPane.QUESTION_MESSAGE));
                        n2.push(elemento);
                               break;
                           case 2:
                               n2.pop();
                               break;
                           case 3:
                               n2.speek();
                               break;
                           case 4 :
                               n2.show();
                               break;
                           case 5:
                               n2.size();
                               break;
                       }
                       
                       
                       }
                 catch (NumberFormatException fuck) {
                JOptionPane.showMessageDialog(null, "Error " + fuck.getMessage());}}while(opcion3!=6);
                              
                              
                        break;
                          
                
            }
            }
           catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
        }
            }while(opcion!=3);
        

    
    
}
        }
