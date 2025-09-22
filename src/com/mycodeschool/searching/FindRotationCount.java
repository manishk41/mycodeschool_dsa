package com.mycodeschool.searching;

public class FindRotationCount {
	
	private static int binarySearch(int[] A, int n) {
		int low = 0, high = n-1;
		while(low <= high) {
			if(A[low] < A[high])							// Case 1
				return low;
			
			int mid = (low+high)/2;
			int next = (mid+1)%n, prev = (mid+n-1)%n;
			if(A[mid] <= A[next] && A[mid] <= A[prev])	// Case 2
				return mid;
			else if(A[mid] <= A[high])					// Case 3
				high = mid - 1;
			else if(A[mid] >= A[low])					// Case 4
				low = mid + 1;
		}
		return -1;
	}
	
	private static int linearSearch(int[] A, int n) {
		int min = A[0];
		int minIndex = 0;
		
		for(int i = 1; i < n-1; i++) {
			if(A[i] < min) {
				min = A[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static void main(String[] args) {
		int[] A = {11, 12, 2, 3, 5, 8};
        int n = A.length;
        int rotationCount = linearSearch(A, n);
        System.out.println(rotationCount);
        
        int rotationCount2 = binarySearch(A, n);
        System.out.println(rotationCount2);
	}

}
