package com.mycodeschool.recursion;

public class Fibonacci {
	
	private static int fib(int n) {
		if(n <= 1)
			return n;
		
		int f1, f2, f = 0;
		f1 = 0;
		f2 = 1;
		for(int i = 2; i <= n; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
		}
		return f;
	}
	
	private static int fibRec(int n) {
		if(n <= 1)
			return n;
		
		return fibRec(n-1) + fibRec(n-2);
	}

	public static void main(String[] args) {
		int n = 6;
		System.out.println(fib(n));
		System.out.println(fibRec(n));
	}

}
