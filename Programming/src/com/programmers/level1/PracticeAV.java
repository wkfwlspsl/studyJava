package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > ¦���� Ȧ��
	
	���� ����
	���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	num�� int ������ �����Դϴ�.
	0�� ¦���Դϴ�.
	
	����� ��
	num	return
	3	Odd
	4	Even
 */

public class PracticeAV {
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	
	public static String solution(int num) {
		return num%2==0 ? "Even" : "Odd";
	}
}
