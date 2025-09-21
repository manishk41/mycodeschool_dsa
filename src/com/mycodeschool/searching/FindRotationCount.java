package com.mycodeschool.searching;

public class FindRotationCount {
	
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
	}

}
