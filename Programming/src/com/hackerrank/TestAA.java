package com.hackerrank;

import java.util.Arrays;

/*
게임보드 점수
100 90 90 80 75 60
앨리스 게임 점수
50 65 77 90 102

출력
6 5 4 2 1

timeout..
 */
public class TestAA {
	public static void main(String[] args) {
		int[] result = solution(new int[] {100,90,90,80,75,60}, new int[] {50,65,77,90,102});
		System.out.println(result);
	}
	
	public static int[] solution(int[] scores, int[] alice) {
		int[] result = new int[alice.length];
		int[] distinctScore = Arrays.stream(scores).distinct().sorted().toArray();
		for(int i=0; i<alice.length; i++) {
			int aliceScore = alice[i];
			result[i] = getAliceRank(distinctScore, aliceScore);
			
		}
		
		return result;
	}
	
	public static int getAliceRank(int[] distinctScore, int aliceScore) {
		for(int i=distinctScore.length-1; i>=0; i--) {
			if(distinctScore[i] <= aliceScore) {
				return distinctScore.length - i;
			}
		}
		return distinctScore.length + 1;
	}
	
}
