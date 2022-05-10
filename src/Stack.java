import helper.*;

import java.util.EmptyStackException;

public class Stack<T> {
   private Node head;
   private Node tail;
   private int size=0;
   public Boolean push(Object val){
       Node node = new Node(val);
       if(head==null){
           this.head = node;
           this.tail = this.head;
           size++;
           return  true;
       }
       tail.next = node;
       tail = node;
       size++;
       return true;
   }

   public String display(){
       Node temp = this.head;
       String res = "";
       while(temp!=null){
           res+=temp.value+"->";
           temp = temp.next;
       }
       return  res;
   }

   public T pop(){
       T poped;
       if(size==0) throw  new EmptyStackException();
       if(size==1) {
           poped=(T)this.head.value;
           this.tail=null;
           this.head=null;
           size--;
           return poped;
       }
       Node newTail = null;
       Node temp = this.head;
       while(temp.next!=null){
           newTail = temp;
           temp = temp.next;
       }
       this.tail = newTail;
       poped=(T)temp.value;
       newTail.next=null;
       size--;
       return poped;
   }

   public T peek(){
       T poped;
       if(size==0) throw  new EmptyStackException();
       poped = (T)this.tail.value;
       return poped;

   }

    public Boolean isEmpty(){ return this.size==0 ? true:false;}

    public int length() {return this.size;}
}
