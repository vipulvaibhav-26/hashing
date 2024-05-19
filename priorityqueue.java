import java.util.*;
public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();  
    pq.add(1);
    pq.add(3);
    pq.add(6);
    pq.add(2);
    pq.add(4);
    System.out.println(pq);
    System.out.println(pq.peek());
    System.out.println(pq.poll());
    System.out.println(pq);
    Iterator<Integer> itr=pq.iterator();
    while(itr.hasNext()) 
      System.out.print(itr.next()+" ");
    }
}
