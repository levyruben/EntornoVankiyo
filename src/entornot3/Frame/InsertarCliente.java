/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package entornot3.Frame;

import entornot3.Cliente;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class InsertarCliente extends javax.swing.JFrame {

    /**
     * Creates new form InsertarCliente
     */
    public InsertarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver = new javax.swing.JButton();
        Edad = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        InsertarCliente = new javax.swing.JButton();
        jTextEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        Sexo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(451, 647));
        setPreferredSize(new java.awt.Dimension(451, 647));

        Volver.setBackground(new java.awt.Color(255, 255, 255));
        Volver.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Volver.setForeground(new java.awt.Color(0, 0, 0));
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Edad.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Edad.setForeground(new java.awt.Color(255, 255, 255));
        Edad.setText("Edad :");

        jTextNombre.setToolTipText("Introducir nombre");
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });

        InsertarCliente.setBackground(new java.awt.Color(255, 255, 255));
        InsertarCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        InsertarCliente.setForeground(new java.awt.Color(0, 0, 0));
        InsertarCliente.setText("INSERTAR CLIENTE");
        InsertarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertarClienteMouseClicked(evt);
            }
        });
        InsertarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarClienteActionPerformed(evt);
            }
        });

        jTextEdad.setToolTipText("Edad");
        jTextEdad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextEdadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextEdadKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Nombre :");

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        Sexo.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Sexo.setForeground(new java.awt.Color(255, 255, 255));
        Sexo.setText("Sexo :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(InsertarCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextEdad))
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sexo)
                .addGap(7, 7, 7)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertarCliente)
                    .addComponent(Volver)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_VolverActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void InsertarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarClienteActionPerformed
        boolean fallo = false;
        if (fallo) {
            this.setVisible(false);
            Fallo_Cliente a = new Fallo_Cliente();
            a.setVisible(true);
        } else {
            this.setVisible(false);
            Menu a = new Menu();
            a.setVisible(true);

        }
    }//GEN-LAST:event_InsertarClienteActionPerformed

    private void InsertarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertarClienteMouseClicked
        // TODO add your handling code here:

        Cliente cliente1 = new Cliente(nombre, edad, sexo);


    }//GEN-LAST:event_InsertarClienteMouseClicked

    private void jTextEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEdadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                String texto = this.jTextNombre.getText();
                edad = Integer.parseInt(texto);
            } catch (InputMismatchException e) {
                this.setVisible(false);
                Fallo_Cliente a = new Fallo_Cliente();
                a.setVisible(true);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEdadKeyPressed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped

        // TODO add your handling code here:
        char TipoDeTecla = evt.getKeyChar();
        if (Character.isDigit(TipoDeTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEdadKeyTyped
        // TODO add your handling code here:

        int TipoDeTecla = evt.getKeyChar();
        if (Character.isAlphabetic(TipoDeTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextEdadKeyTyped

    private void jTextNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyPressed
        // TODO add your handling code here:
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                nombre = this.jTextNombre.getText();
                this.setVisible(false);
                Correcto a = new Correcto();
                a.setVisible(true);
                
            }
        } catch (Exception e) {
            this.setVisible(false);
            Fallo_Cliente a = new Fallo_Cliente();
            a.setVisible(true);
        }


    }//GEN-LAST:event_jTextNombreKeyPressed

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
            java.util.logging.Logger.getLogger(InsertarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarCliente().setVisible(true);
            }
        });
    }
    boolean sexo;
    String nombre;
    int edad;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edad;
    private javax.swing.JButton InsertarCliente;
    private javax.swing.JLabel Sexo;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
