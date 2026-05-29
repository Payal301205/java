package project;

import java.util.Scanner;

import project.stack_using_linkedlist.GetNode;

public class reverse_queue_using_stack {
	 int queue[],size,front,rear;
	    reverse_queue_using_stack(int n){
	     size=n;
	     queue=new int[size];
	     front=0;
	     rear=-1;
	     
	     top=-1;
	        CAPACITY=size;
	        stack =new int [CAPACITY];//initialize stack
	    }
	    public void insert(int data){
	       if(isFull()) {
	    	   System.out.println("queue is full");
	       }else {
	    	   rear++;
	    	   queue[rear]=data;
	    	   System.out.println("element added"+ data);
	       }

	    }
	    public int delete(){
	       if(isEmpty()) {
	    	   System.out.println("queue is empty");
	    	   return -1;
	       }
	       int data=queue[front];
//	       for(int i=front;i<rear;i++) {
//	    	   queue[i]=queue[i+1];
//	       }
	       for(int i=1;i<=rear;i++) {
	    	   queue[i-1]=queue[i];
	       }
	       rear--;
	       System.out.println("element deleted"+ data);
	       return data;
	    }
	    public void display(){
	    	if(isEmpty()) {
		    	   System.out.println("queue is empty");
		    	  return;
		       }
	    	else {
	    		System.out.println("the queue is: ");
	    		for(int i=0;i<=rear;i++) {
	    			System.out.print(queue[i]+" ");
	    		}
	    	}
	    }
//	    public int peek(){
//	    	if(isEmpty()) {
//		    	   System.out.println("queue is empty");
//		    	   return -1;
//		       }
//		       int data=queue[front];
//		       return data;
//	    }
	    public int peek(){
	    	if(isEmpty()) {
		    	   System.out.println("queue is empty");
		    	   return -1;
		       }
		       int data=queue[rear];
		       return data;
	    }
	    public boolean isFull(){
	       if(rear==size-1) {
	    	   return true;
	       }
	       return false;
	    }
	    public boolean isEmpty(){
	    	if(rear==-1) {
		    	   return true;
		       }
		       return false;
	    }

	    int top=-1;
	    final int CAPACITY;//blank final variable
	    int stack[];
	   
	    public void push(int data){
	    	if(isfull()) {
	    		System.out.println("stack is full");
	    	}else {
	    		++top;
	    		stack[top]=data;
	    		System.out.println("data added "+data);	    	}

	    }
	    public boolean isfull() {
	    	if(top==CAPACITY-1) {
	    		return true;
	    	}
	    	return false;
	    }
	    public boolean isempty() {
	    	if(top==-1) {
	    		return true;
	    	}
	    	return false;
	    }
	    
//	    public void pop(){
//	    	if(isempty()) {
//	    		System.out.println("stack is empty");
//	    	}else {
//	    		System.out.println(stack[top]+" is popped");
//	    		top=top-1;
//	    	}
//	    }
//	    
	    public int pop(){
	    	int data;
	    	if(isempty()) {
	    		return -1;
	    	}else {
	    		data=stack[top];
	    		top=top-1;
	    	}
	    	return data;
	    }
	    public void peak(){
	    	if(isempty()) {
	    		System.out.println("stack is empty");
	    	}else {
	    		System.out.println(stack[top]+" is peak element");
	    		
	    	}
	    }
	    public void traverse(){
	    	if(isempty()) {
	    		System.out.println("stack is empty");
	    	}else {
	    		System.out.println("stack :");
	    		for(int i=top;i>=0;--i)
	    		{
					System.out.println(stack[i]);
	    		}
	    	}

	    	
	    }
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6};
		reverse_queue_using_stack obj =new reverse_queue_using_stack(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			obj.insert(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			obj.push(obj.delete());
		}


		for(int i=0;i<arr.length;i++) {
			obj.insert(obj.pop());
		}
		System.out.println("reversed queue");
		obj.display();

	}

}
