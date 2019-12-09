package com.dailyProgramming;

/*
	정수 배열(int array)가 주어지면 이어지는 원소들의 합중 가장 큰값을 구하시오. 단, 시간복잡도는 O(n).
	Given an integer array, find the largest consecutive sum of elements.
	예제}

	Input: [-1, 3, -1, 5]
	Output: 7 // 3 + (-1) + 5

	Input: [-5, -3, -1]
	Output: -1 // -1

	Input: [2, 4, -2, -3, 8]
	Output: 9 // 2 + 4 + (-2) + (-3) + 8
 */
public class IntArray1 {
	public static void main(String[] args) {
		int[] arr1 = {-1, 3, -1, 5};
		int[] arr2 = {-5, -3, -1};
		int[] arr3 = {2, 4, -2, -3, 8};
		
		System.out.println(solution(arr1));
		System.out.println(solution(arr2));
		System.out.println(solution(arr3));
	}
	public static int solution(int[] arr) {
		int currentSum = arr[0];
		int maxSum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			currentSum = Math.max(currentSum + arr[i], arr[i]);
			maxSum = Math.max(currentSum, maxSum);
		}
		
		return maxSum;
	}
}


