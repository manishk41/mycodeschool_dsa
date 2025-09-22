package com.mycodeschool.dsa;

public class PrintSpiral {
	
	public static void printSpiral(int[][] A, int m, int n) {
		int T = 0, B = m-1, L = 0, R = n-1;
		int dir = 0;
		while(T <= B && L <= R) {
			if(dir == 0) {
				for(int i = L; i <= R; i++)
					System.out.print(A[T][i] + " ");
				T++;
			} else if(dir == 1) {
				for(int i = T; i <= B; i++)
					System.out.print(A[i][R] + " ");
				R--;
			} else if(dir == 2) {
				for(int i = R; i >= L; i--)
					System.out.print(A[B][i] + " ");
				B--;
			} else if(dir == 3) {
				for(int i = B; i >= T; i--)
					System.out.print(A[i][L] + " ");
				L++;
			}
			dir = (dir+1)%4;
		}
	}

	public static void main(String[] args) {
		int[][] A = {
				{2,4,6,8},
				{5,9,12,16}, 
				{2,11,5,9},
				{3,2,1,8}
				};
		printSpiral(A, A.length, A[0].length);
	}

}
