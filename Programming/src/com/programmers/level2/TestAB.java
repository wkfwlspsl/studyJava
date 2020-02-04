package com.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

/*
�ڵ��׽�Ʈ ���� > ����/ť > �ٸ��� ������ Ʈ��

���� ����
Ʈ�� ���� �밡 ���� ���������� �� ���� �ٸ��� ������ ������ �ǳʷ� �մϴ�. ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� �˾Ƴ��� �մϴ�. 
Ʈ���� 1�ʿ� 1��ŭ �����̸�, �ٸ� ���̴� bridge_length�̰� �ٸ��� ���� weight���� �ߵ��ϴ�.
�� Ʈ���� �ٸ��� ������ ������ ���� ���, �� Ʈ���� ���Դ� ������� �ʽ��ϴ�.

���� ���, ���̰� 2�̰� 10kg ���Ը� �ߵ�� �ٸ��� �ֽ��ϴ�. ���԰� [7, 4, 5, 6]kg�� Ʈ���� ������� �ִ� �ð� �ȿ� �ٸ��� �ǳʷ��� ������ ���� �ǳʾ� �մϴ�.

��� �ð�	�ٸ��� ���� Ʈ��	�ٸ��� �ǳʴ� Ʈ��		��� Ʈ��
0		[]			[]				[7,4,5,6]
1~2		[]			[7]				[4,5,6]
3		[7]			[4]				[5,6]
4		[7]			[4,5]			[6]
5		[7,4]		[5]				[6]
6~7		[7,4,5]		[6]				[]
8		[7,4,5,6]	[]				[]
����, ��� Ʈ���� �ٸ��� �������� �ּ� 8�ʰ� �ɸ��ϴ�.

solution �Լ��� �Ű������� �ٸ� ���� bridge_length, �ٸ��� �ߵ� �� �ִ� ���� weight, Ʈ���� ���� truck_weights�� �־����ϴ�. 
�̶� ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���� ����
bridge_length�� 1 �̻� 10,000 �����Դϴ�.
weight�� 1 �̻� 10,000 �����Դϴ�.
truck_weights�� ���̴� 1 �̻� 10,000 �����Դϴ�.
��� Ʈ���� ���Դ� 1 �̻� weight �����Դϴ�.

����� ��
bridge_length	weight	truck_weights					return
2				10		[7,4,5,6]						8
100				100		[10]							101
100				100		[10,10,10,10,10,10,10,10,10,10]	110
 �ִ� 1001*/
public class TestAB {
	public static void main(String[] args) {
		System.out.println(solution(2, 10, new int[] {7,4,5,6}));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridgeQ = new LinkedList<>();
        int truckIdx = 0;
        int bridgeWeight = 0 ;
        
        while(truckIdx < truck_weights.length) {
        	answer++;
        	int currTruckWeight = truck_weights[truckIdx];
        	
        	if(bridgeWeight + currTruckWeight <= weight) {
        		truckIdx++;
        		bridgeWeight += currTruckWeight;
        		bridgeQ.offer(0);
        	}
        	
        	increaseTime(bridgeQ);
        	
        	if(bridgeQ.peek() == bridge_length) {
        		bridgeWeight -= truck_weights[truckIdx - bridgeQ.size()];
        		bridgeQ.poll();
        	}
        	
        }
        
        answer += bridge_length;
        
        return answer;
    }
	
	public static void increaseTime(Queue<Integer> queue) {
		for(int i=0; i<queue.size(); i++) {
			queue.offer(queue.poll() + 1);
		}
	}
}










