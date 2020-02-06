package com.test;

import java.util.Arrays;

public class Temp {
	public static void main(String[] args) {
		int[] arr = new int[] {3,1,2,3};
		
		int max = Arrays.stream(arr).max().getAsInt();
		long cnt = Arrays.stream(arr).filter(x -> (x == max)).count();
		System.out.println(cnt);
		
	}
	
}
