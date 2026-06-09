package project;

import java.util.HashMap;
import java.util.HashSet;

public class Missing_num_and_intersection {
	public static void missingNum(int arr[]) {
		int sum=arr.length*(arr.length+1)/2;
		int s=0;
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		System.out.println("the missing number is"+ (sum-s));
	}
	public static void intersection(int a[],int b[] ){
		HashMap<Integer,Integer>h1=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(!h1.containsKey(a[i])) {
				h1.put(a[i],1);
			}else {
				h1.put(a[i],h1.get(a[i])+1);
			}
		}
		
		HashMap<Integer,Integer>h2=new HashMap<>();
		for(int i=0;i<b.length;i++) {
			if(!h2.containsKey(b[i])) {
				h2.put(b[i],1);
			}else {
				h2.put(b[i],h2.get(b[i])+1);
			}
		}
		
		for(int key:h1.keySet()) {
			if(h2.containsKey(key)) {
				System.out.print(key+" ");
			}
		}
	}
	
	public static void intersection1(int a[],int b[] ){
		HashSet<Integer>h1=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(!h1.contains(a[i])) {
				h1.add(a[i]);
			}
		}
		
		HashSet<Integer>h2=new HashSet<>();
		for(int i=0;i<b.length;i++) {
			if(!h2.contains(b[i])) {
				h2.add(b[i]);
			}
		}
		
		for(int s1: h1) {
			for(int s2:h2) {
				if(s1==s2) {
					System.out.print(s1+" ");
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int []arr= {0,1,3};
		missingNum(arr);
		int []a= {1,2,2,1};
		int []b= {2,2};
		intersection(a,b);
		System.out.println();
		intersection1(a,b);

		}

}
