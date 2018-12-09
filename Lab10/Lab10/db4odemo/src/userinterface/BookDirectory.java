/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.util.ArrayList;

/**
 *
 * @author Payal Zanwar
 */
public class BookDirectory {
     public static ArrayList<Book> BookList;

    public BookDirectory() {
        BookList = new ArrayList();
    }

    public static ArrayList<Book> getBookList() {
        return BookList;
    }
    
    
     public static Book createBook(String[] metadata) {
        
        
        String name = metadata[0];
        int price = Integer.parseInt(metadata[1]);
        String author = metadata[2];
       //  Book b = new Book(name,price,author);
        Book b = new Book();
         b.setName(name);
         b.setPrice(price);
                 b.setAuthor(author);
                 int unit = Integer.parseInt(metadata[3]);
        b.setUnits(unit);
        b.setType(metadata[4]);

        b.setDisease(metadata[5]);
        // create and return book of this metadata
        BookList.add(b);
        return b;
    }
    
}
