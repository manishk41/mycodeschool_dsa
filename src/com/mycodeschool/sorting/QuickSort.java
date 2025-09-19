package com.mycodeschool.sorting;

public class QuickSort {
	
	public static void quickSort(int[] A, int start, int end) {
		if(start < end) {
			int pIndex = partition(A, start, end);
			quickSort(A, start, pIndex-1);
			quickSort(A, pIndex+1, end);
		}
	}
	
	public static int partition(int[] A, int start, int end) {
		int pivot = A[end];
		int pIndex = start;	// set partition index as start initially
		for(int i = start; i <= end-1; i++) {
			if(A[i] <= pivot) {
				swap(A, i, pIndex);	// swap if element is lesser than pivot
				pIndex = pIndex+1;
			}
		}
		swap(A, pIndex, end);	// swap pivot with element at partition index
		
		return pIndex;
	}
	
	public static int randomizedPartition(int[] A, int start, int end) {
		int pivotIndex = (start + end)/2;
		swap(A, pivotIndex, end);
		partition(A, start, end);
		return pivotIndex;
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	public static void main(String[] args) {
		int[] A = {2,4,1,6,8,5,3,7};
		quickSort(A, 0, A.length-1);
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

	}

}
