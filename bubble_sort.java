package project;

import java.util.Arrays;

public class bubble_sort {

	public static void bub_sort_i(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	public static void bub_sort_desc(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
public static void main(String[]args) {
	int []arr= {11,3,4,8,5};
	bub_sort_i(arr);
	System.out.println(Arrays.toString(arr));
	int []arr1= {11,3,4,8,5};
	bub_sort_desc(arr1);
	System.out.println(Arrays.toString(arr1));
	
	System.out.println(Arrays.toString(arr1));
}
}
