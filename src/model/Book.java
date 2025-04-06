/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author henar
 */
public class Book {
    private String isbn;
    private String title;
    private ArrayList<String> autors;
    private float price;
    private int stock;

    public Book(String isbn, String title, ArrayList<String> autors, float price, int stock) {
        this.isbn = isbn;
        this.title = capitalizeString(title).trim();
        capitalizeString(autors);
        this.autors = autors;
        this.price = Math.round(price * 100) / 100f;
        this.stock = stock;
    }
    
    public Book(String title) {
        this.isbn = "";
        this.title = capitalizeString(title).trim();
        this.autors = null;
        this.price = 0;
        this.stock = 0;
    }
    
    public static String capitalizeString(String input) {
        if (input.isBlank()) {
            return "";
        }
        String [] words =  input.split(" ");
        String output = "";
        for (String word : words) {
            output += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        
        return output;
    }
    public static void capitalizeString(ArrayList<String> inputs) {
        for (int i = 0; i < inputs.size(); i++) {
            String name = inputs.get(i).trim();
            String[] words = name.split(" ");
            String capitalized = "";
            for (String word : words) {
                if (!word.isBlank()) {
                    capitalized += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
                }
            }
            
            inputs.set(i, capitalized.trim());
        }
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getAutors() {
        return autors;
    }

    public void setAutors(ArrayList<String> autors) {
        this.autors = autors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int Stock) {
        this.stock = Stock;
    }

    @Override
    public String toString() {
        String autorsValue = String.join(",", autors);
        String formattedPrice = String.format("%.2f", price);
        return isbn + ";" + title + ";" + autorsValue + ";" + formattedPrice + ";" + stock;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        return this.title.equalsIgnoreCase(other.title);
    } 
}
