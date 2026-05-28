package project;

import project.LinkedList.GetNode;
import java.util.*;
public class min_max_in_linkedlist {
	class GetNode {
		int data;
		GetNode next;
		
	}
	GetNode head=null;
	Scanner sc=new Scanner(System.in);
	public void min() {
		GetNode ptr=head;
		int min=ptr.data;
		while(ptr!=null) {
			if(min>ptr.data) {
				min=ptr.data;
			}
			ptr=ptr.next;
		}
		System.out.println(min+"is minimum");
	}
	public void max() {
		GetNode ptr=head;
		int max=ptr.data;
		while(ptr!=null) {
			if(max<ptr.data) {
				max=ptr.data;
			}
			ptr=ptr.next;
		}
		System.out.println(max+"is maximum");
	}
	public void append() {
		GetNode newnode=new GetNode();
		System.out.println(" enter element to be added");
		int data=sc.nextInt();
		newnode.data=data;
		GetNode ptr=head;
		if(head==null) {
			head=newnode;
		}else {
			 while(ptr.next!=null) {
			        ptr=ptr.next;
			    }
			    ptr.next=newnode;
			
		}
		System.out.println("element "+data+" added");
	}
	
	public void traverse() {
		if(head==null) {
			System.out.println("the list is empty");
		}else {
			GetNode ptr=head;
			System.out.println(" list is as follows \n");
			while(ptr!=null){
				System.out.print("->");
				System.out.print(ptr.data);
				ptr=ptr.next;
			}	
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		min_max_in_linkedlist obj=new min_max_in_linkedlist();
		while(true) {
			System.out.println("\n ------tasks--------");
			System.out.println("1.Append");
			System.out.println("2.traverse");
			System.out.println("3.find min");
			System.out.println("4.find max");
			
			System.out.println("0.exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1: obj.append();break;
			case 2: obj.traverse();break;
			case 3: obj.min();break;
			case 4: obj.max();break;
			
			case 0: System.out.println("exited");System.exit(0);
				}
		}
	}

}
