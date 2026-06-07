package project;

import java.util.HashMap;
import java.util.Scanner;

public class comp_questions {
	public void countChar(String s) {
		HashMap <Character,Integer> h=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(!h.containsKey(s.charAt(i))) {
				h.put(s.charAt(i),1);
			}else {
				h.put(s.charAt(i), h.get(s.charAt(i))+1);
			}

		}
		System.out.println(h);
	}
	
	public void firstNonRepeatChar(String s) {
		HashMap <Character,Integer> h=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(!h.containsKey(s.charAt(i))) {
				h.put(s.charAt(i),1);
			}else {
				h.put(s.charAt(i), h.get(s.charAt(i))+1);
			}
		}
		for(int i=0;i<s.length();i++) {
			if(h.get(s.charAt(i))==1) {
				System.out.println(s.charAt(i)+"this is that first char whcih is not repaeted afterwards");
				break;
			}
		}
	}
	
	public void deleteDuplicates(String s) {
		HashMap <Character,Integer> h=new HashMap<>();
		for(int i=0;i<s.length();i++) {
	        if(!h.containsKey(s.charAt(i))) {
	            System.out.print(s.charAt(i));
	            h.put(s.charAt(i),1);
	        }
	    }	}
	public void detectDuplicates(int []arr) {
		HashMap <Integer,Integer> h=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!h.containsKey(arr[i])) {
				h.put(arr[i],1);
			}else {
				h.put(arr[i], h.get(arr[i])+1);
			}
		}
		int count=0;
		for(int i:h.keySet()) {
			if(h.get(i )>1) {
				count++;
			}
		}
		System.out.println("duplicates in the array: "+count);//count==0 duplicates not found
	}
	
	public void deleteDuplicate(int []arr) {
		HashMap <Integer,Integer> h=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!h.containsKey(arr[i])) {
				h.put(arr[i],1);
			}else {
				h.put(arr[i], h.get(arr[i])+1);
			}
		}
		
		int[] ar1 = new int[h.size()];

		int idx = 0;

		for(Integer key : h.keySet()) {
		    ar1[idx++] = key;
		}
		
		System.out.println("Array wihtout duplicates");

		for(int i=0;i<h.size();i++) {
			System.out.print(ar1[i]+" ");
		}
//		System.out.println(ar1);

	}
	
	public void countUnique(int []arr) {
		HashMap <Integer,Integer> h=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!h.containsKey(arr[i])) {
				h.put(arr[i],1);
			}else {
				h.put(arr[i], h.get(arr[i])+1);
			}
		}
		System.out.println("number of unique elements are:"+h.size());
	}
	
	public void twoSum(int []arr,int target) {
		HashMap<Integer,Integer> map = new HashMap<>();

	    for(int i=0;i<arr.length;i++) {

	        int complement = target - arr[i];

	        if(map.containsKey(complement)) {

	            System.out.println("Target Found");

	            System.out.println(
	                "Indices: " +
	                map.get(complement) +
	                " " + i
	            );

	            return;
	        }

	        map.put(arr[i], i);
	    }

	    System.out.println("Target Not Found");
	
	}
	public void getMajorFreqElement(int []arr) {
		HashMap <Integer,Integer> h=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!h.containsKey(arr[i])) {
				h.put(arr[i],1);
			}else {
				h.put(arr[i], h.get(arr[i])+1);
			}
		}

		int max=Integer.MIN_VALUE;
		for(int val:h.values()) {
			if(val>max) {
				max=val;
			}
		}
		for(int key:h.keySet()) {
			if(h.get(key)==max) {
				System.out.println("Majority element is: "+key+"with value"+h.get(key));
				
			}
		}
		
	}
	
	public void getMajorityElement(int []arr) {//normal majority element refer to an element which occurred more than half the size of array
		HashMap <Integer,Integer> h=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!h.containsKey(arr[i])) {
				h.put(arr[i],1);
			}else {
				h.put(arr[i], h.get(arr[i])+1);
			}
		}

		int max=Integer.MIN_VALUE;
		for(int val:h.values()) {
			if(val>max) {
				max=val;
			}
		}
		if(max<=arr.length/2) {
			System.out.println("Majority element not present");
			return;
		}
		for(int key:h.keySet()) {
			if(h.get(key)==max) {
				System.out.println("Majority element is: "+key+"with value"+h.get(key));
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("neter the string whose character frequnecy to be calculated");
		String s=sc.next();
		comp_questions c =new comp_questions();
		c.countChar(s);
		c.firstNonRepeatChar(s);
		int []arr= {1,2,2,3,5,4,3};
		c.detectDuplicates(arr);
		c.deleteDuplicate(arr);
		c.countUnique(arr);
		c.twoSum(arr, 8);
		c.getMajorFreqElement(arr);
		c.getMajorityElement(arr);
	}

}
