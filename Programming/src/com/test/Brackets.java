package com.test;

import java.util.HashSet;
import java.util.Set;

/*
	정수 n이 주어지면, n개의 여는 괄호 "("와 n개의 닫는 괄호 ")"로 만들 수 있는 괄호 조합을 모두 구하시오. (시간 복잡도 제한 없습니다).
	Given an integer N, find the number of possible balanced parentheses with N opening and closing brackets.
	
	예제)
	Input: 1
	Output: ["()"]
	
	Input: 2
	Output: ["(())", "()()"]
	
	Input: 3
	Output: ["((()))", "(()())", "()(())", "(())()", "()()()"]
*/
public class Brackets {
	private static Set<String> result = new HashSet<>();
	public static void main(String[] args) {
		String[] arr = solution(3);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static String[] solution(int n) {
		String[] answer;
		StringBuilder strBuilder = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			strBuilder.append("(");
			strBuilder.append(")");
		}
		
		stringCombination("", strBuilder.toString());
		
		answer = new String[result.size()];
		return result.toArray(answer);
	}
	
	private static void stringCombination(String prefix, String str) { 
		int n = str.length(); 
		if (n == 0) {
			if(checkBrackets(prefix)) {
				result.add(prefix); 
			}
		} else { 
			for (int i = 0; i < n; i++) {
				stringCombination(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1)); 
			}
		}
	}
	
	private static boolean checkBrackets(String value) {
		int point = 0;
		
		for(int i=0; i<value.length(); i++) {
			if('(' == value.charAt(i)) {
				point++;
			}else if(')' == value.charAt(i)) {
				point--;
			}
			
			if(point < 0) {
				return false;
			}
		}
		
		return true;
	}
}
