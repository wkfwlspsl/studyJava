package com.programmers.level1;

import java.util.LinkedList;
import java.util.List;

/*
	�ڵ��׽�Ʈ ���� > �������� > ���� ���ڴ� �Ⱦ�

	���� ����
	�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
	�̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
	��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. 
	
	���� ���,
	arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
	arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
	�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
	
	���ѻ���
	�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
	�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
	
	����� ��
	arr	answer
	[1,1,3,3,0,1,1]	[1,3,0,1]
	[4,4,4,3,3]	[4,3]
	
	����� �� ����
	����� �� #1,2
	������ ���ÿ� �����ϴ�.
 */

public class Practice3 {
	public static void main(String[] arg) {
		int[] result = solution(new int[] {1,1,3,3,0,1,1});
		for(int n : result) {
			System.out.println(n);
		}
	}
	
	public static int[] solution(int []arr) {
        List<Integer> list = new LinkedList<>();
        int temp = -1;
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] != temp) {
        		temp = arr[i];
        		list.add(arr[i]);
        	}
        }
        
        return list.stream().mapToInt(i->i).toArray();
	}
}
