package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > ���ڼ��ڼ��ڼ��ڼ��ڼ�?

	���� ����
	���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
	������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
	
	���� ����
	n�� ���� 10,000������ �ڿ����Դϴ�.
	
	����� ��
	n	return
	3	���ڼ�
	4	���ڼ���
 */
public class PracticeAL {
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	
	public static String solution(int n) {
		String answer = repeat("����", n/2);
		if(n%2==1) {
			answer += "��";
		}
		return answer;
	}
	
	public static String repeat(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(s);
		}
		return sb.toString();
	}
}
