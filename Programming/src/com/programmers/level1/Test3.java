package com.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
	�ڵ��׽�Ʈ ���� > ����Ž�� > ���ǰ��
	
	���� ����
	�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.
	
	1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	
	1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	
	���� ����
	������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
	������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
	���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
	
	����� ��
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
