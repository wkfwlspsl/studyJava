package com.programmers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
�ڵ��׽�Ʈ ���� > ��(Heap) > ��� ����

��� ���忡���� �Ϸ翡 �а��縦 1�澿 ����մϴ�. 
���� �а��縦 ���޹޴� ������ �������� ������ k�� ���Ŀ��� �а��縦 ���޹��� �� �ֱ� ������ �ؿ� ���忡�� �а��縦 �����ؾ� �մϴ�.

�ؿ� ���忡���� ���� �а��縦 ������ �� �ִ� ��¥�� ������ �˷��־���, 
��� ���忡���� ��ۺ� ���̱� ���� �ּ����� Ƚ���� �а��縦 ���޹ް� �ͽ��ϴ�.

���� ���忡 �����ִ� �а��� ���� stock, �а��� ���� ����(dates)�� �ش� ������ ���� ������ �а��� ����(supplies), 
���� �������κ��� ���޹��� �� �ִ� ���� k�� �־��� ��, �а��簡 �������� �ʰ� ������ ��ϱ� ���ؼ� 
�ּ��� �� �� �ؿ� �������κ��� �а��縦 ���޹޾ƾ� �ϴ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

dates[i]���� i��° ���� �������� ���������, 
supplies[i]���� dates[i] ��¥�� ���� ������ �а��� ������ ��� �ֽ��ϴ�.

���ѻ���
stock�� �ִ� �а���� ����(0�� ����)���� ���˴ϴ�.
stock�� k�� 2 �̻� 100,000 �����Դϴ�.
dates�� �� ���Ҵ� 1 �̻� k �����Դϴ�.
supplies�� �� ���Ҵ� 1 �̻� 1,000 �����Դϴ�.
dates�� supplies�� ���̴� 1 �̻� 20,000 �����Դϴ�.
k�� °���� �а��簡 ����� ���޵Ǳ� ������ k-1�Ͽ� ����� ���������� Ȯ���ϸ� �˴ϴ�.
dates�� ����ִ� ��¥�� �������� ���ĵǾ� �ֽ��ϴ�.
dates�� ����ִ� ��¥�� ���޵Ǵ� �а���� �۾� ���� �� ������ ���޵Ǵ� ���� �������� �մϴ�. 
���� ��� 9��°�� �а��簡 �ٴڳ�����, 10��°�� ���޹����� 10��°���� ������ ��� �� �ֽ��ϴ�.
�а��簡 �ٴڳ��� ���� �־����� �ʽ��ϴ�.

����� ��
stock	dates		supplies	k	result
4		[4,10,15]	[20,5,10]	30	2

����� �� ����
���� �а��簡 4�� ���� �ֱ� ������ ���ð� 1�� ��~3�� �ı��� ����ϰ� ���� ��� �а��縦 �� ����մϴ�. 
���� 4�� �Ŀ��� �ݵ�� �а��縦 ���޹޾ƾ� �մϴ�.
4��° ���޹ް� ���� 15�� ���� ��ħ���� 9���� �а��簡 �����ְ� �ǰ�, 
�̶� 10���� �� ���޹����� 19���� �����ְ� �˴ϴ�. 
15�� ���ĺ��� 29�� ���ı��� �ʿ��� �а���� 15���̹Ƿ� �� �̻��� ������ �ʿ� �����ϴ�.
���� �� 2ȸ�� �а��縦 ���޹����� �˴ϴ�.
 */
public class TestAH {
	public static void main(String[] args) {
		System.out.println(solution(4, new int[] {4,10,15}, new int[] {20,5,10}, 30));
	}
	
	public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int idx = 0;
        Queue<Integer> supplyQue = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int i=0; i<k; i++) {
        	if(dates[idx] == i) {
        		supplyQue.offer(supplies[idx]);
        		if(idx < dates.length-1) {
        			idx++;
        		}
        	}
        	
        	if(stock == 0) {
        		stock += supplyQue.poll();
        		answer++;
        	}
        	
        	stock--;
        }
        
        return answer;
    }
	
	public static int solution2(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;
		k = k-1;
		
		if(stock >= k) {
			return answer;
		}
		
		Queue<Integer> supplyQue = new PriorityQueue<>(Comparator.reverseOrder());
		for(int n:supplies) {
			supplyQue.offer(n);
		}
		
		while(supplyQue.size() > 0) {
			stock += supplyQue.poll();
			answer++;
			if(stock >= k) {
				return answer;
			}
		}
		
		return answer;
	}
	
}






