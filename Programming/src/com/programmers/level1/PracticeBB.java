package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > ����� ����
	
	���� ����
	����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�. 
	2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	��� arr1, arr2�� ��� ���� ���̴� 500�� ���� �ʽ��ϴ�.
	
	����� ��
	arr1			arr2			return
	[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
	[[1],[2]]		[[3],[4]]		[[4],[6]]
 */
public class PracticeBB {
	public static void main(String[] args) {
//		int[][] answer = solution(new int[][] {{1,2},{2,3}}, new int[][] {{3,4},{5,6}});
		int[][] answer = solution(new int[][] {{1},{2}}, new int[][] {{3},{4}});
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[i].length; j++) {
				System.out.print(answer[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][];
		for(int i=0; i<answer.length; i++) {
			answer[i] = new int[arr1[i].length];
		}
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}
