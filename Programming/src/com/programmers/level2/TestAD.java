package com.programmers.level2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*
�ڵ��׽�Ʈ ���� > ����/ť > ������

�Ϲ����� �����ʹ� �μ� ��û�� ���� ������� �μ��մϴ�. 
�׷��� ������ �߿��� ������ ���߿� �μ�� �� �ֽ��ϴ�. 
�̷� ������ �����ϱ� ���� �߿䵵�� ���� ������ ���� �μ��ϴ� �����͸� �����߽��ϴ�. 
�� ���Ӱ� ������ �����ʹ� �Ʒ��� ���� ������� �μ� �۾��� �����մϴ�.

1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
3. �׷��� ������ J�� �μ��մϴ�.
���� ���, 4���� ����(A, B, C, D)�� ������� �μ� ����Ͽ� �ְ� �߿䵵�� 2 1 3 2 ��� C D A B ������ �μ��ϰ� �˴ϴ�.

���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� �˰� �ͽ��ϴ�. ���� ������ C�� 1��°��, A�� 3��°�� �μ�˴ϴ�.

���� ����Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭 priorities�� 
���� �μ⸦ ��û�� ������ ���� ������� � ��ġ�� �ִ����� �˷��ִ� location�� �Ű������� �־��� ��, 
���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
���� ����Ͽ��� 1�� �̻� 100�� ������ ������ �ֽ��ϴ�.
�μ� �۾��� �߿䵵�� 1~9�� ǥ���ϸ� ���ڰ� Ŭ���� �߿��ϴٴ� ���Դϴ�.
location�� 0 �̻� (���� ����Ͽ� �ִ� �۾� �� - 1) ������ ���� ������ ������� ���� �տ� ������ 0, �� ��°�� ������ 1�� ǥ���մϴ�.

����� ��
priorities			location	return
[2, 1, 3, 2]		2			1
[1, 1, 9, 1, 1, 1]	0			5

����� �� ����
���� #1

������ ���� ���� �����ϴ�.

���� #2

6���� ����(A, B, C, D, E, F)�� �μ� ����Ͽ� �ְ� �߿䵵�� 1 1 9 1 1 1 �̹Ƿ� C D E F A B ������ �μ��մϴ�.
 */
public class TestAD {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        int printCnt = 0;
        location += 1;
        Queue<Integer> que = new LinkedList<>();
        Map<Integer, Integer> priorityMap = new HashMap<>();
        for(int i=0; i<priorities.length; i++) {
        	que.offer(i+1);
        	priorityMap.put(i+1, priorities[i]);
        }
        
        while(true) {
        	int data = que.poll();
        	if(isPrint(data, que, priorityMap)) {
        		printCnt++;
        		if(data == location) {
        			answer = printCnt;
        			break;
        		}
        	}else {
        		que.offer(data);
        	}
        }
        
        return answer;
    }
	
	public static boolean isPrint(int data, Queue<Integer> que, Map<Integer, Integer> priorityMap) {
		int max = priorityMap.get(data);
		int qSize = que.size();
		
		for(int i=0; i<qSize; i++) {
			int queData = que.poll();
			int priority = priorityMap.get(queData);
			max = Math.max(max, priority);
			que.offer(queData);
		}
		
		return max == priorityMap.get(data);
	}
}












