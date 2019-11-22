package com.programmers.level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
	�ڵ��׽�Ʈ ���� > �������� > ������ �������� ���� �迭
	
	���� ����
	array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
	divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
	
	���ѻ���
	arr�� �ڿ����� ���� �迭�Դϴ�.
	���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
	divisor�� �ڿ����Դϴ�.
	array�� ���� 1 �̻��� �迭�Դϴ�.
	
	����� ��
	arr				divisor	return
	[5, 9, 7, 10]	5		[5, 10]
	[2, 36, 1, 3]	1		[1, 2, 3, 36]
	[3,2,6]			10		[-1]
	
	����� �� ����
	����� ��#1
	arr�� ���� �� 5�� ������ �������� ���Ҵ� 5�� 10�Դϴ�. ���� [5, 10]�� �����մϴ�.
	
	����� ��#2
	arr�� ��� ���Ҵ� 1���� ������ �������ϴ�. ���Ҹ� ������������ ������ [1, 2, 3, 36]�� �����մϴ�.
	
	����� ��#3
	3, 2, 6�� 10���� ������ �������� �ʽ��ϴ�. ������ �������� ���Ұ� �����Ƿ� [-1]�� �����մϴ�.
 */

public class Practice4 {
	public static void main(String[] args) {
		int[] result = solution2(new int[] {3,2,6}, 10);
		for(int n:result) {
			System.out.println(n);
		}
	}
	
	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new LinkedList<>();
		
		if(divisor == 1) {
			Arrays.sort(arr);
			return arr;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		int[] answer = list.stream().mapToInt(i -> i).toArray();
		if(answer.length == 0) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			Arrays.sort(answer);
		}
		return answer;
	}
	
	//��Ʈ�� �̿�
	public static int[] solution2(int[] arr, int divisor) {
		int[] answer = Arrays.stream(arr).filter(d -> d%divisor == 0).sorted().toArray();
		
		if(answer.length == 0) {
			answer = new int[1];
			answer[0] = -1;
		}
		return answer;
	}
}









