package collections1;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAccount {
	public static void main(String args[]) {
		   SortedMap<Account,Double> acc = new TreeMap<Account,Double>();

		   Account a2 = new Account(102,"Riya",10000,"HDFC");

	       acc.put(a2,a2.getBalance()); 
		   
		   Account a1 = new Account(101,"Kanika",15000,"CNB");

	        acc.put(a1,a1.getBalance());

	        acc.put(new Account(103,"Harsh",25000,"SBI"),15000.0);
	        acc.put(new Account(100,"Ram",25000,"SBI"),45000.0);
	        
	        System.out.println(acc);


	        //sort account keys of tree map in ascending order of account name

	        System.out.println("sort account keys of tree map in ascending order of account name");
	        Comparator<Account> c = new ComparatorImplAccountName();
	        acc = new TreeMap<Account,Double>(c);

	        Account a11 =  new Account(112,"Riya",15000,"SBI");

	        mp.put(a11,a11.getBalance());

	        Account b11 = new Account(113,"Vansh",15000,"CNB");

	        acc.put(b11,b11.getBalance());


	        mp.put (new Account(114,"vanshi",6000,"PNB"),15000.0);
	        mp.put (new Account(115,"kanika1",45000,"PNB"),15000.0);

	        System.out.println(acc);

	}
}
