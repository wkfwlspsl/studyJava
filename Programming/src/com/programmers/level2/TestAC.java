package com.programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
�ڵ��׽�Ʈ ���� > ����/ť > ��ɰ���

���α׷��ӽ� �������� ��� ���� �۾��� ���� ���Դϴ�. �� ����� ������ 100%�� �� ���񽺿� �ݿ��� �� �ֽ��ϴ�.

��, �� ����� ���߼ӵ��� ��� �ٸ��� ������ �ڿ� �ִ� ����� �տ� �ִ� ��ɺ��� ���� ���ߵ� �� �ְ�, 
�̶� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����˴ϴ�.

���� �����Ǿ�� �ϴ� ������� �۾��� ������ ���� ���� �迭 progresses�� �� �۾��� ���� �ӵ��� ���� ���� �迭 speeds�� �־��� �� 
�� �������� �� ���� ����� �����Ǵ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���� ����
�۾��� ����(progresses, speeds�迭�� ����)�� 100�� �����Դϴ�.
�۾� ������ 100 �̸��� �ڿ����Դϴ�.
�۾� �ӵ��� 100 ������ �ڿ����Դϴ�.
������ �Ϸ翡 �� ���� �� �� ������, �Ϸ��� ���� �̷�����ٰ� �����մϴ�. 
���� ��� �������� 95%�� �۾��� ���� �ӵ��� �Ϸ翡 4%��� ������ 2�� �ڿ� �̷�����ϴ�.

����� ��
progresses	speeds		return
[93,30,55]	[1,30,5]	[2,1]

����� �� ����
ù ��° ����� 93% �Ϸ�Ǿ� �ְ� �Ϸ翡 1%�� �۾��� �����ϹǷ� 7�ϰ� �۾� �� ������ �����մϴ�.
�� ��° ����� 30%�� �Ϸ�Ǿ� �ְ� �Ϸ翡 30%�� �۾��� �����ϹǷ� 3�ϰ� �۾� �� ������ �����մϴ�. 
������ ���� ù ��° ����� ���� �ϼ��� ���°� �ƴϱ� ������ ù ��° ����� �����Ǵ� 7��° �����˴ϴ�.
�� ��° ����� 55%�� �Ϸ�Ǿ� �ְ� �Ϸ翡 5%�� �۾��� �����ϹǷ� 9�ϰ� �۾� �� ������ �����մϴ�.

���� 7��°�� 2���� ���, 9��°�� 1���� ����� �����˴ϴ�.
 */
public class TestAC {
	/*
	 * ���� 1)
progresses : [40, 93, 30, 55, 60, 65]
speeds : [60, 1, 30, 5 , 10, 7]
return : [1,2,3]

���� 2)
progresses : [93, 30, 55, 60, 40, 65]
speeds : [1, 30, 5 , 10, 60, 7]
return : [2,4]
	 */
	public static void main(String[] args) {
		int[] result = solution(new int[] {40, 93, 30, 55, 60, 65}
		, new int[] {60, 1, 30, 5 , 10, 7});
		System.out.println("test");
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int totalDeployCnt = 0;
        
        Queue<Integer> dep = new LinkedList<>();
        for(int i=0; i<progresses.length; i++) {
        	dep.offer(progresses[i]);
        }
        
        while(dep.size() > 0) {
        	develop(dep, speeds, totalDeployCnt);
        	
        	int depCnt = countDeploy(dep);
        	totalDeployCnt += depCnt;
        	if(depCnt > 0) {
        		answer.add(depCnt);
        	}
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
	
	public static void develop(Queue<Integer> que, int[] speeds, int totalDeployCnt) {
		for(int i=totalDeployCnt; i<speeds.length; i++) {
			int data = que.poll();
			if(data < 100) {
				int sum = data+speeds[i];
				que.offer(sum > 100 ? 100 : sum);
			}else {
				que.offer(data);
			}
		}
	}
	
	public static int countDeploy(Queue<Integer> que) {
		int cnt = 0;
		int qSize = que.size();
		
		for(int i=0; i<qSize; i++) {
			if(que.peek() >= 100) {
				que.poll();
				cnt++;
			}else {
				break;
			}
		}
		
		return cnt;
	}
}















