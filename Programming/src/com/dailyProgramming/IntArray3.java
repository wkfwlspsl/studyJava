package com.dailyProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
	���� �迭�� Ÿ�� ���ڰ� �־�����, ���� Ÿ�ٰ��� �Ǵ� �� ������ �ε����� ã���ÿ�.
	��, �ð����⵵ O(n) ���� �մϴ�.
	Given an array of integers and a target integer, find two indexes of the array element that sums to the target number.
	
	����)
	Input: [2, 5, 6, 1, 10], Ÿ�� 8
	Output: [0, 2] // �迭[0] + �迭[2] = 8
 */
public class IntArray3 {
	public static void main(String[] args) {
		int[] result = solution(new int[] {2, 5, 6, 1, 10}, 8);
		for(int n:result) {
			System.out.println(n);
		}
	}
	
	public static int[] solution(int[] arr, int target) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int[] answer = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			int n = target - arr[i];
			if(list.contains(n)) {
				answer[0] = i;
				answer[1] = list.indexOf(n);
				break;
			}
		}
		
		Arrays.sort(answer);
		return answer;
	}
}
