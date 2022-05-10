import helper.*;
public class Queue<T>{
    private Node head;
    private Node tail;
    private int size=0;
    public Boolean add(Object val){
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
    public T peek(){
        if(this.head ==null) return null;
        return (T)this.head.value;
    }
    public T poll(){
        if(this.head ==null) return null;
        T val = (T)this.head.value;
        this.head = this.head.next;
        this.size--;
        return  val;
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
    public int length(){
        return this.size;
    }

    public Boolean isEmpty(){ return this.size==0 ? true:false;}

}
