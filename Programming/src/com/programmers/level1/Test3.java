package com.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
	코딩테스트 연습 > 완전탐색 > 모의고사
	
	문제 설명
	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
	
	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	
	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	제한 조건
	시험은 최대 10,000 문제로 구성되어있습니다.
	문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
	가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	
	입출력 예
	answers		return
	[1,2,3,4,5]	[1]
	[1,3,2,4,2]	[1,2,3]
*/
public class Test3 {
	public static void main(String[] args) {
		int[] answer = solution(new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5});
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	public static int[] solution(int[] answers) {
        List<Integer> list = new LinkedList<>();
        int[] answerCnt = new int[3];
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        Map<Integer, Integer> supojaMap = new HashMap<>();
        supojaMap.put(1, answerCnt[0] = countAnswer(supoja1, answers));
        supojaMap.put(2, answerCnt[1] = countAnswer(supoja2, answers));
        supojaMap.put(3, answerCnt[2] = countAnswer(supoja3, answers));
        
        Arrays.sort(answerCnt);
        for(Map.Entry<Integer, Integer> entry : supojaMap.entrySet()) {
        	if(answerCnt[2] == entry.getValue()) {
        		list.add(entry.getKey());
        	}
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
	
	public static int countAnswer(int[] supoja, int[] answers) {
		int cnt = 0;
		
		for(int i=0; i<answers.length; i++) {
			int n = i%supoja.length;
			if(answers[i] == supoja[n]) {
				cnt++;
			}
		}
		
		return cnt;
	}
}
