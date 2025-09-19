package com.mycodeschool.sorting;

public class MergeSort {

	public static void mergeSort(int[] A) {
		int n = A.length;
		if(n < 2)
			return;
		
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		
		for(int i = 0; i <= mid-1; i++)
			left[i] = A[i];
		
		for(int i = mid; i <= n-1; i++)
			right[i-mid] = A[i];
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, A);
	}
	
	public static void merge(int[] left, int[] right, int[] A) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		
		while(i < nL && j < nR) {
			if(left[i] <= right[j]) {
				A[k] = left[i];
				i++;
			} else {
				A[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < nL) {
			A[k] = left[i];
			i++;
			k++;
		}
		while(j < nR) {
			A[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		int[] A = {2,4,1,6,8,5,3,7};
		mergeSort(A);
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}

}