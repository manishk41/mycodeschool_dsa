package com.mycodeschool.searching;

import java.util.Scanner;

public class BinarySearch {
	
	private static int binary_search(int arr[],int n,int x) {
		int start = 0;
		int end = n - 1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {2,6,13,21,36,47,63,81,97};
        int n = arr.length;
        int x = 47;

        int index = binary_search(arr,n,x);
        if(index!=-1)
            System.out.println(x  + " is present at index " +  index);
        else
            System.out.println(x  + " is NOT Found!");
	}

}
