package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > �ִ������� �ּҰ����
	
	���� ����
	�� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. 
	�迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
	���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.
	
	���� ����
	�� ���� 1�̻� 1000000������ �ڿ����Դϴ�.
	
	����� ��
	n	m	return
	3	12	[3, 12]
	2	5	[1, 10]
	
	����� �� ����
	����� �� #1
	���� ����� �����ϴ�.
	
	����� �� #2
	�ڿ��� 2�� 5�� �ִ������� 1, �ּҰ������ 10�̹Ƿ� [1, 10]�� �����ؾ� �մϴ�.
 */

public class PracticeAW {
	public static void main(String[] args) {
		int[] result = solution(3, 12);
		for(int n: result) {
			System.out.println(n);
		}
	}
	
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = getGreatestCommonDivisor(Math.min(n, m), Math.max(n, m));
		answer[1] = getLeastCommonMultiple(n, m, answer[0]);
		return answer;
	}
	
	//�ִ�����: ū ���� ���� ���� ������ �������� ����. 
	//�������� 0�̸� �������� �ִ�����. 
	//0�� �ƴϸ� �������� �������� ������ �ݺ�
	public static int getGreatestCommonDivisor(int min, int max) {
		int r = max%min;
		if(r == 0) {
			return min;
		}
		
		return getGreatestCommonDivisor(Math.min(min, r), Math.max(min, r));
	}
	//�ּҰ����: n * m / gcd
	public static int getLeastCommonMultiple(int n, int m, int gcd) {
		return n * m / gcd;
	}
}
