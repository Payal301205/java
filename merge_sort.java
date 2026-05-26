package project;

import java.util.Arrays;

public class merge_sort {
	   
	public static void main(String[] args) {
		int []arr1= {1,3,4,8,};
		int []arr2= {1,7,9};
		int []arr3=new int[arr1.length + arr2.length];
		merge_srt(arr1,arr2,arr3);
		System.out.println(Arrays.toString(arr3));

	}
	
	private static void merge_srt(int[] arr1, int[] arr2, int[] arr3) {
		int i=0,j=0,k=0;
		int l=arr1.length<arr2.length?arr1.length:arr2.length;
		while(i<l && j<l) {
			if(arr1[i]<=arr2[j]) {
				arr3[k]=arr1[i];
				i++;k++;
			}else if(arr1[i]>arr2[j]) {
				arr3[k]=arr2[j];
				j++;k++;
			}
		}
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			k++;i++;
		}
		while(j<arr2.length) {
			arr3[k]=arr2[j];
			k++;j++;
		}
		
	}
	

}
