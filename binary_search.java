package project;

public class binary_search {

	public static void main(String[] args) {
		int []arr= {11,22,33,44,55,66};
		int target=11;
		int low=0;
		int high=arr.length-1;
		int loc=-1;
		boolean flag=false;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				loc=mid;
				flag=true;
				break;
			}else if(target<arr[mid]) {
				high=mid-1;
			}else if(target>arr[mid]) {
				low=mid+1;
			}
		}
		if(flag==true) {
			System.out.println("elemnet "+target+" found at "+loc+" index");
		}else {
			System.out.println("element not found");
		}
		

	}

}
