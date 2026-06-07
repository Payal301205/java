package project;


import java.util.ArrayList;
import java.util.Scanner;

public class max_marks_in_sem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of semester");
		int n=sc.nextInt();
		ArrayList<ArrayList<Integer>> h=new ArrayList<>();
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> temp=new ArrayList<>();

		for(int i=0;i<n;i++) {
			System.out.println("Enter no. of subjects in"+(i+1)+" semester");
			int s=sc.nextInt();
			temp.add(s);
			
		}
		for(int i=0;i<temp.size();i++) {
			System.out.println("Marks obtained in semester"+(i+1));
			a=new ArrayList<>();
			for(int j=0;j<temp.get(i);j++) {
				int m= sc.nextInt();
				a.add(m);
			}
			h.add(a);
		}
		ArrayList<Integer> ans=new ArrayList<>();
		for(ArrayList<Integer>t:h) {
			int max=t.get(0);
			for(int i=0;i<t.size();i++)
			if(max<t.get(i)) {
				max=t.get(i);
			}
			ans.add(max);
		}
		for(int i=0;i<n;i++) {
			System.out.println("Maximum marks in "+(i+1)+" semester "+" "+ans.get(i));
		}
	}
	

}
