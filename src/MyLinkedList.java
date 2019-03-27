
public class MyLinkedList <T> {
    private class Node<T>{
        T element;
        Node<T> next;
        public Node(T e){
            element = e;
        }
    }
    
    private int size;
    private Node head;
    private Node tail;
    public MyLinkedList(){
        head = null;
        tail = null;
        size =0;
    }
    public void add(T e){
        Node t =  new Node(e);
        if(head == null){
            head = t;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }//while
            temp.next = t;
        }//if
        tail = t;
        size++;
    }//add
    
    public boolean isEmpty(){
        return size==0;
    }//isEmpty
    
    public void addFront(T e){
        Node temp = new Node(e);
        temp.next = head;
        head = temp;
        size++;
    }//addFront
    public T deleteBack(){
        return delete(size-1);
    }//DeleteBack
    public T delete(int i){
        if(i==0){
            Node ret = head;
            head = head.next;
            size--;
            return (T)ret.element;
        }else if(i<size){
            int count=i-2;
            Node previous = head;
            while(count>=0){
                previous = previous.next;
                count--;
            }//while
            Node ret = previous.next;
            previous.next = previous.next.next;
            size--;
            return (T)ret.element;
        }//if
        return null;
    }//delete
    
    @Override 
    public String toString(){
      String ret="Total of "+size+" elements: [";
      Node temp = head;
      while(temp!=null){
          ret+=temp.element.toString()+", ";
          temp = temp.next;
      }//while
      return ret+"]";
    }//toString
    public void show(){
        System.out.println(this.toString());
    }//show
    public boolean contains(T e){
        Node temp = head;
        while(temp!=null){
            if(temp.element.equals(e)) return true;
            temp = temp.next;
        }
        return false;
    
    }//contains
    
    public int containsAndCount(T e){
        int count=0;
        Node temp = head;
        while(temp!=null){
            if(temp.element.equals(e)) count++;
            temp = temp.next;
        }//while
        return count;
    }//containsAndCount
    public MyLinkedList reverseList(){
        Node[] temp = new Node[size];
        Node node = head;
        for(int i=size-1;i>=0;i--){
            temp[i] = node;
            node = node.next;
        }//for
        MyLinkedList<T> ret = new MyLinkedList<T>();
        for(int i =0;i<size;i++){
            ret.add((T)temp[i].element);
        }//for
        return ret;
        
    }//LkinkedListPart1
    public int getSize(){
        return size;
    }//getSize
    public void clear(){
        head = null;
        size=0;
    }
   
}

