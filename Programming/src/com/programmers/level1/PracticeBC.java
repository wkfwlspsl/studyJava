package com.programmers.level1;

/*
	�ڵ��׽�Ʈ ���� > �������� > x��ŭ ������ �ִ� n���� ����
	
	���� ����
	�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
	���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
	n�� 1000 ������ �ڿ����Դϴ�.
	
	����� ��
	x	n	answer
	2	5	[2,4,6,8,10]
	4	3	[4,8,12]
	-4	2	[-4, -8]
 */
public class PracticeBC {
	public static void main(String[] args) {
//		long[] answer = solution(2,5);
//		long[] answer = solution(4,3);
		long[] answer = solution(-10000000,1000);
		for(long n:answer) {
			System.out.println(n);
		}
	}
	
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (long)x * (i+1);
		}
		return answer;
	}
}
