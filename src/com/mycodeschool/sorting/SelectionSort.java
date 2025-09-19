package com.mycodeschool.sorting;

public class SelectionSort {

	public static void selectionSort(int[] A, int n) {
		for(int i = 0; i < n-2; i++) {	// we need to do n-2 passes
			int iMin = i;
			for(int j = i+1; j <= n-1; j++) {
				if(A[j] < A[iMin])
					iMin = j;	// update the index of minimum element
			}
			swap(A, i, iMin);
		}
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] A = {2,7,4,1,5,3};
		selectionSort(A, A.length);
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

	}

}