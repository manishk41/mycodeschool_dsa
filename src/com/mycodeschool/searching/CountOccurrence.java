package com.mycodeschool.searching;

public class CountOccurrence {
	
	private static int binarySearch(int[] A, int n, int x, boolean searchFirst) {
		int low = 0, high = n-1, result = -1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(x == A[mid]) {
				result = mid;
				if(searchFirst)
					high = mid-1;	// Go on searching towards left (lower indices)
				else 
					low = mid + 1;	// Go on searching towards right (higher indices)
			}
			else if(x < A[mid]) high = mid-1;
			else low = mid + 1;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] A = {1,1,2,3,3,4,5,5,5,5,5,5,10,10,10,18,20};
        int n = A.length;
        int x = 5;
        
        int first = binarySearch(A, n, x, true);
        int last = binarySearch(A, n, x, false);
        if(first!=-1 && last!=-1) System.out.println("Count of " + x + " is: " +  (last-first+1));
        else System.out.println(x  + " is NOT Found!");
	}
}