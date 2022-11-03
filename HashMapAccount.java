package collections1;
import java.util.*;
public class HashMapAccount {
	public static void main(String arg[]) {
		Map<Account,Double> map = new HashMap<Account,Double>();
		Account a1 = new Account(112,"Riya ",15000,"HDFC");
		
		map.put(a1, 35000.0);
		map.put(new Account(113,"Priya",15000,"CNB"), 15000.0);
		map.put(new Account(103,"Raj",70000,"SBI"), 70000.0);
		System.out.println(map);
		System.out.println("Raj exist in map:"+map.containsKey(a1));
		System.out.println("Account with balance amount 70000 exist:" + map.containsValue(70000.0));
	}
}
