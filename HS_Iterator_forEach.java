package collections1;
import java.util.*;
public class HashSet_Iterator_forEach {
	public static void main(String args[]) {
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(11);
		hs.add(13);
		hs.add(16);
		hs.add(17);
			
				System.out.println("Contents of HashSet Using forEach are :");
		
		hs.forEach(x -> System.out.println(x));
		
				System.out.println("Contents of HashSet Using Iterator are :");
		HashSet<String> set=new HashSet<String>();    
        set.add("Riya");    
        set.add("Priya");    
        set.add("Harsh");    
        set.add("Vansh");    
        
        Iterator<String> itr=set.iterator();    
        while(itr.hasNext()){    
           System.out.println(itr.next());    
        }    
		
	}

}
