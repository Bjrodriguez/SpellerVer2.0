
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Speller {
    public static void main(String[] args){
        new Speller();
    }
    
    public Speller(){
        Scanner dictionary, olive;
        try{
            dictionary = new Scanner(new File("random_dictionary.txt"));
            olive = new Scanner(new File("oliver.txt"));
            
            
        }catch(IOException e){
            System.out.println("failed to read file, message: "+ e.getMessage());
        }
    }
}
