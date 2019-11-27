package com.programmers.level1;
/*
	코딩테스트 연습 > 연습문제 > 수박수박수박수박수박수?

	문제 설명
	길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
	예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
	
	제한 조건
	n은 길이 10,000이하인 자연수입니다.
	
	입출력 예
	n	return
	3	수박수
	4	수박수박
 */
public class PracticeAL {
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	
	public static String solution(int n) {
		String answer = repeat("수박", n/2);
		if(n%2==1) {
			answer += "수";
		}
		return answer;
	}
	
	public static String repeat(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(s);
		}
		return sb.toString();
	}
}
