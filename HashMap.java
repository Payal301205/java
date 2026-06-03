package project;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		System.out.println("Hash Map: not entry order accg to hashcode formed");
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100, "B");
		hm.put(102, "P");
		hm.put(101, "H");
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("\nLinked Hash Map: stores value in order");
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(100, "B");
		lhm.put(102, "P");
		lhm.put(101, "H");
		for(Entry m: lhm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}


	}

}
