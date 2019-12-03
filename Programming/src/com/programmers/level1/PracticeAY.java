package com.programmers.level1;

import java.util.Arrays;

/*
	�ڵ��׽�Ʈ ���� > �������� > ��� ���ϱ�
	
	���� ����
	������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.
	
	���ѻ���
	arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
	arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
	
	����� ��
	arr			return
	[1,2,3,4]	2.5
	[5,5]		5
 */
public class PracticeAY {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}));
		System.out.println(solution(new int[] {5,5}));
	}
	
	public static double solution(int[] arr) {
		return Arrays.stream(arr).average().getAsDouble();
	}
}
