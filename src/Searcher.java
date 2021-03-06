
import java.util.Scanner;


public class Searcher {
    private MyLinkedList<String>[] list = new MyLinkedList[26];
    private int size;
    
    /**
     *@param s dictionary scanner
     */
    public Searcher(Scanner s){
        for (int i = 0; i < list.length; i++) {
            list[i] = new MyLinkedList<String>();   
        }//for
        
        while(s.hasNext()){
            String temp = s.nextLine();
            if(temp.charAt(0) >= 'a'){
                list[temp.charAt(0) - 'a'].add(temp);
            }else{
                list[temp.charAt(0) - 'A'].add(temp.toLowerCase());
            }//if
        }//while
        
        System.out.println("Dictionary loaded...");
        
        
        
    }//searcher
    /**
     *@return dictionary list
     */
    public MyLinkedList<String>[] getList(){
        return list;
    }//getList
    /**
     *@return dictionary size
     */
    public int getSize(){
        return size;
    }//getSize
}
