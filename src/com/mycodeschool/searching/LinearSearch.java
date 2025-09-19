package com.mycodeschool.searching;

import java.util.Scanner;

public class LinearSearch {
	
	private static int linearSearch(int[] arr, int n, int key) {
		for(int i = 0; i < n; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {10,15,12,9,6,4,3,10,8};
		int n = arr.length;
		
		Scanner scn = new Scanner(System.in);
		int key = scn.nextInt();
		
		int index = linearSearch(arr, n, key);
		if(index != -1)
			System.out.println(key +  " is pressent in at index " + index);
		else
			System.out.println(key + " is not found.");
	}

}
