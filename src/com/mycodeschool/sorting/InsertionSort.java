package com.mycodeschool.sorting;

public class InsertionSort {
	
	public static void insertionSort(int[] A, int n) {
		for(int i = 1; i <= n-1; i++) {
			int value = A[i];
			int hole = i;
			while(hole > 0 && A[hole-1] > value) {
				A[hole] = A[hole-1];
				hole = hole - 1;
			}
			A[hole] = value;
		}
	}

	public static void main(String[] args) {
		int[] A = {2,7,4,1,5,3};
		insertionSort(A, A.length);
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}

}