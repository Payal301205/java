package project;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_string_using_array {
	int top=-1;
    final int CAPACITY;//blank final variable
    char stack[];
    reverse_string_using_array(int size){
        top=-1;
        CAPACITY=size;
        stack =new char [CAPACITY];//initialize stack
    }
    public void push(char data){
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
    
//    public void pop(){
//    	if(isempty()) {
//    		System.out.println("stack is empty");
//    	}else {
//    		System.out.println(stack[top]+" is popped");
//    		top=top-1;
//    	}
//    }
//    
    public char pop(){
    	char data;
//    	if(isempty()) {
//    		return ;
//    	}else {
    		data=stack[top];
    		top=top-1;
    	
    	return data;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="Sir";
//        char arr[]=s.toCharArray();
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++) {
        	arr[i]=s.charAt(i);
        }
        reverse_string_using_array st=new reverse_string_using_array(arr.length);
        for(int i=0;i<arr.length;i++) {
        	st.push(arr[i]);
        }
        System.out.println("reversed string ");
        for(int i=0;i<arr.length;i++) {
        	arr[i]=st.pop();
        	System.out.print(arr[i]);
        }
        
    }


}
