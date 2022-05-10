public class Main {
    public static void main(String[] args) {
        //STACK
         /*Queue<Integer> qu = new Queue<Integer>();
         System.out.println(qu.isEmpty());
         qu.add(100);
        qu.add(200);
        qu.add(300);
        qu.poll();
        qu.poll();
        qu.poll();
         System.out.println(qu.length());
        System.out.println(qu.peek());*/
        //=================================
        //QUEUE

        Stack st = new Stack();
        st.push(100);
        st.push(200);
        st.push(300);
        st.pop();
        st.pop();
//        st.pop();
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st.display());
    }
}