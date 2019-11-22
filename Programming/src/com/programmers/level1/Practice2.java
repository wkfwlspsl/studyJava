package com.programmers.level1;

/*
	�ڵ��׽�Ʈ ���� > �������� > ��� ���� ��������
	
	�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
	
	���ѻ���
	s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
	
	����� ��
	s		return
	abcde	c
	qwer	we
 */
public class Practice2 {
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}
	
	public static String solution(String str) {
		boolean isEven = str.length()%2 == 0;
		StringBuilder sb = new StringBuilder();
		
		if(isEven) {
			sb.append(str.charAt(str.length()/2-1));
		}
		sb.append(str.charAt(str.length()/2));
		
		return sb.toString();
	}
}
