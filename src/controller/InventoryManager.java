/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Book;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author henar
 */
public class InventoryManager {
    
    public static HashMap<String, Book> books = new HashMap<>();
    public static File inventory;
   
    public static void initializeFile() {
        String separator = File.separator;
        
        File directory = new File(System.getProperty("user.dir") + separator + "files");
        if (!directory.exists()) {
            directory.mkdir();
        }
        
        File file = new File(directory + separator + "inventory.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating file");
            }
        }
        
        inventory = file;
    }
    
    public static void loadBooksFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(inventory)); 
            
            while (true) {
                String line = br.readLine();
                
                if (line == null) {
                    break;
                }
                if (line.isBlank()) {
                    continue;
                }
                
                String [] values = line.split(";");
                
                String [] autors = values[2].split(",");
                ArrayList<String> autorsList = new ArrayList<>();
                for (String autor : autors) {
                    autorsList.add(autor.trim());
                }
                
                books.put(
                        values[0], 
                        new Book(
                            values[0], 
                            values[1], 
                            autorsList, 
                            Float.parseFloat(values[3].replace(",", ".")), 
                            Integer.parseInt(values[4])
                        )
                );
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
    
    public static void saveBooksToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(inventory));
            
            Iterator it = books.keySet().iterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                String values = books.get(key).toString();
                
                bw.write(values);
                bw.newLine();
            }
            
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
    
    public static boolean bookExists(Book book) {
        Iterator it = books.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            /* Check by title */
            if (books.get(key).equals(book)) {
                return true;
            /* Check by ISBN */
            } else if (books.get(key).getIsbn().equals(book.getIsbn())){
                return true;
            }
        }
        
        return false;
    }
    
    public static void updateBook(String title, Float price, int stock) {
        Book book = new Book(title);
        Iterator<String> it = books.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (books.get(key).equals(book)) {
                books.get(key).setPrice(price);
                books.get(key).setStock(stock);
                return;
            } 
        }
    }
    
    public static void deleteBook(String title) {
        Iterator it = books.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (books.get(key).getTitle().equals(Book.capitalizeString(title).trim())) {
                it.remove();
                break;
            } 
        }
    }
}
