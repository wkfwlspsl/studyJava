package com.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

/*
�ڵ��׽�Ʈ ���� > ����/ť > �ֽİ���

�� ������ ��ϵ� �ֽİ����� ��� �迭 prices�� �Ű������� �־��� ��, 
������ �������� ���� �Ⱓ�� �� �������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���ѻ���
prices�� �� ������ 1 �̻� 10,000 ������ �ڿ����Դϴ�.
prices�� ���̴� 2 �̻� 100,000 �����Դϴ�.

����� ��
prices			return
[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]

����� �� ����
1�� ������ \1�� ������ ������ �������� �ʾҽ��ϴ�.
2�� ������ \2�� ������ ������ �������� �ʾҽ��ϴ�.
3�� ������ \3�� 1�ʵڿ� ������ �������ϴ�. ���� 1�ʰ� ������ �������� ���� ������ ���ϴ�.
4�� ������ \2�� 1�ʰ� ������ �������� �ʾҽ��ϴ�.
5�� ������ \3�� 0�ʰ� ������ �������� �ʾҽ��ϴ�.
 */
public class TestAF {
	public static void main(String[] args) {
		int[] result = solution(new int[] {1, 2, 3, 2, 3});
		System.out.println(result);
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[prices.length-1] = 0;
        Queue<Integer> que = new LinkedList<>();
        for(int i=0; i<prices.length; i++) {
        	que.offer(prices[i]);
        }
        
        for(int i=0; i<prices.length-1; i++){
        	int data = que.poll();
        	int fallTime = getMinCnt(data, que);
        	answer[i] = que.size() - fallTime;
        }
        
        return answer;
    }
	
	public static int getMinCnt(int data, Queue<Integer> que) {
		int cnt = 0;
		for(int i=0; i<que.size(); i++) {
			int qd = que.poll();
			if(data > qd) {
				cnt++;
			}
			que.offer(qd);
		}
		return cnt;
	}
}
