/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.InventoryManager;
import view.MainFrame;

/**
 *
 * @author henar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InventoryManager.initializeFile();
        InventoryManager.loadBooksFromFile();

        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }

}
