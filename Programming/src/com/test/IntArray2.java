package com.test;

import java.util.LinkedList;
import java.util.List;

/*
	정수 배열과 정수 k가 주어지면 모든 원소를 k칸씩 앞으로 옮기시오.

	Given an array, rotate the array to the right by k steps, where k is non-negative.

	input: [1, 2, 3, 4, 5], k=2
	output: [3, 4, 5, 1, 2]

	input: [0, 1, 2, 3, 4], k=1
	output: [1, 2, 3, 4, 0]

	시간복잡도를 최대한 최적화 하시오.
 */
public class IntArray2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int k = 108;
		StringBuilder sb = new StringBuilder();
		
		solution(arr, k);
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
	}
	
	public static void solution(int[] arr, int k) {
		int n = k % arr.length;
		List<Integer> list = new LinkedList<>();
		
		if(n != 0) {
			for(int i=n; i<arr.length; i++) {
				list.add(arr[i]);
			}
			for(int i=0; i<n; i++) {
				list.add(arr[i]);
			}
			for(int i=0; i<list.size(); i++) {
				arr[i] = list.get(i).intValue();
			}
		}
	}
}















