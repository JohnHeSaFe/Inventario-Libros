/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.JOptionPane;
import model.Book;
import controller.InventoryManager;

/**
 *
 * @author henar
 */
public class AddBookDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddBookDialog
     */
    public AddBookDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        submitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        autorsField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        isbnField = new javax.swing.JTextField();
        returnButton = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Añadir libro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 270, 90));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Titulo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 50, -1));
        getContentPane().add(titleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 390, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 60, -1));

        priceSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        getContentPane().add(priceSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 60, -1));

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 110, -1));

        submitButton.setBackground(new java.awt.Color(51, 51, 51));
        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Enviar");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 110, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Autor/es:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, -1));
        getContentPane().add(autorsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 390, -1));

        jLabel6.setText("Si hay mas de 1 autor, separa cada autor por una coma (ej. Pablo, Manuel)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 460, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("ISBN:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 40, -1));
        getContentPane().add(isbnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, -1));

        returnButton.setBackground(new java.awt.Color(51, 51, 51));
        returnButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("←");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 490, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String isbn = isbnField.getText();
        String title = titleField.getText();
        String [] autors = autorsField.getText().trim().split(",");
        Float price = (Float) priceSpinner.getValue();
        
        int quantity = (int) quantitySpinner.getValue();
        
        if (isbn.isBlank() || title.isBlank() || autors == null) {
            JOptionPane.showMessageDialog(this, "Rellena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!isbn.matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(this, "El ISBN no puede tener caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!title.matches("^[a-zA-Z0-9ñÑáéíóúÁÉÍÓÚüÜàèòÀÈÒçÇ ]+$")) {
            JOptionPane.showMessageDialog(this, "El título no puede tener caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for (String autor : autors) {
            if (!autor.matches("^[a-zA-Z0-9ñNáéíóúñÁÉÍÓÚÜàèòÀÈÒçÇ ,.-]+$")) {
                JOptionPane.showMessageDialog(this, "Autores no puede tener caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        ArrayList<String> autorsList = new ArrayList<>();
        for (String autor : autors) {
            autorsList.add(autor.trim());
        }
        Book book = new Book(isbn, title, autorsList, price, quantity);
        
        if (InventoryManager.bookExists(book)) {
            JOptionPane.showMessageDialog(this, "El libro ya esta en el inventario", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        InventoryManager.books.put(isbn, book);
        JOptionPane.showMessageDialog(this, "El libro se añadió correctamente", "Info", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddBookDialog dialog = new AddBookDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorsField;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner priceSpinner;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JToggleButton returnButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField titleField;
    // End of variables declaration//GEN-END:variables
}
