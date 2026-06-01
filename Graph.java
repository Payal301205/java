package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
	static int nodeCount;
	static ArrayList<String>nodes;
	static ArrayList<ArrayList<Integer>> graph;
	public Graph() {
		nodeCount=0;
		nodes=new ArrayList<>();
		graph=new ArrayList<>();
	}
	public static void addEdge_dir_wgt(String v1,String v2,int wgt) {
		if(!nodes.contains(v1))
		{
			System.out.println("node "+v1+"not present");
		}else if(!nodes.contains(v2))
		{
			System.out.println("node "+v2+"not present");
		}else {
			int index1=nodes.indexOf(v1);
			int index2=nodes.indexOf(v2);
			graph.get(index1).set(index2, wgt);
			

		}
	}

	public static void deleteNode(String v) {
		
		if(!nodes.contains(v))
		{
			System.out.println("node "+v+"not present");
		}else {
			int index=nodes.indexOf(v);
			nodes.remove(index);
			graph.remove(index);
			for(ArrayList<Integer> row:graph) {
				row.remove(index);
			}
			nodeCount--;

		}
	}

	public static void printGraph() {
		System.out.println(" printing graph matrix1 ");
		System.out.print("  ");
		for(int i=0;i<nodeCount;i++) {
		System.out.print(nodes.get(i)+" ");
		}
		System.out.println();
		for(int i=0;i<nodeCount;i++) {
			System.out.print(""+nodes.get(i)+" ");
			for(int j=0;j<nodeCount;j++) {
				System.out.print(graph.get(i).get(j)+" ");
			}
			System.out.println();

		
		}
		
	}

	public static void addEdge_undir_wgt(String v1, String v2,int weight) {
		if(!nodes.contains(v1))
		{
			System.out.println("node "+v1+"not present");
		}else if(!nodes.contains(v2))
		{
			System.out.println("node "+v2+"not present");
		}else {
			int index1=nodes.indexOf(v1);
			int index2=nodes.indexOf(v2);
			graph.get(index1).set(index2, weight);
			graph.get(index2).set(index1, weight);


		}
		
	}

	public static void addEdge(String v1,String v2) {
		if(!nodes.contains(v1))
		{
			System.out.println("node "+v1+"not present");
		}else if(!nodes.contains(v2))
		{
			System.out.println("node "+v2+"not present");
		}else {
			int index1=nodes.indexOf(v1);
			int index2=nodes.indexOf(v2);
			graph.get(index1).set(index2, 1);
			graph.get(index2).set(index1, 1);


		}
		
	}

	public static void insertNode(String v) {
		if(nodes.contains(v)) {
			System.out.println("node is already presnt"+v);
		}else {
			nodeCount++;
			nodes.add(v);
			ArrayList<Integer> temp=new ArrayList<>();
			for(ArrayList row: graph) {
				row.add(0);
			}
			for(int i=0;i<nodeCount;i++) {
				temp.add(0);
			}
			graph.add(temp);
			
			System.out.println("node added "+v);

		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Graph g=new Graph();
		while(true) {
		System.out.println("----tasks---");
		System.out.println("1.Insert a node using adjacency matrix representation");
		System.out.println("2.Insert an edge in adjacency matrix representation");
		System.out.println("3.Insert an edge in undirected weighted graph");
		System.out.println("4.Inset an edge i directed weighted graoh");
		System.out.println("5.print graph");
		System.out.println("6.deletion of node");
		System.out.println("0.EXIT");
		System.out.println("enter your choice");
		int c=sc.nextInt();
		String v1,v2;
		int wgt=0;
		switch(c) {
		case 1:System.out.println("enter vertex");
			   String v=sc.next();
			   g.insertNode(v);
			   break;
		case 2:System.out.println("enter vertex 1");
		   		v1=sc.next();
		   		System.out.println("enter vertex 2");
				 v2=sc.next();
				 g.addEdge(v1,v2);
				 break;
		case 3:System.out.println("enter vertex 1");
   				v1=sc.next();
   				System.out.println("enter vertex 2");
   				v2=sc.next();
   				System.out.println("weight:");
	   			wgt=sc.nextInt();
	   		g.addEdge_undir_wgt(v1,v2,wgt);
				break;
		case 4:System.out.println("enter vertex 1");
			v1=sc.next();
			System.out.println("enter vertex 2");
			v2=sc.next();
			System.out.println("weight of vertex :");
   			wgt=sc.nextInt();
			g.addEdge_dir_wgt(v1,v2,wgt);
				break;
		case 5:g.printGraph();
				break;
		case 6: System.out.println("enter vertex 1");
		v1=sc.next();
			g.deleteNode(v1);
				break;
		case 0: System.out.println("exited");
				System.exit(0);
		}

		}

	}

	
}
