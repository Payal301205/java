package project;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HMFunction {
	public static void userPair() {
		HashMap<String, String> hm1=new HashMap<String,String>();

		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number of keys?");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enetr the key");
			String k=sc.next();

			System.out.println("enetr the value");
			String v=sc.next();
			if(!hm1.containsKey(k)) {
				hm1.put(k, v);
			}else {
				System.out.println(" key already present");
			}
				

		}
		for(Map.Entry<String,String> m:hm1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		


	}
	public static void main(String[] args) {
		System.out.println("Hash Map: not entry order accg to hashcode formed");
		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		hm.put("P",100);
		hm.put("J",102);
		hm.put("H",101);
		System.out.println(hm);//{P=100, H=101, J=102}
		System.out.println(hm.put("P", 1000));//100
		System.out.println(hm);//{P=1000, H=101, J=102}
		Set s=hm.keySet();
		System.out.println(s);//[P, H, J]
		Collection c=hm.values();
		System.out.println(c);//[1000, 101, 102]
		Set s1=hm.entrySet();
		System.out.println(s1);//[P=1000, H=101, J=102]
		Iterator it =s1.iterator();
		while(it.hasNext()) {
			Map.Entry m1=(Map.Entry)it.next();
			System.out.println(m1.getKey()+" "+ m1.getValue());//P 1000.... so on for others
			if(m1.getKey().equals("P")) {
				m1.setValue(10000);
			}
			System.out.println(m1);//P=10000 so on for others
		}
		/*
		 *  P 1000
			P=10000
			H 101
			H=101
			J 102
			J=102
		 */
		
		userPair() ;

	}

}
