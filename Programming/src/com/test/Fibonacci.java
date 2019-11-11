package com.test;

/*
 * 피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다. 정수 N이 주어지면, N보다 작은 모든
 * 짝수 피보나치 수의 합을 구하여라. 
 * Fibonacci sequence starts with 0 and 1 where each
 * fibonacci number is a sum of two previous fibonacci numbers. Given an integer
 * N, find the sum of all even fibonacci numbers.
 * 
 * 예제) Input: N = 12 
 * Output: 10 // 0, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.
 */
public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(getRecursiveFibonacci(6));
		System.out.println(getFibonacci(6));
		System.out.println(solution(12));
	}
	
	public static int solution(int n) {
		int result=0;
		
		for(int i=0; i<n; i++) {
			int fibo = getFibonacci(i);
			if(fibo >= n) {
				break;
			}
			
			if(fibo%2 == 0) {
				result += fibo;  
			}
		}
		
		return result;
	}
	
	public static int getFibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		int val1, val2, result=0;
		val1 = 0;
		val2 = 1;
		
		for(int i=1; i<n; i++) {
			result = val1 + val2;
			val1 = val2;
			val2 = result; 
		}
		
		return result;
	}
	
	public static int getRecursiveFibonacci(int n) {
		if(n == 0 || n == 1) {
			return n;
		}else {
			return getRecursiveFibonacci(n-1) + getRecursiveFibonacci(n-2);
		}
	}
}
