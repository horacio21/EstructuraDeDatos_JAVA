/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donodo;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.animation.PauseTransition;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import sun.invoke.empty.Empty;

/**
 *
 * @author Jean_Carlos
 */
public class Graf extends javax.swing.JFrame {
    
    DefaultTableModel ta = new DefaultTableModel();
    
    Profesores pr;
    DoNodo r;
    String []Datos= new String[5];
    DoLista k=new DoLista();

    /**
     * Creates new form Graf
     */
    public Graf() {
        initComponents();
        this.getRootPane().setBackground(Color.yellow);
        ta.addColumn("codigo");
        ta.addColumn("nombre");
        ta.addColumn("apellido");
        ta.addColumn("direccion");
        ta.addColumn("setcarreraa");
        this.Table.setModel(ta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        TxtRef = new java.awt.TextField();
        TxtCan = new java.awt.TextField();
        TxtPre = new java.awt.TextField();
        TxtCos = new java.awt.TextField();
        TxtDes = new java.awt.TextField();
        Ref = new javax.swing.JLabel();
        Des = new javax.swing.JLabel();
        Cant = new javax.swing.JLabel();
        Pre = new javax.swing.JLabel();
        Cos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Guardar = new java.awt.Button();
        Txtbus = new java.awt.TextField();
        Ref1 = new javax.swing.JLabel();
        Guardar1 = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        Agregar1 = new java.awt.Button();
        Agregar = new java.awt.Button();
        Cargar = new java.awt.Button();
        Nuevo = new java.awt.Button();
        Eliminar = new java.awt.Button();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profesores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 3, 18), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jPanel1.setName(""); // NOI18N

        TxtRef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRefKeyTyped(evt);
            }
        });

        TxtDes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDesKeyTyped(evt);
            }
        });

        Ref.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        Ref.setForeground(new java.awt.Color(255, 0, 0));
        Ref.setText("Codigo:");

        Des.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        Des.setForeground(new java.awt.Color(255, 0, 0));
        Des.setText("Nombre:");

        Cant.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        Cant.setForeground(new java.awt.Color(255, 0, 0));
        Cant.setText("Apellido:");

        Pre.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        Pre.setForeground(new java.awt.Color(255, 0, 0));
        Pre.setText("Direccion");

        Cos.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        Cos.setForeground(new java.awt.Color(255, 0, 0));
        Cos.setText("carrera");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pre, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cant, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Des, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ref, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtCan, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(TxtDes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtCos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtPre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtRef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ref)
                    .addComponent(TxtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Des)
                    .addComponent(TxtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cant)
                    .addComponent(TxtCan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pre)
                    .addComponent(TxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cos)
                    .addComponent(TxtCos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title5"
            }
        ));
        Table.setRequestFocusEnabled(false);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tablacli(evt);
            }
        });
        jScrollPane2.setViewportView(Table);

        Guardar.setActionCommand("Guardar");
        Guardar.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        Guardar.setLabel("Modificar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Txtbus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtbusKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtbusKeyTyped(evt);
            }
        });

        Ref1.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        Ref1.setForeground(new java.awt.Color(255, 0, 0));
        Ref1.setText("Buscar:");

        Guardar1.setActionCommand("Guardar");
        Guardar1.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        Guardar1.setLabel(" Mostar Lista");
        Guardar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mousclip(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "_Opciones_", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 3, 18), new java.awt.Color(204, 0, 0))); // NOI18N

        Agregar1.setActionCommand("Guardar");
        Agregar1.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        Agregar1.setLabel("Guargar");
        Agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar1ActionPerformed(evt);
            }
        });

        Agregar.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        Agregar.setLabel("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Cargar.setActionCommand("cargar");
        Cargar.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        Cargar.setLabel("cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        Nuevo.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        Nuevo.setLabel("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Eliminar.setActionCommand("ELiminar");
        Eliminar.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        Eliminar.setLabel("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Agregar1.getAccessibleContext().setAccessibleName("Guardar");
        Cargar.getAccessibleContext().setAccessibleName("Cargar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ref1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txtbus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txtbus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ref1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        
        if(TxtRef.getText().isEmpty()){JOptionPane.showMessageDialog(null, "No hay Codigo (el campo vacio)","ERROR",JOptionPane.ERROR_MESSAGE);return;}       
        if(TxtDes.getText().isEmpty()){JOptionPane.showMessageDialog(null, "No hay Nombre (el campo vacio)","ERROR",JOptionPane.ERROR_MESSAGE);return;} 
        if( TxtCan.getText().isEmpty()){JOptionPane.showMessageDialog(null, "No hay Apellido (el campo vacio)","ERROR",JOptionPane.ERROR_MESSAGE);return;}
        if( TxtPre.getText().isEmpty()){JOptionPane.showMessageDialog(null, "No hay Direccion (el campo vacio)","ERROR",JOptionPane.ERROR_MESSAGE);return;} 
        if( TxtCos.getText().isEmpty()){JOptionPane.showMessageDialog(null, "No hay carrera (el campo vacio)","ERROR",JOptionPane.ERROR_MESSAGE);return;}  
       /* Producto pr = new Producto("ejemplo","laptop",25,15000,13500);
        Nodo r;
        Lista k;
        k=new Lista();
        
        for(int c=0;c<2;c++)
        {  
           
        pr = new Producto();
        pr.setreferencia(TxtRef.getText());
        pr.setdescripcion(TxtDes.getText());
        pr.setcantidad(Integer.parseInt(TxtCan.getText()));
        pr.setprecio( Float.parseFloat(TxtPre.getText()));
        pr.setcosto(Float.parseFloat(TxtCos.getText()));
        r=new Nodo(pr);
        k.agregar(r);
        System.out.println(".................. ");   
        }k.print();
        
        */
        
        String[] agr = new String[5];
        agr[0]=TxtRef.getText();
        agr[1]=TxtDes.getText();
        agr[2]=TxtCan.getText();
        agr[3]=TxtPre.getText();
        agr[4]=TxtCos.getText();
        ta.addRow(agr);
         pr=new Profesores();
         pr.setcodigo(agr[0]);
         pr.setnombre(agr[1]);
         pr.setapellido(agr[2]);
         pr.setdireccion(agr[3]);
         pr.setcarreraa(agr[4]);
        r=new DoNodo(pr);
         k.ins(r);
         k.print();
        
    }//GEN-LAST:event_AgregarActionPerformed

    private void TxtRefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRefKeyTyped
      char c= evt.getKeyChar();
      
       if(c<'0' || c>'9'){getToolkit().beep(); evt.consume();
           JOptionPane.showMessageDialog(null, "Solo puede digitar numeros");
       } 
       
    }//GEN-LAST:event_TxtRefKeyTyped

    private void TxtDesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDesKeyTyped
         char c= evt.getKeyChar();
       if(Character.isDigit(c)){getToolkit().beep(); evt.consume();
       
       }
    }//GEN-LAST:event_TxtDesKeyTyped

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
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
         ta.addRow(Datos);
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
      }             
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_CargarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
       if(TxtRef.getText().isEmpty()){
        return;
        }
      int n = Integer.parseInt(TxtRef.getText());
       int s= n+1;
        TxtRef.setText(String.valueOf(s));
        TxtDes.setText("");
        TxtCan.setText("");
        TxtPre.setText("");
        TxtCos.setText("");
    }//GEN-LAST:event_NuevoActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    if(k.borrar(TxtRef.getText())==1)
       {
           
        
        
           int rec = this.getRowByValue(ta, TxtRef.getText());
           ta.removeRow(rec);
           JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
           TxtRef.setText(null);
           TxtDes.setText(null);
           TxtCan.setText(null);
           TxtPre.setText(null);
           TxtCos.setText(null);
          // txtFiltro.setText(null);
           
           
         //  filtro();
          
           
           
       }
       else
       {
           JOptionPane.showMessageDialog(null, "La Operación no fue realizada");
       }
    /* DoLista k;
        k=new DoLista();
        if(TxtRef.getText().isEmpty()){JOptionPane.showMessageDialog(null, "(No hay archivo para eliminar)","ERROR",JOptionPane.ERROR_MESSAGE);return;}
        if(TxtDes.getText().isEmpty()){JOptionPane.showMessageDialog(null, "(No hay archivo para eliminar)","ERROR",JOptionPane.ERROR_MESSAGE);return;} 
        if( TxtCan.getText().isEmpty()){JOptionPane.showMessageDialog(null, "(No hay archivo para eliminar)","ERROR",JOptionPane.ERROR_MESSAGE);return;}
        if( TxtPre.getText().isEmpty()){JOptionPane.showMessageDialog(null, "(No hay archivo para eliminar)","ERROR",JOptionPane.ERROR_MESSAGE);return;} 
        if( TxtCos.getText().isEmpty()){JOptionPane.showMessageDialog(null, "(No hay archivo para eliminar)","ERROR",JOptionPane.ERROR_MESSAGE);return;}
        
       String eli = TxtRef.getText(); 
      // int eli = ta.s; 
       if(k.borrar(TxtRef.getText())==1){ k.borrar(eli);}else
       {JOptionPane.showMessageDialog(null, "No hay archivo para eliminar");}
        
        //DoLista k;
        k=new DoLista();
        for(int c=0; c<Table.getRowCount();c++)
        {
            try{
        pr= new Profesores();
        
        pr.setcodigo((Table.getValueAt(c,0).toString()));
        pr.setnombre(Table.getValueAt(c,1).toString());
        pr.setapellido(Table.getValueAt(c,2).toString());
        pr.setdireccion(Table.getValueAt(c,3).toString());
        pr.setcarreraa(Table.getValueAt(c,4).toString());
        r=new DoNodo(pr);
         k.ins(r);;
          
            }catch(Exception e){System.out.printf(e.getMessage());}
        
        
        }k.print();*/
        
        
    }//GEN-LAST:event_EliminarActionPerformed
 
     int getRowByValue(TableModel model, Object value) {
    for (int i = model.getRowCount() - 1; i >= 0; --i) {
        for (int j = model.getColumnCount() - 1; j >= 0; --j) {
            if (model.getValueAt(i, j).equals(value) && j==0) {
                // what if value is not unique?
                return i;
            }
        }
    }
    
    return 0;
 }
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        
        DoLista k;
        k=new DoLista();
        for(int c=0; c<Table.getRowCount();c++)
        {
            try{
        pr= new Profesores();
        
        pr.setcodigo((Table.getValueAt(c,0).toString()));
        pr.setnombre(Table.getValueAt(c,1).toString());
        pr.setapellido(Table.getValueAt(c,2).toString());
        pr.setdireccion(Table.getValueAt(c,3).toString());
        pr.setcarreraa(Table.getValueAt(c,4).toString());
        r=new DoNodo(pr);
         k.ins(r);;
          
            }catch(Exception e){System.out.printf(e.getMessage());}
        
        
        }k.print();
    }//GEN-LAST:event_GuardarActionPerformed

    
    private void TxtbusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtbusKeyTyped
        
    
        
        Txtbus.addKeyListener(new KeyAdapter() {
        public void keyReleased(final KeyEvent e) {
        String cadena = (Txtbus.getText()).trim();
    //Txtbus.setText(cadena);
    repaint();
    filtro();
    }
    });
    tr = new TableRowSorter(Table.getModel());
    Table.setRowSorter(tr);
    }//GEN-LAST:event_TxtbusKeyTyped

    private void TxtbusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtbusKeyPressed
          
          
    }//GEN-LAST:event_TxtbusKeyPressed

    private void mousclip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousclip
        // TODO add your handling code here:
        k.print();
    }//GEN-LAST:event_mousclip

    private void Tablacli(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tablacli
         int rec = this.Table.getSelectedRow();
       
        this. TxtRef.setText(Table.getValueAt(rec, 0).toString());
        this.TxtDes.setText(Table.getValueAt(rec, 1).toString());
        this.TxtCan.setText(Table.getValueAt(rec, 2).toString());
        this.TxtPre.setText(Table.getValueAt(rec, 3).toString());
        this.TxtCos.setText(Table.getValueAt(rec, 4).toString());  
    }//GEN-LAST:event_Tablacli

    private void Agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar1ActionPerformed
        // TODO add your handling code here:
        
        
       this.guarda();
    }//GEN-LAST:event_Agregar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graf().setVisible(true);
            }
        });
        
    }
 private TableRowSorter tr; //creamos el filtro

private void guarda()
   {
        try {
         JFileChooser  jfc = new JFileChooser();       
        jfc.showSaveDialog(null);
            //String sucursalesCSVFile = "DatosTabla.txt";
           // FileWriter fw= new FileWriter(new File(jfc.getSelectedFile().getPath())); 
            BufferedWriter bfw = new BufferedWriter(new FileWriter(jfc.getSelectedFile().getPath()));

            for (int i = 0 ; i < Table.getRowCount(); i++) //realiza un barrido por filas.
            {
                for(int j = 0 ; j < Table.getColumnCount();j++) //realiza un barrido por columnas.
                {
                    bfw.write((String)(Table.getValueAt(i,j)));
                    if (j < Table.getColumnCount() -1) { //agrega separador "," si no es el ultimo elemento de la fila.
                        bfw.write(",");
                    }
                }
                bfw.newLine();
                bfw.newLine();//inserta nueva linea.
            }

            bfw.close(); //cierra archivo!
            JOptionPane.showMessageDialog(null, "Guardado Correctamente");
        } catch (IOException e) {
            System.out.println("ERROR: Ocurrio un problema al salvar el archivo!" + e.getMessage());
        }
    }
  void guardar() throws IOException
    {
      JFileChooser  jfc = new JFileChooser(); 
                
        jfc.showSaveDialog(null);
        FileWriter fw= new FileWriter(new File(jfc.getSelectedFile().getPath())); 
              
    
    }

 public void filtro() {
    tr.setRowFilter(RowFilter.regexFilter(Txtbus.getText(), 1));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Agregar;
    private java.awt.Button Agregar1;
    private javax.swing.JLabel Cant;
    private java.awt.Button Cargar;
    private javax.swing.JLabel Cos;
    private javax.swing.JLabel Des;
    private java.awt.Button Eliminar;
    private java.awt.Button Guardar;
    private java.awt.Button Guardar1;
    private java.awt.Button Nuevo;
    private javax.swing.JLabel Pre;
    private javax.swing.JLabel Ref;
    private javax.swing.JLabel Ref1;
    private javax.swing.JTable Table;
    private java.awt.TextField TxtCan;
    private java.awt.TextField TxtCos;
    private java.awt.TextField TxtDes;
    private java.awt.TextField TxtPre;
    private java.awt.TextField TxtRef;
    private java.awt.TextField Txtbus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

   
}
