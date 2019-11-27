package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > �ڸ��� ���ϱ�
	
	���� ����
	�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
	������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
	
	���ѻ���
	N�� ���� : 100,000,000 ������ �ڿ���
	
	����� ��
	N	answer
	123	6
	987	24
	
	����� �� ����
	����� �� #1
	������ ���ÿ� �����ϴ�.
	
	����� �� #2
	9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.
 */
public class PracticeAQ {
	public static void main(String[] arg) {
		System.out.println(solution(987));
	}
	
	public static int solution(int n) {
        if(n == 0) {
        	return n;
        }
        return solution(n/10) + n%10;
    }
}
