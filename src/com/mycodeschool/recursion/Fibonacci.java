package com.mycodeschool.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	private static Map<Integer, Integer> memo = new HashMap<> ();
	
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
	
	private static int fibRecDP(int n) {
		if(memo.containsKey(n))
			return memo.get(n);
		
		if(n <= 1) {
			memo.put(n, n);
			return n;
		}
		
		int value = fibRecDP(n-1) + fibRecDP(n-2);
		memo.put(n, value);
		return value;
	}

	public static void main(String[] args) {
		int n = 6;
		System.out.println(fib(n));
		System.out.println(fibRecDP(n));
		System.out.println(fibRec(n));
	}

}
