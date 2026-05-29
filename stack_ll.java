package project;
import java.util.Scanner;

public class stack_ll {//using array
	
	    int top=-1;
	    final int CAPACITY;//blank final variable
	    int stack[];
	    stack_ll(int size){
	        top=-1;
	        CAPACITY=size;
	        stack =new int [CAPACITY];//initialize stack
	    }
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
	    public void peek(){
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
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter size of stack: ");
	        int n=sc.nextInt();
	        stack_ll st=new stack_ll(n);
	        while(true){
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. traverse");
	            System.out.println("0. Exit");
	            System.out.println("Select any choice: ");
	            int ch=sc.nextInt();
	            switch(ch){
	            case 1: System.out.println("enter data");
	            		int data=sc.nextInt();
	                    st.push(data);
	                    break;
	            case 2: data=st.pop();
	            		if(data==-1) {
		            		System.out.println("stack is empty");
		            	}else {
				            System.out.println("element popped: "+data);
		            	}
			            break;
	            case 3: st.peek(); break;
	            case 4: st.traverse();break;
	            case 0: System.out.println("exited");
	            		System.exit(0);
	            }
	        }
	    }
	

}
