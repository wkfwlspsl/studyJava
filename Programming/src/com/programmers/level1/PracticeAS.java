package com.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/*
	�ڵ��׽�Ʈ ���� > �������� > ���� ������������ ��ġ�ϱ�
	
	���� ����
	�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. 
	n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
	������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
	
	���� ����
	n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
	
	����� ��
	n		return
	118372	873211
 */
public class PracticeAS {
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
	
	public static long solution(long n) {
		String s = String.valueOf(n);
		String[] sArr = new String[s.length()];
		for(int i=0; i<s.length(); i++) {
			sArr[i] = String.valueOf(s.charAt(i));
		}
		
		Arrays.sort(sArr, Comparator.reverseOrder());
		return Long.parseLong(String.join("", sArr));
	}
}
