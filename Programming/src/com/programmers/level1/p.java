package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > ����� ��

	���� ����
	���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	n�� 0 �̻� 3000������ �����Դϴ�.
	
	����� ��
	n	return
	12	28
	5	6
	
	����� �� ����
	����� �� #1
	12�� ����� 1, 2, 3, 4, 6, 12�Դϴ�. �̸� ��� ���ϸ� 28�Դϴ�.
	
	����� �� #2
	5�� ����� 1, 5�Դϴ�. �̸� ��� ���ϸ� 6�Դϴ�.
 */
public class p {
	public static void main(String[] args) {
		System.out.println(solution(0));
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(12));
		System.out.println(solution(5));
	}
	
	public static int solution(int n) {
		int answer = 1;
		if(n == 0) {
			return 0;
		}
		
		for(int i=2; i<=n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		
		return answer;
	}
}
