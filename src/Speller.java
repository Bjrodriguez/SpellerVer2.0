
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Speller {
    public static void main(String[] args){
        Scanner dictionary, olive;
        Searcher searcher ;
        try{
            dictionary = new Scanner(new File("random_dictionary.txt"));
            olive = new Scanner(new File("oliver.txt"));
            searcher = new Searcher(dictionary);
            for (int i = 0; i < 26; i++) {
                System.out.println( (char)('A'+i)+": "+searcher.getList()[i].getSize());
                
            }
            
        }catch(IOException e){
            System.out.println("failed to read file, message: "+ e.getMessage());
        }
    }
    
    
}
