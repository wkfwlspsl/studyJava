package com.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/*
	�ڵ��׽�Ʈ ���� > 2019 KAKAO BLIND RECRUITMENT > ������
	
	���� ����
	
	���� ���� ������ �������� ū ��ο� ������. �׳డ ���� ������ ��õ���� �뼺���� �ŵ�����, ���� �ű� ������� ���� �ް��� ���̴�. 
	������ �ű� ����ڿ� ���� ����� ���̿� �������� ���̰� �ʹ� ū ���� ��������.
	
	�� ������ ��� �ұ� ��� �� �׳�� �������� ���� �ð��� �÷��� ���̵��� �����ϱ�� �ߴ�. 
	���� ���� �����ڶ� ��κ��� ������ ���� ����������, �������� ���ϴ� �κп��� ���⿡ ������ ���Ҵ�. 
	�������� ���� �������� ���ϴ� �ڵ带 �ϼ��϶�.
	
	�������� ������ ���� �����Ѵ�.
	���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� / ���������� ������ �÷��̾� ��
	��ü ���������� ���� N, ������ �̿��ϴ� ����ڰ� ���� �����ִ� ���������� ��ȣ�� ��� �迭 stages�� �Ű������� �־��� ��, 
	�������� ���� ������������ ������������ ���������� ��ȣ�� ����ִ� �迭�� return �ϵ��� solution �Լ��� �ϼ��϶�.
	
	���ѻ���
	���������� ���� N�� 1 �̻� 500 ������ �ڿ����̴�.
	stages�� ���̴� 1 �̻� 200,000 �����̴�.
	stages���� 1 �̻� N + 1 ������ �ڿ����� ����ִ�.
	�� �ڿ����� ����ڰ� ���� ���� ���� ���������� ��ȣ�� ��Ÿ����.
	��, N + 1 �� ������ ��������(N ��° ��������) ���� Ŭ���� �� ����ڸ� ��Ÿ����.
	���� �������� ���� ���������� �ִٸ� ���� ��ȣ�� ���������� ���� ������ �ϸ� �ȴ�.
	���������� ������ ������ ���� ��� �ش� ���������� �������� 0 ���� �����Ѵ�.
	
	����� ��
	N	stages						result
	5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
	4	[4,4,4,4,4]					[4,1,2,3]
	
	����� �� ����
	����� �� #1
	1�� ������������ �� 8���� ����ڰ� ����������, �� �� 1���� ����ڰ� ���� Ŭ�������� ���ߴ�. ���� 1�� ���������� �������� ������ ����.
	
	1 �� �������� ������ : 1/8
	2�� ������������ �� 7���� ����ڰ� ����������, �� �� 3���� ����ڰ� ���� Ŭ�������� ���ߴ�. ���� 2�� ���������� �������� ������ ����.
	
	2 �� �������� ������ : 3/7
	���������� ������ ���������� �������� ������ ����.
	
	3 �� �������� ������ : 2/4
	4�� �������� ������ : 1/2
	5�� �������� ������ : 0/1
	�� ���������� ��ȣ�� �������� ������������ �����ϸ� ������ ����.
	
	[3,4,2,1,5]
	
	����� �� #2
	
	��� ����ڰ� ������ ���������� �����Ƿ� 4�� ���������� �������� 1�̸� ������ ���������� �������� 0�̴�.
	
	[4,1,2,3]
 */
public class Test8 {
	public static void main(String[] args) {
//		int[] answer = solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3});
		int[] answer = solution(500, new int[] {500,420,3});
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	
	public static int[] solution(int N, int[] stages) {
		//�� ���������� ������ double �迭.
		double[] failArr = getFailArr(N, stages);
		
		//Map�� ����. key=������, value=stage. �ߺ��Ǵ� �������� �������� �ٿ��ֱ�.
        Map<Double, String> failMap = new HashMap<>();
        for(int i=0; i<failArr.length; i++) {
        	int stageN = i+1;
        	failMap.put(failArr[i], 
        			failMap.get(failArr[i]) != null ? 
        					failMap.get(failArr[i]) + "," + stageN : String.valueOf(stageN));
        }
        
        //�ߺ�����. ��������.
        failArr = Arrays.stream(failArr).distinct().sorted().toArray();
        
        //failArr �ڿ������� ������ ���
        StringBuilder sb = new StringBuilder();
        for(int i=failArr.length-1; i>=0; i--) {
        	sb.append(failMap.get(failArr[i]));
        	if(i!=0) {
        		sb.append(",");
        	}
        }
        
        //String to int[]
        return Stream.of(sb.toString().split(",")).mapToInt(Integer::parseInt).toArray();
    }
	
	public static double[] getFailArr(int N, int[] stages) {
		//������ ���� (���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� / ���������� ������ �÷��̾� ��) = n/t
		double[] result = new double[N];
		
		for(int stage=1; stage<=N; stage++) {
			int total=0,nonClear=0;
			for(int j=0; j<stages.length; j++) {
				if(stage <= stages[j]) {
					total++;
					if(stage >= stages[j]) {
						nonClear++;
					}
				}
			}
			if(total == 0) {
				result[stage-1] = 0;
			}else {
				result[stage-1] = (double) nonClear / total;
			}
		}
		
		return result;
	}
}
