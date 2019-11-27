package com.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/*
	코딩테스트 연습 > 연습문제 > 정수 내림차순으로 배치하기
	
	문제 설명
	함수 solution은 정수 n을 매개변수로 입력받습니다. 
	n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
	예를들어 n이 118372면 873211을 리턴하면 됩니다.
	
	제한 조건
	n은 1이상 8000000000 이하인 자연수입니다.
	
	입출력 예
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
