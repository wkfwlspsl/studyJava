package com.dailyProgramming;
/*
	정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오. 
	팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를 말합니다. 
	단, 정수를 문자열로 바꾸면 안됩니다.
	Given an integer, check if it is a palindrome.
	
	예제)
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
