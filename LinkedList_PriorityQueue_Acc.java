package collections1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedList_PriorityQueue_Account {
	public static void main(String args[]) {
		
        Queue<Account> q = new PriorityQueue<Account>();

        q.offer(new Account(112,"Riya",5000,"HDFC"));
        q.offer(new Account(113,"Priya",3000,"SBI"));
        q.offer(new Account(114,"Harsh",1000,"IND"));
      
        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());


        
        System.out.println("output from LinkedList implementation of Queue interface:");
        q = new LinkedList<Account>();

        q.offer(new Account(112,"Riya",5000,"HDFC"));
        q.offer(new Account(113,"Priya",3000,"SBI"));
        q.offer(new Account(114,"Harsh",1000,"IND"));
     
        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
	}
}
