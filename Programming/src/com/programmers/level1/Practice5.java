package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > �� ���� ������ ��
	
	���� ����
	�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
	
	���� ����
	a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
	a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
	a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
	
	����� ��
	a	b	return
	3	5	12
	3	3	3
	5	3	12
 */
public class Practice5 {
	public static void main(String[] args) {
		System.out.println(solution2(5, 3));
	}
	
	public static long solution(int a, int b) {
		long answer = 0;
		if(a == b) return a;
		int s = (a<b)?a:b, e = (a<b)?b:a;
		
		for(int i=s; i<=e; i++) {
			answer += i;
		}
		
		return answer;
	}
	
	//���α׷��ӽ����� �� ���а������� Ǭ ���
	public static long solution2(int a, int b) {
		if(a == b) return a;
		int s = (a<b)?a:b, e = (a<b)?b:a;
		
		return (e - s + 1) * (s + e) / 2;
	}
}
