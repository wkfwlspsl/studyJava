package com.programmers.level1;
/*
	코딩테스트 연습 > 연습문제 > 자연수 뒤집어 배열로 만들기

	문제 설명
	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
	예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	
	제한 조건
	n은 10,000,000,000이하인 자연수입니다.
	
	입출력 예
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
