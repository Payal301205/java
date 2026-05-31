package project;
import java.util.Scanner;
public class BinaryTree {
	class GetNode{
		GetNode leftChild;
		int data;
		GetNode rightChild;
		public GetNode(int key) {
			leftChild=null;
			data=key;
			rightChild=null;
		}
	}
	GetNode root;
	public BinaryTree() {
		root=null;
	}
	public GetNode insert(GetNode root,int key) {

		if(root==null) {
			root=new GetNode(key);
			return root;
		}else if (root.data>key) {
			root.leftChild=insert(root.leftChild,key);
			
		}
		else if(root.data<key) {
			root.rightChild=insert(root.rightChild,key);
		}
		return root;
		
	}
	public void inorder(GetNode root) {
		if(root!=null) {
			inorder(root.leftChild);
			System.out.println(root.data);
			inorder(root.rightChild);
		}
		
	}
	public void preorder(GetNode root) {
		if(root!=null) {
			System.out.println(root.data);
			preorder(root.leftChild);
			preorder(root.rightChild);
		}
	}
	
	public void postorder(GetNode root) {
	    if(root!=null) {
	        postorder(root.leftChild);
	        postorder(root.rightChild);
	        System.out.println(root.data);
	    }
	}
	public boolean search(GetNode root, int key) {
	    if (root == null) {
	        return false;
	    }

	    if (root.data == key) {
	        return true;
	    } 
	    else if (key < root.data) {
	        return search(root.leftChild, key);
	    } 
	    else {
	        return search(root.rightChild, key);
	    }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinaryTree tree=new BinaryTree();
		while(true) {
			System.out.println("tasks\n1.Insert\n2.Traverse by Inorder\n3.preorder\n4.postorder\n5.search\n0.exit");
			System.out.println("\n Enter choice");
			int ch=sc.nextInt();
		
			
			switch(ch) {
			case 1:

					int arr[]= {36,26,46,21,31,11,24,41,56,51,66};
					for(int i=0;i<arr.length;++i) {
						 tree.root=tree.insert(tree.root, arr[i]);
					}
					System.out.println("value added.");
					break;
			case 2: System.out.println("Inorder traversal");
					tree.inorder(tree.root);
					break;
			case 3: System.out.println("Preorder traversal");
					tree.preorder(tree.root);
					break;
			case 4: System.out.println("Postorder traversal");
					tree.postorder(tree.root);
					break;
			case 5: System.out.println("element :");
					int key=sc.nextInt();
					if(tree.search(tree.root,key)) {
					System.out.println("element found");
					}else {
					System.out.println("element not found");
					}
					break;
			case 0: System.out.println("Exited");
					System.exit(0);
						
					}


					}
					
					
				}

			}
