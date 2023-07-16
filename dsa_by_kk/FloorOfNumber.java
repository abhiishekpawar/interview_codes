package dsa_by_kk;

/*
 * arr = [2,3,4,7,13,15];
 * target = 8;
 * ouput should be 7 
 */

public class FloorOfNumber {
	
	static int floorOfNum(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(target == arr[mid])
				return arr[mid];
			else if (target > arr[mid])
				start = mid + 1;
			else
				end = mid -1;
		}
		return arr[end];
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,4,7,13,15};
		int tartget =8;
		
		System.out.println(floorOfNum(arr, tartget));
	}

}
