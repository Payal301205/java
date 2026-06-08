package project;

import java.util.HashMap;
import java.util.Scanner;

public class security_key {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter integer");
		int n=sc.nextInt();
		
		HashMap <Integer,Integer> h=new HashMap<>();
		int temp=n;
		while(temp!=0) {
			int d=temp%10;
			if(!h.containsKey(d)) {
				h.put(d, 1);
			}else {
				h.put(d, h.get(d)+1);

			}
			temp=temp/10;
		}
		int count=0;
		for(int key: h.keySet()) {
			if(h.get(key)>1) {
				count++;
			}
		}
		System.out.println("security key "+count);
	}

}
