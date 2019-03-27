
import java.util.ArrayList;
import java.util.Scanner;


public class Book {
    ArrayList<String> words = new ArrayList<String>();
    /**
     *@param s oliver scanner
     */
    public Book(Scanner s){
        while(s.hasNext()){
            String t = s.nextLine().toLowerCase();        
            for(int i=32;i<128;i++){    
                if(!(i >= 'A' && i<='Z' || i>='a' && i<='z' || i==' ')) t = t.replace(""+(char)i, "");
            }//for
            String[] temp = t.split(" ");
            for(int i=0;i<temp.length;i++){
                if(temp[i].length()>0){ 
                    words.add(temp[i]);
                }//if 
            }//for       
        }//while
        System.out.println("Book loaded...");
    }//book
    
    /**
     *@return words from book
     */
    public ArrayList<String> getWords(){
        return words;
    }//getWords
}//class
