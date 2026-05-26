package project;

import java.util.Arrays;

public class selection_sort {
	public static void sel_sort(int []arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int min=arr[i];
			int loc=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					loc=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[loc];
			arr[loc]=temp;
		}
	}
	public static void sel_sort_max(int []arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int max=arr[i];
			int loc=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]>max) {
					max=arr[j];
					loc=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[loc];
			arr[loc]=temp;
		}
	}
	public static void main(String[] args) {
		int []arr= {11,3,4,8,5};
		sel_sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int []arr1= {11,3,4,8,5};
		sel_sort_max(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
