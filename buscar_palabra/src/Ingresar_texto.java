
public class Ingresar_texto extends javax.swing.JFrame {

     private xFichero file;
    public Ingresar_texto() {
        initComponents();
        this.setLocationRelativeTo(null);
        //crea la instancia pasando como parametros los controles JTextField
        file = new xFichero( this.txtID, this.txtNombre, this.txtCorreo );
        this.setTitle("" + file.getFileName());
        this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        /**
        * @web http://www.jc-mouse.net/
        * @author Mouse
        */

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 73, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, -1, -1));

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtID.setDoubleBuffered(true);
        txtID.setDragEnabled(true);
        txtID.setFocusCycleRoot(true);
        txtID.setFocusTraversalPolicyProvider(true);
        txtID.setInheritsPopupMenu(true);
        txtID.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 25, 260, 30));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(260, 20));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 73, -1, 34));

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreo.setPreferredSize(new java.awt.Dimension(260, 20));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 125, -1, 31));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 24, 520, 201));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\buscar_palabra\\fondo.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 290));

        jMenu1.setText(" Archivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\buscar_palabra\\descarga (1).jpg")); // NOI18N
        jMenuItem1.setText(" Abrir Archivo");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\buscar_palabra\\img-guardar.gif")); // NOI18N
        jMenuItem2.setText(" Guardar");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\buscar_palabra\\img-guardar.gif")); // NOI18N
        jMenuItem3.setText("Guardar Como");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\buscar_palabra\\TuxPaint_salir.png")); // NOI18N
        jMenuItem4.setText(" Salir");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem5.setText(" Buscar Por Codigo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
      this.dispose();
    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        principal p=new principal();
        p.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
       
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        
        
        
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
       
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        // file.Abrir();
        // this.setTitle("" + file.getFileName());
         principal in =new principal();
         in.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     String datos = this.txtID.getText() + "  " + this.txtNombre.getText() + "  " +  this.txtCorreo.getText();
        file.Actualizar(datos);
        this.setTitle("" + file.getFileName() );        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         String datos = this.txtID.getText() + "  " +  this.txtNombre.getText() +  "     "+  this.txtCorreo.getText() + "\n";
        file.GuardarComo(datos);
        this.setTitle("" + file.getFileName() );
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar_texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_texto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
