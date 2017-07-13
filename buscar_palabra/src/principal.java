

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
        //this.setLocation(400, 180);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //setSize(600,500);      
        ControlArchivo ar=new ControlArchivo();       
        txtDireccionArchivo.setEnabled(false);
        textAreaResultado.setEnabled(false);
        buscar.setEnabled(false);
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtDireccionArchivo = new javax.swing.JTextField();
        txtPalabraBuscada = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblTamanio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("seleccionar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 19, 270, 30));

        txtDireccionArchivo.setEditable(false);
        txtDireccionArchivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtDireccionArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 500, -1));
        getContentPane().add(txtPalabraBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 142, 232, 30));

        buscar.setText("buscar palabra");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 141, 140, 30));

        lblNombre.setBackground(new java.awt.Color(0, 153, 51));
        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 260, 20));

        lblTamanio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lblTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 130, 27));

        textAreaResultado.setColumns(20);
        textAreaResultado.setRows(5);
        jScrollPane1.setViewportView(textAreaResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 196, 530, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre Archivo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tamaño Archivo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ruta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\buscar_palabra\\fondo.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 660, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        JFileChooser dialogo=new JFileChooser();
        dialogo.setDialogTitle("Abrir");
        //Aquí se está filtrando el tipo de archivo a mostrar en la ventana
        //en este caso se hace para que sólo muestre archivos txt
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivos txt","txt");
        dialogo.setFileFilter(filtro);
        //condición para verificar si selecciona algún archivo
        if(dialogo.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
        {
            String pathArchivo=dialogo.getSelectedFile().getPath();
             txtDireccionArchivo.setText(pathArchivo);
            
           
          
            File archivo=new File(pathArchivo);
            lblNombre.setText(archivo.getName());
            //Tamaño del archivo en bit
            lblTamanio.setText(String.valueOf(archivo.length())+" bit");
        }
        
        buscar.setEnabled(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
 void buscar()
 {
      if(!txtDireccionArchivo.getText().trim().isEmpty() && !txtPalabraBuscada.getText().trim().isEmpty())
        {
            ControlArchivo.buscarPalabraEnArchivo(txtDireccionArchivo.getText(), txtPalabraBuscada.getText(), textAreaResultado);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Complete datos. Seleccione archivo e ingrese el dato a buscar");
        }
 }
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        buscar();
        textAreaResultado.setEnabled(true);
       
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTamanio;
    private javax.swing.JTextArea textAreaResultado;
    private javax.swing.JTextField txtDireccionArchivo;
    private javax.swing.JTextField txtPalabraBuscada;
    // End of variables declaration//GEN-END:variables
}
