package project;
import java.util.*;
public class LinkedList {
	class GetNode{
		int data;
		GetNode next;
//		public void traverse() {
//			// TODO Auto-generated method stub
//		} for getnode obj
		GetNode() {
		    next=null;
		}
		
	}
	Scanner sc=new Scanner(System.in);
	GetNode head=null;
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
	
	public void addatstart() {
		GetNode newnode=new GetNode();
		System.out.println(" enter element to be added");
		int data=sc.nextInt();
		newnode.data=data;
		GetNode ptr=head;
		if(head==null) {
			head=newnode;
		}else {
			newnode.next=ptr;
			head=newnode;
		}
		System.out.println(" element added at start");
	}
	public void addatafter() {
		GetNode newnode=new GetNode();
		System.out.println(" enter element to be added");
		int data=sc.nextInt();
		newnode.data=data;
		System.out.println(" enter key after which we have to insert");
		int key=sc.nextInt();
		
		if(head==null) {
			head=newnode;
		}else {
			GetNode ptr=head;
			while(ptr!=null) {
			    if(ptr.data==key) {
			        break;
			    }
			    ptr=ptr.next;
			}
			if(ptr==null) {
				System.out.println("key not found");
			}else {
				newnode.next=ptr.next;
				ptr.next=newnode;
			}
		}
		System.out.println(data+" element added at "+key);

	}
	public void deleteatafter() {
	
		System.out.println(" enter element after which we have to delete");
		int key=sc.nextInt();
		GetNode ptr=head;
		if(head==null) {
			System.out.println("list is empty");
		}else {
			while(ptr!=null && ptr.data!=key) {
			    ptr=ptr.next;
			}
			if(ptr==null || ptr.next==null) {
			    System.out.println("Deletion not possible");
			}
			else {
			    ptr.next=ptr.next.next;
			}
		}
		
		
	}
	
public void deleteatbegin() {
	if(head==null) {
		System.out.println("list is empty");
	}else {
		GetNode ptr=head;
		head=ptr.next;	
	}
	}

	public void deleteatend() {
		if(head==null) {
			System.out.println("list is empty");
		}
		else if(head.next==null) {
	        head=null;
	    }

	    else {
	        GetNode ptr=head;

	        while(ptr.next.next!=null) {
	            ptr=ptr.next;
	        }

	        ptr.next=null;
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList obj=new LinkedList();
		while(true) {
			System.out.println("\n ------tasks--------");
			System.out.println("1.Append");
			System.out.println("2.traverse");
			System.out.println("3.add st start");
			System.out.println("4.add at after");
			System.out.println("5.delete at start");
			System.out.println("6.delete at end");
			System.out.println("7.delete at after");
			System.out.println("0.exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1: obj.append();break;
			case 2: obj.traverse();break;
			case 3: obj.addatstart();break;
			case 4: obj.addatafter();break;
			case 5: obj.deleteatbegin();break;
			case 6: obj.deleteatend();break;
			case 7: obj.deleteatafter();break;
			case 0: System.out.println("exited");System.exit(0);
		
		}

	}

}
}
