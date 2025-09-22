package com.mycodeschool.searching;

public class CircularArraySearch {
	
	private static int circularArraySearch(int[] A, int n, int x) {
		int low = 0, high = n-1;
		while(low <= high) {
			int mid = (low + high) /2;
			if(x == A[mid])
				return mid;
			if(A[mid] <= A[high]) {
				if(x > A[mid] && x <= A[high])	
					low = mid + 1;
				else
					high = mid - 1;
			} else {
				if(A[low] <= x && x < A[mid]) 
					high = mid-1;
				else
					low = mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] A = {12, 14, 18, 21, 3, 6, 8, 9};
        int n = A.length;
        int x = 8;
        int index = circularArraySearch(A, n, x);
        System.out.println(index);
	}

}
