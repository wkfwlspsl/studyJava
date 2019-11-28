package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > ���� ������ �Ǻ�
	
	���� ����
	������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
	n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
	
	���� ����
	n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
	
	����� ��
	n	return
	121	144
	3	-1
	
	����� �� ����
	����� ��#1
	121�� ���� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� �����մϴ�.
	
	����� ��#2
	3�� ���� ������ ������ �ƴϹǷ�, -1�� �����մϴ�.
 */
public class PracticeAT {
	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
	}
	
	public static long solution(long n) {
		double sqrt = Math.sqrt(n);
		
		if(sqrt == Math.floor(sqrt)) {
			return (long) ((sqrt+1) * (sqrt+1));
		}
		return -1;
	}
}
