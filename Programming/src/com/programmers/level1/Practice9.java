package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > ���ڿ� �ٷ�� �⺻
	
	���� ����
	���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. 
	���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.
	
	���� ����
	s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
	
	����� ��
	s		return
	a234	false
	1234	true
 */
public class Practice9 {
	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}
	
	public static boolean solution(String s) {
		boolean answer = true;
		
		if(s.length() != 4 && s.length() != 6) {
			answer = false;
		}else {
			try {
				int n = Integer.parseInt(s);
			}catch(NumberFormatException e) {
				answer = false;
			}
		}
		
		return answer;
	}
}
