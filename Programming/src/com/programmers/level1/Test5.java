package com.programmers.level1;

import java.util.Arrays;

/*
	�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.
	
	���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
	
	array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
	1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
	2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
	�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, 
	commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	
	���ѻ���
	array�� ���̴� 1 �̻� 100 �����Դϴ�.
	array�� �� ���Ҵ� 1 �̻� 100 �����Դϴ�.
	commands�� ���̴� 1 �̻� 50 �����Դϴ�.
	commands�� �� ���Ҵ� ���̰� 3�Դϴ�.
	
	����� ��
	array					commands							return
	[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
	
	����� �� ����
	[1, 5, 2, 6, 3, 7, 4]�� 2��°���� 5��°���� �ڸ� �� �����մϴ�. [2, 3, 5, 6]�� �� ��° ���ڴ� 5�Դϴ�.
	[1, 5, 2, 6, 3, 7, 4]�� 4��°���� 4��°���� �ڸ� �� �����մϴ�. [6]�� ù ��° ���ڴ� 6�Դϴ�.
	[1, 5, 2, 6, 3, 7, 4]�� 1��°���� 7��°���� �ڸ��ϴ�. [1, 2, 3, 4, 5, 6, 7]�� �� ��° ���ڴ� 3�Դϴ�.
*/
public class Test5 {
	public static void main(String[] args) {
		int[] result = solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
		for(int n : result) {
			System.out.println(n);
		}
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int idx=0; idx<commands.length; idx++) {
        	int[] command = commands[idx];
        	int i=command[0], j=command[1], k=command[2];
        	
        	//index�� 0���� �����ϹǷ� 1���� ��
        	int[] splitArr = getSplitArr(array, i-1,j-1);
        	Arrays.sort(splitArr);
        	answer[idx] = splitArr[k-1];
        }
        
        return answer;
    }
	
	public static int[] getSplitArr(int[] array, int startIdx, int endIdx) {
		int[] splitArr = new int[endIdx-startIdx+1];
		
		for(int i=0; i<splitArr.length; i++) {
			splitArr[i] = array[startIdx+i];
		}
		
		return splitArr;
	}
}

















