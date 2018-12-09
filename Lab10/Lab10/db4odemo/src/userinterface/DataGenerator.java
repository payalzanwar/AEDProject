/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Medicine.Medicine;
import Business.Medicine.MedicineDirectory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author harshalneelkamal
 */
public class DataGenerator {
        
    private static DataGenerator instance;
    
    private FileWriter writer;
    private File file;
    BufferedWriter bw;
      PrintWriter out ;
    private BufferedReader reader;
    private String[] header;
 //   private BookDirectory books;
       
   

 //   private final String COMMENT_HEADER = "Comment-Id,Post-id,Posting-User-Id,Likes,Commenting-User-Id, Comment";
  //  private final String USER_HEADER = "User-Id,First-Name,Last-Name,Rating";
    private static final String LINE_BREAK = "\n";
    
    private final String USER_CAT_PATH = "./UserCatalogue.csv";
    private static final String COMMENT_FILE_PATH = "./ProductCatalogue.csv";
    private final String USER_HEADER = "Brand,Medicine-Name,Salt-Comp1,Salt-Comp2,Salt-Comp3,Type,Disease,No-of-units,Price";
    private DataGenerator() throws IOException {
                
       
        
       file = new File(COMMENT_FILE_PATH);
       reader = new BufferedReader(new FileReader(file));
        generateCommentFile(reader);
       writer = new FileWriter(file,true);
            bw = new BufferedWriter(writer);
             out = new PrintWriter(bw);
             
            // writer.append(USER_HEADER);
        try {
                writer.flush();
                writer.close();
                if(bw!=null)
               bw.close();
               if(out!=null)
               out.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
    }
    
    public static DataGenerator getInstance() throws IOException{
        if(instance == null)
        {
            instance = new DataGenerator();
        }
        return instance;
    }
    
    
    private static void generateCommentFile(BufferedReader reader) throws IOException{
        //generate Order file
        try {
            MedicineDirectory  med=new MedicineDirectory();
            BookDirectory bok = new BookDirectory();
             
             readBooksFromCSV(bok,med,reader);

        // let's print all the person read SSVfrom CSV file
        for (Medicine b : med.getMedicineList()) {
            System.out.println(b);
        }
            
             

            System.out.println("New Comment File Created");
         
        }finally{
            System.out.println("in try");
            
        }
        
      
        
    }
    public String getCommentFilePath(){
        return COMMENT_FILE_PATH;
    }
    
   // private  List<Book> readBooksFromCSV(String fileName) {
         private static void readBooksFromCSV(BookDirectory v,MedicineDirectory b,BufferedReader reader) {
    //    List<Book> books = new ArrayList();
        Path pathToFile = Paths.get(COMMENT_FILE_PATH);

       
try{
    
 
            // read the first line from the text file
            String line = reader.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                for(int i=0;i<1;i++){
                    System.out.println("attribute 1"+attributes[i]);
                    if(!(attributes[i].equalsIgnoreCase("Brand"))){
               
              b.AddMedicine(attributes);
                    }
                }
                // adding book into ArrayList
               

                // read next line before looping
                // if end of file reached, line would be null
                line = reader.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

     //   return books;
    }

   
     

}



    

  
