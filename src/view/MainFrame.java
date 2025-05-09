/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import view.AddBookDialog;
import controller.InventoryManager;
import java.awt.Color;

/**
 *
 * @author henar
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        textBackgroundLabel.setBackground(new Color(255, 255, 255, 200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        addBookButton = new javax.swing.JButton();
        updateBookButton = new javax.swing.JButton();
        deleteBookButton = new javax.swing.JButton();
        textBackgroundLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inventario Libros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 330, 70));

        exitButton.setBackground(new java.awt.Color(51, 51, 51));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Salir del programa");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 200, 60));

        addBookButton.setBackground(new java.awt.Color(51, 51, 51));
        addBookButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBookButton.setForeground(new java.awt.Color(255, 255, 255));
        addBookButton.setText("Agregar Libro");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 200, 60));

        updateBookButton.setBackground(new java.awt.Color(51, 51, 51));
        updateBookButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateBookButton.setForeground(new java.awt.Color(255, 255, 255));
        updateBookButton.setText("Actualizar Libro");
        updateBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 200, 60));

        deleteBookButton.setBackground(new java.awt.Color(51, 51, 51));
        deleteBookButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteBookButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteBookButton.setText("Eliminar Libro");
        deleteBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 200, 60));

        textBackgroundLabel.setBackground(new java.awt.Color(204, 204, 204));
        textBackgroundLabel.setForeground(new java.awt.Color(204, 204, 204));
        textBackgroundLabel.setOpaque(true);
        getContentPane().add(textBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 490, 530));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/background.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        InventoryManager.saveBooksToFile();
        
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        // TODO add your handling code here:
        AddBookDialog jdialog = new AddBookDialog(this, true);
        jdialog.setLocationRelativeTo(this);
        jdialog.setVisible(true);
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void updateBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookButtonActionPerformed
        // TODO add your handling code here:
        UpdateBookDialog jdialog = new UpdateBookDialog(this, true);
        jdialog.setLocationRelativeTo(this);
        jdialog.setVisible(true);
    }//GEN-LAST:event_updateBookButtonActionPerformed

    private void deleteBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookButtonActionPerformed
        // TODO add your handling code here:
        DeleteBookDialog jdialog = new DeleteBookDialog(this, true);
        jdialog.setLocationRelativeTo(this);
        jdialog.setVisible(true);
    }//GEN-LAST:event_deleteBookButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JButton deleteBookButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel textBackgroundLabel;
    private javax.swing.JButton updateBookButton;
    // End of variables declaration//GEN-END:variables
}
