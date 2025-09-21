package com.mycodeschool.searching;

public class LinearSearch {
	
	private static int linearSearch(int[] A, int n, int x) {
		for(int i = 0; i < n; i++) {
			if(A[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] A = {10,15,12,9,6,4,3,10,8};
		int n = A.length;
		int x = 9;
		
		int index = linearSearch(A, n, x);
		if(index != -1)
			System.out.println(x +  " is pressent in at index " + index);
		else
			System.out.println(x + " is not found.");
	}

}
