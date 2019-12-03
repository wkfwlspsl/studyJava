package com.programmers.level1;

import java.util.Arrays;

/*
	�ڵ��׽�Ʈ ���� > �������� > �ڵ��� ��ȣ ������
	
	���� ����
	���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
	��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, 
	��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
	
	����� ��
	phone_number	return
	01033334444		*******4444
	027778888		*****8888
 */
public class PracticeBA {
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}
	
	public static String solution(String phone_number) {
		char[] charArr = new char[phone_number.length()-4];
		Arrays.fill(charArr, '*');
		return String.valueOf(charArr) + phone_number.substring(phone_number.length()-4);
	}
}
