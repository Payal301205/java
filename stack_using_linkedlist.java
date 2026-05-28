package project;

import java.util.Scanner;

import project.LinkedList.GetNode;

public class stack_using_linkedlist {
	class GetNode{
		int data;
		GetNode next;
	}
	GetNode top=null;
	Scanner sc=new Scanner(System.in);
	static int size;
	public void push() {
		GetNode newnode=new GetNode();
		if(isfull()) {
			System.out.println(" stack is full cant be added");
		}else {
			System.out.println(" enter element to be added");
			int data=sc.nextInt();
			newnode.data=data;
			GetNode ptr=top;
			if(isempty()) {
				top=newnode;
			}else {
				newnode.next=ptr;
				top=newnode;
			}
			System.out.println(" element pushed");
		}
		
	}
	
	public void pop() {
		if(isempty()) {
			System.out.println("list is empty");
		}else {
			GetNode ptr=top;
			top=ptr.next;	
		}
		System.out.println("elemnet poped");
		}
	
	public boolean isempty() {
		if(top==null) {
			return true;
		}
		return false;
		}
	
	public boolean isfull() {
		int count=0;
		GetNode ptr=top;
		while(ptr!=null) {
			count++;
			ptr=ptr.next;
		}
		if(count==size) {
			return true;
		}
		return false;
		}
	public void isempty_1() {
		if(top==null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("list is not empty");
		}
	
	public void isfull_1() {
		int count=0;
		GetNode ptr=top;
		while(ptr!=null) {
			count++;
			ptr=ptr.next;
		}
		if(count==size) {
			System.out.println("list is full");
			return;
		}
		System.out.println("list is not full");
		}

	void display() {

        if (isempty()) {
            System.out.println("Stack is empty");
            return;
        }

        GetNode temp = top;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		stack_using_linkedlist obj=new stack_using_linkedlist();
		System.out.println("enter the size of the stack");
		size=sc.nextInt();
		while(true){
			System.out.println("\n ------tasks--------");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.isempty");
			System.out.println("4.isfull");
			System.out.println("5.dispaly");
			
			System.out.println("0.exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1: obj.push();break;
			case 2: obj.pop();break;
			case 3: obj.isempty_1();break;
			case 4: obj.isfull_1();break;
			case 5: obj.display();break;
			
			case 0: System.out.println("exited");System.exit(0);
				}
		}


	}

}
