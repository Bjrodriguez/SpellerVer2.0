
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Speller {
    public static void main(String[] args){
        Scanner dictionary, oliver;
        Searcher searcher ;
        Book book;
        try{
            dictionary = new Scanner(new File("random_dictionary.txt"));
            oliver = new Scanner(new File("oliver.txt"));
            book = new Book(oliver);
            searcher = new Searcher(dictionary);
            for (int i = 0; i < 26; i++) {
                System.out.println( (char)('A'+i)+": "+searcher.getList()[i].getSize());
                
            }//for
            
            int found=0;
            int notFound=0;
            int total=0;
            long time = System.nanoTime();
            for(int i =0;i<book.words.size();i++){
                
                if(searcher.getList()[book.getWords().get(i).charAt(0)-'a'].contains(book.getWords().get(i))){
                    found++;
                }else{
                    notFound++;
                }
                total++;
                
                if(i%1000==0){
                    System.out.println(i+"/"+book.words.size());
                }
            }
            time = System.nanoTime()-time;
            System.out.println("================================================");
            System.out.println("Time spent: "+(time/1000000d)+"ms");
            System.out.println("Words found: "+found);
            System.out.println("Words not found: "+notFound);
            System.out.println("Total comparisons: "+total);
            System.out.println("AVGCOMPSFOUND: "+((double)total/found));
            System.out.println("AVGCOMPSNOTFOUND: "+((double)total/notFound));
            
        }catch(IOException e){
            System.out.println("failed to read file, message: "+ e.getMessage());
        }//try
        
    }
    
    
}
