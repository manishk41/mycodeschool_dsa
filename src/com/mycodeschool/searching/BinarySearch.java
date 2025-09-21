package com.mycodeschool.searching;

public class BinarySearch {
	
	private static int binarySearch(int[] A, int n, int x) {
		int low = 0, high = n-1;
		
		while(low <= high) {
			int mid = low + (high-low)/2;			// (low+high)/2;		// (low+high) may overflow
			if(x == A[mid]) return mid;				// Found x, return (exit)
			else if(x < A[mid]) high = mid - 1;		// x lies before mid
			else low = mid + 1;						// x lies after mid
		}
		return -1;
	}
	
	private static int binarySearch(int[] A, int low, int high, int x) {
		if(low > high) return -1;
		int mid = low + (high-low)/2;									// (low+high)/2;		// (low+high) may overflow
		if(x == A[mid]) return mid;										// Found x, return (exit)
		else if(x < A[mid]) return binarySearch(A, low, mid-1, x);		// x lies before mid
		else return binarySearch(A, mid+1, high, x);					// x lies after mid
	}

	public static void main(String[] args) {
		int[] A = {2,6,13,21,36,47,63,81,97};
        int n = A.length;
        int x = 47;

        int index = binarySearch(A, n, x);
        if(index!=-1) System.out.println(x  + " is present at index " +  index);
        else System.out.println(x  + " is NOT Found!");
        
        int indexRec = binarySearch(A, 0, n-1, x);
        if(indexRec!=-1) System.out.println(x  + " is present at index " +  indexRec);
        else System.out.println(x  + " is NOT Found!");
	}

}
