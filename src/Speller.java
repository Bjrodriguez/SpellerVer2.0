
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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
