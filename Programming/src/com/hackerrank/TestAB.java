package com.hackerrank;

import java.math.BigInteger;

public class TestAB {
	public static void main(String[] args) {
		solution(25);
	}
	
	public static void solution(int n) {
		BigInteger b = new BigInteger("1");
		
		for(int i=1; i<=n; i++) {
			b = b.multiply(new BigInteger(i+""));
		}
		
		System.out.println(b);
	}
	
}
