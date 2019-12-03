package com.programmers.level1;

import java.util.Arrays;
import java.util.stream.Stream;

/*
	�ڵ��׽�Ʈ ���� > �������� > �ϻ��� ��
	
	���� ����
	���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
	���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
	�ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	x�� 1 �̻�, 10000 ������ �����Դϴ�.
	����� ��
	arr	return
	10	true
	12	true
	11	false
	13	false
	
	����� �� ����
	����� �� #1
	10�� ��� �ڸ����� ���� 1�Դϴ�. 10�� 1�� ������ �������Ƿ� 10�� �ϻ��� ���Դϴ�.
	
	����� �� #2
	12�� ��� �ڸ����� ���� 3�Դϴ�. 12�� 3���� ������ �������Ƿ� 12�� �ϻ��� ���Դϴ�.
	
	����� �� #3
	11�� ��� �ڸ����� ���� 2�Դϴ�. 11�� 2�� ������ �������� �����Ƿ� 11�� �ϻ��� ���� �ƴմϴ�.
	
	����� �� #4
	13�� ��� �ڸ����� ���� 4�Դϴ�. 13�� 4�� ������ �������� �����Ƿ� 13�� �ϻ��� ���� �ƴմϴ�.
 */
public class PracticeAZ {
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
	}
	
	public static boolean solution(int x) {
		String str = String.valueOf(x);
		int[] arr = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
		int sum = Arrays.stream(arr).sum();
		return x%sum==0;
	}
}
