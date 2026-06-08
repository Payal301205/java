package project;

public class sum_of_adj_distances {
	public static void sum_of_adj_distance(int n,int arr[] ){
	int sum=0;
	for(int i=1;i<n;i++) {
		sum+= Math.abs(arr[i-1]-arr[i]);
	}
	System.out.println(sum);
	}
	public static void main(String[] args) {
		int []arr= {10,11,7,12,14};
		sum_of_adj_distance(arr.length,arr);
	}

}
