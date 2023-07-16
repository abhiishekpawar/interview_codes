package dsa_by_kk;

/* 
 Order-Agnostic binary search
 */

public class BinrySearch {

	static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[0] < arr[arr.length - 1];
		if (isAsc) {
			while (start <= end) {
				int mid = (start + end) / 2;

				if (arr[mid] == target)
					return mid;
				else if (target > arr[mid])
					start = mid + 1;
				else
					end = mid - 1;
			}
		} 
		else {
			while (start <= end) {
				int mid = (start + end) / 2;

				if (arr[mid] == target)
					return mid;
				else if (target > arr[mid])
					end = mid - 1;
				else
					start = mid+1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 5,4,3,2,1};
		int target = 2;
		System.out.println(binarySearch(arr, target));

	}

}
