package com.mycodeschool.sorting;

public class BubbleSort {
	
	public static void bubbleSort(int[] A, int n) {
		for(int k = 1; k <= n-1; k++) {
			boolean flag = false;
			for(int i = 0; i <= n-k-1; i++) {
				if(A[i] > A[i+1]) {
					swap(A, i, i+1);
					flag = true;
				}
			}
			if(!flag)
				break;
		}
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	public static void main(String[] args) {
		int[] A = {2,7,4,1,5,3};
		bubbleSort(A, A.length);
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}

}