package com.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/*
	�ڵ��׽�Ʈ ���� > �������� > ���ڿ� ������������ ��ġ�ϱ�

	���� ����
	���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
	
	���� ����
	str�� ���� 1 �̻��� ���ڿ��Դϴ�.
	
	����� ��
	s		return
	Zbcdefg	gfedcbZ
 */
public class Practice8 {
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
	
	public static String solution(String s) {
		String[] splitStr = s.split("");
		Arrays.sort(splitStr, Comparator.reverseOrder());
		return String.join("", splitStr);
	}
}
