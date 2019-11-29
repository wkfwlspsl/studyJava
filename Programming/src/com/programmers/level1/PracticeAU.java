package com.programmers.level1;

import java.util.Arrays;

/*
	�ڵ��׽�Ʈ ���� > �������� > ���� ���� �� �����ϱ�

	���� ����
	������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. 
	��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
	������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
	
	���� ����
	arr�� ���� 1 �̻��� �迭�Դϴ�.
	�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
	
	����� ��
	arr			return
	[4,3,2,1]	[4,3,2]
	[10]		[-1]
 */
public class PracticeAU {
	public static void main(String[] args) {
		int[] arr = solution(new int[] {10});
		for(int a : arr) {
			System.out.println(a);
		}
	}
	
	public static int[] solution(int[] arr) {
		if(arr.length == 1) {
			return new int[] {-1};
		}
		
		int min = Arrays.stream(arr).min().getAsInt();
		return Arrays.stream(arr).filter(n->n != min).toArray();
	}
}
