package com.dailyProgramming;

/*
	���� �迭(int array)�� �־����� �̾����� ���ҵ��� ���� ���� ū���� ���Ͻÿ�. ��, �ð����⵵�� O(n).
	Given an integer array, find the largest consecutive sum of elements.
	����}

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


