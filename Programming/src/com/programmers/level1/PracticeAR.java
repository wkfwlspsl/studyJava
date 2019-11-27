package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > �ڿ��� ������ �迭�� �����

	���� ����
	�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. 
	������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.
	
	���� ����
	n�� 10,000,000,000������ �ڿ����Դϴ�.
	
	����� ��
	n	return
	12345	[5,4,3,2,1]
 */
public class PracticeAR {
	public static void main(String[] args) {
		int[] arr = solution(12345);
		for(int a : arr) {
			System.out.println(a);
		}
	}
	
	public static int[] solution(long n) {
		String strN = Long.toString(n);
		int[] answer = new int[strN.length()];
		
		for(int i=0; i<strN.length(); i++) {
			answer[i] = Integer.parseInt(String.valueOf(strN.charAt(i))); 
		}
		
		reverse(answer);
		return answer;
	}
	
	public static void reverse(int[] iArr) {
		int start=0, end=iArr.length-1;
		
		while(start < end) {
			int temp = iArr[start];
			iArr[start] = iArr[end];
			iArr[end] = temp;
			start++;
			end--;
		}
	}
}
