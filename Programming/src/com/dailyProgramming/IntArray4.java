package com.dailyProgramming;
/*
	����(interval)�� �̷���� �迭�� �־�����, ��ġ�� ���� ���ҵ��� ��ģ ���ο� �迭�� ����ÿ�. 
	������ ���۰� ������ �̷���� ������ ������ ������ �۰ų� �����ϴ�.
	
	Given a list of intervals, merge intersecting intervals.
	
	����)
	Input: {{2,4}, {1,5}, {7,9}}
	Output: {{1,5}, {7,9}}
	
	Input: {{3,6}, {1,3}, {2,4}}
	Output: {{1,6}}
 */
public class IntArray4 {
	public static void main(String[] args) {
		int[][] result = solution(new int[][] {{2,4}, {1,5}, {7,9}});
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.println(result[i][j]);
			}
		}
	}
	
	public static int[][] solution(int[][] arr){
		return null;
	}
}
