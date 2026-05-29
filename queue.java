package project;

import java.util.Scanner;

public class queue {
	    int queue[],size,front,rear;
	    public queue(int n){
	     size=n;
	     queue=new int[size];
	     front=0;
	     rear=-1;
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
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size of Queue: ");
	        int n=sc.nextInt();
	        int data; boolean b;
	        queue obj=new queue(n);
	        while(true){
	            System.out.println("\n1. Insert");
	            System.out.println("2. Delele");
	            System.out.println("3. Display");
	            System.out.println("4. Peek");
	            System.out.println("0. Exit");
	            int ch=sc.nextInt();
	            switch(ch){
	            case 1: System.out.println("Enter data: ");
	                    data=sc.nextInt();
	                    obj.insert(data);
	                    break;
	            case 2: data=obj.delete();
	                    System.out.println(data+" is Deleled");
	                    break;
	            case 3: obj.display();
	                    break;
	            case 4: data=obj.peek(); 
	            		System.out.println("the peek element is "+data);
	                    break;
	            case 0: System.out.println("Exited");
	            		System.exit(0);
	            }
	        }

	    }
	

}
