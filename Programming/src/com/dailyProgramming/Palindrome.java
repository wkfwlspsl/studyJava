package com.dailyProgramming;
/*
	����(int)�� �־�����, �Ӹ����(palindrome)���� �˾Ƴ��ÿ�. 
	�Ӹ�����̶�, �տ������� ������ �ڿ������� ������ ���� �ܾ ���մϴ�. 
	��, ������ ���ڿ��� �ٲٸ� �ȵ˴ϴ�.
	Given an integer, check if it is a palindrome.
	
	����)
	Input: 12345
	Output: False
	
	Input: -101
	Output: False
	
	Input: 11111
	Output: True
	
	Input: 12421
	Output: True
 */

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(12345));
		System.out.println(isPalindrome(-101));
		System.out.println(isPalindrome(11111));
		System.out.println(isPalindrome(12421));
	}
	
	public static boolean isPalindrome(int n) {
		if(n < 0) {
			return false;
		}
		
		String reverseStr = reverse(n);
		int reverseInt = Integer.parseInt(reverseStr);
		
		return n == reverseInt;
	}
	
	public static String reverse(int n) {
		if(n == 0) {
			return "";
		}
		return n%10 + "" + reverse(n/10);
	}
}
