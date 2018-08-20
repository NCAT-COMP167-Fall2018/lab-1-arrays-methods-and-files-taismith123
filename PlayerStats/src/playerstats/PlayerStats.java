/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taismith
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] names = new String[80];
        int [] scores = new int[80];
        
        readData(names, scores, args[0]);
        
        // declaration = int number; 
        // instatiate int [] scores= new int[80];
        // initialize int number = 321;
    }
    public static void readData (String [] names, int[] scores, String fileName ){
        try {
            Scanner reader = new Scanner(new File (fileName));
            
            int currentIndex =0;
            while(reader.hasNext()) {
            String [] line = reader.nextLine().split("");
             
            names[currentIndex] = line[0];
            scores[currentIndex] = Integer.parseInt(line[1]);
             
             currentIndex++;
            }
        } catch (FileNotFoundException ex) {
           System.err.println("Unable to read file in readData");
          
        }
    
    }
}