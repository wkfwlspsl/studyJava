package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > �Ҽ� ã��

	���� ����
	1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.
	
	�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
	(1�� �Ҽ��� �ƴմϴ�.)
	
	���� ����
	n�� 2�̻� 1000000������ �ڿ����Դϴ�.
	
	����� ��
	n	result
	10	4
	5	3
	
	����� �� ����
	����� �� #1
	1���� 10 ������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4�� ��ȯ
	
	����� �� #2
	1���� 5 ������ �Ҽ��� [2,3,5] 3���� �����ϹǷ� 3�� ��ȯ
 */
public class Practice11 {
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(5));
	}
	
	public static int solution(int n) {
		int answer = 0;
		
		for(int i=2; i<=n; i++) {
			if(isPrimeNumber(i)) {
				answer++;
			}
		}
		return answer;
	}
	
	public static boolean isPrimeNumber(int n) {
		for(int i=2; i<=Math.sqrt((double)n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
