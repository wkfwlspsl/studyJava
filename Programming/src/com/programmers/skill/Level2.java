package com.programmers.skill;

import java.util.Objects;

/*
1�� 0�� ä���� ǥ(board)�� �ֽ��ϴ�. ǥ 1ĭ�� 1 x 1 �� ���簢������ �̷���� �ֽ��ϴ�. 
ǥ���� 1�� �̷���� ���� ū ���簢���� ã�� ���̸� return �ϴ� solution �Լ��� �ϼ��� �ּ���. (��, ���簢���̶� �࿡ ������ ���簢���� ���մϴ�.)

���� ���

1	2	3	4

0	1	1	1
1	1	1	1
1	1	1	1
0	0	1	0
�� �ִٸ� ���� ū ���簢����

1	2	3	4

0	1	1	1
1	1	1	1
1	1	1	1
0	0	1	0
�� �Ǹ� ���̴� 9�� �ǹǷ� 9�� ��ȯ�� �ָ� �˴ϴ�.

���ѻ���
ǥ(board)�� 2���� �迭�� �־����ϴ�.
ǥ(board)�� ��(row)�� ũ�� : 1,000 ������ �ڿ���
ǥ(board)�� ��(column)�� ũ�� : 1,000 ������ �ڿ���
ǥ(board)�� ���� 1�Ǵ� 0���θ� �̷���� �ֽ��ϴ�.

����� ��
board										answer
[[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]	9
[[0,0,1,1],[1,1,1,1]]						4

����� �� ����
����� �� #1
���� ���ÿ� �����ϴ�.

����� �� #2
| 0 | 0 | 1 | 1 |
| 1 | 1 | 1 | 1 |
�� ���� ū ���簢���� ���̴� 4�� �ǹǷ� 4�� return�մϴ�.
 */
public class Level2 {
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {
												{0,0,0,0}
											   ,{0,0,0,0}
											   ,{0,0,0,0}
											   ,{0,0,0,0}}));
	}
	
	public static int solution(int [][]board) {
		int max = 0;
		int[][] copyBoard = new int[board.length][board[0].length];
		if(Objects.deepEquals(copyBoard, board)) {
			return 0;
		}
		
		for(int i=1; i<board.length; i++) {
			for(int j=1; j<board[i].length; j++) {
				if(board[i][j] == 0) {
					continue;
				}
				int min = Math.min(board[i-1][j], Math.min(board[i][j-1], board[i-1][j-1]));
				board[i][j] = min + 1;
				
				max = Math.max(board[i][j], max);
			}
		}
		
		return max == 0 ? 1 : max*max;
    }
}
















