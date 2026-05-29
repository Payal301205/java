int top=-1;
	    final int CAPACITY;//blank final variable
	    int stack[];
	    reverse_array_using_stack(int size){
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

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int arr[]= {10,20,30,40,50};
	        reverse_array_using_stack st=new reverse_array_using_stack(arr.length);
	        for(int i=0;i<arr.length;i++) {
	        	st.push(arr[i]);
	        }
	        for(int i=0;i<arr.length;i++) {
	        	arr[i]=st.pop();
	        }
	        System.out.println("reversed array "+Arrays.toString(arr));
	    }
	