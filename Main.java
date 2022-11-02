package ArrayList;

import java.util.*;
public class Main {
	public static void main(String args[]) {
		Accounts a1 = new Accounts("Riya",657,1000);
		Accounts a2 = new Accounts("harsh",782,2000);  
		Accounts a3 = new Accounts("Priya",782,5000); 
		
		
		//Direct Comparing Objects 
		if(a1==a2) {
			System.out.println("Both Pointing to Same Object");
		}
		else if(a1.equals(a2)) {
			System.out.println("Same Object In Application");
		}
		else {
			System.out.println("Different Object");
		}
		
		
		ArrayList<Accounts> allaccounts = new ArrayList<Accounts>();
		allaccounts.add(a1);
		allaccounts.add(a2);
		allaccounts.add(a3);
				System.out.println(allaccounts);
		
		
		//Comparing ArrayList 
		System.out.println(allaccounts.get(0) == allaccounts.get(1));
		System.out.println(allaccounts.get(0).equals(allaccounts.get(1)));
		
	}
	

}
