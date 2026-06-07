package project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class tasks {
	public void getValue(HashMap hm,String key) {
		System.out.println(hm.get(key) +" is the value of key "+key);

	}
	public void removePair(HashMap hm,String key) {
		System.out.println(hm.remove(key) +":value and key removed: "+key);

	}
	public void addPair(HashMap hm,String key,String val) {
		hm.put(key, val);
		System.out.println(val +":value and key : "+key +" added");

	}
	public void keyExists(HashMap hm,String key) {
		if(hm.containsKey(key)) {
			System.out.println("key is present");
		}
		System.out.println("key is not present");


	}
	public void iteratePairs(HashMap hm) {
		Set s1=hm.entrySet();
		Iterator it=s1.iterator();
		System.out.println("Map: ");
		System.out.println("iterate using iterator");

		while(it.hasNext()) {//till element present
			Map.Entry m= (Map.Entry)it.next();
			System.out.println(m.getKey()+" "+m.getValue());

		}
	
	}
	public void iteratePair(HashMap <String,String>hm) {

		System.out.println("iterate using foreach");

	    for (Map.Entry<String, String> entry : hm.entrySet()) {
	        System.out.println(entry.getKey() + " " + entry.getValue());
	    }
	    
		System.out.println("\n another way");

		for(String key:hm.keySet()) {
			System.out.println(key+"-> "+hm.get(key));
		}
	
	}
	public void mergeMaps(HashMap<String, String> hm1,HashMap<String, String> hm2) {
		hm1.putAll(hm2);

		System.out.println("\nmap");
	    for (Map.Entry<String, String> entry : hm1.entrySet()) {
	        System.out.println(entry.getKey() + " " + entry.getValue());
	    }
	
	}
	
	public void countFreq(int [] a) {
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer> ();
		hm.getOrDefault(hm, null);
		for(int i=0;i<a.length;i++) {
				hm.put(a[i], hm.getOrDefault(a[i],0)+1);
			
		}
		
		System.out.println("\nmap");
	    for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
	        System.out.println(entry.getKey() + " " + entry.getValue());
	    }
	
	}
	
	public void Empty(HashMap <String,String>hm) {
		if(hm.isEmpty()) {
			System.out.println("HAshMap is empty");
		}else {
			System.out.println("HAshMap is not empty");

		}
	}
	
	public void findMaxValuedKey(HashMap<String,Integer> m) {
		int max=Integer.MIN_VALUE;
		String maxs="";
		for (Map.Entry<String,Integer> entry :  m.entrySet()) {
	        System.out.println(entry.getKey() + " " + entry.getValue());

			if(max<entry.getValue()) {
				max=entry.getValue();
				maxs=entry.getKey();
			}	
	        
	    }
		System.out.println(maxs+" has the max value of "+ max);
	}
	
	public void reverseMap(HashMap<String,Integer> m) {
		Stack <String> st=new Stack<>();
		for (Map.Entry<String,Integer> entry :  m.entrySet()) {
			st.push(entry.getKey());
	        
	    }
		System.out.println("reversed map");

		HashMap < Integer,String> hm=new HashMap<>();
		for(int i=0;i<m.size();i++) {
			String s=st.pop();
			hm.put(m.get(s),s );
	        
	    }
		for (Map.Entry<Integer,String> entry : hm.entrySet()) {
	        System.out.println(entry.getKey() + " " + entry.getValue());
	    }
	
		
	}
	
	public static void main(String[] args) {
		HashMap <String, String> hm=new HashMap<>();
		hm.put("Name","Alice")	;
		hm.put("Age","30");
		Scanner sc=new Scanner(System.in);
		tasks t=new tasks();
		System.out.println("enter key");
		String key=sc.next();
		t.getValue(hm,key);
		t.removePair(hm, key);
		System.out.println("enter key");
		String k=sc.next();

		System.out.println("enter value");
		String v=sc.next();


		t.addPair(hm, k , v);
		
		t.iteratePairs(hm);
		System.out.println();
		t.iteratePair(hm);
		
		HashMap <String, String> hm1=new HashMap<>();
		hm1.put("Name","Alice");
		
		HashMap <String, String> hm2=new HashMap<>();
		hm2.put("Age","30");
		
		t.mergeMaps(hm1, hm2);
		
		int a[]= {1,2,3,4,1};
		t.countFreq(a);

		t.Empty(hm1);
		
		HashMap <String, Integer> h=new HashMap<>();
		h.put("P",3);
		h.put("y",5);
		t.findMaxValuedKey(h);
		
		t.reverseMap(h);
		
	}

}
