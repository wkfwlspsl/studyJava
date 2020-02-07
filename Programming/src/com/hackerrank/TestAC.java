package com.hackerrank;
/*
 * 퀸은 행렬대각선방향 갈수있고
 * 장애물 있으면 못감
 * 퀸이 갈수있는 칸 개수 리턴
 * 
 * timeout..
 */
public class TestAC {
	public static void main(String[] args) {
		System.out.println(queensAttack(5,3,4,3,new int[][] {{5,5},{4,2},{2,3}}));
//		System.out.println(queensAttack(4,0,4,4,new int[][] {});
	}
	
	public static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
		//n차 행렬, k개의 장애물, (r_q, c_q) 퀸의 위치, obstacles 장애물 위치
		int[][] board = new int[n][n];
		
		int q_x = Math.abs(n-r_q);
		int q_y = c_q-1;
		board[q_x][q_y] = 9;
		for(int i=0; i<obstacles.length; i++) {
			int x = Math.abs(n - obstacles[i][0]);
			int y = obstacles[i][1] - 1;
			board[x][y] = 1;
		}
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		/*
		 * 행이 1인거
		 * 열이 2인거
		 * 1,2
		 * 
		 * 0,1			0,3
		 * x-1, y-1		x-1, y+1
		 * x-2, y-2
		 * 
		 * 2,1			2,3
		 * x+1, y-1		x+1, y+1
		 * 3,0			3,4
		 * x+2, y-2		x+2, y+2
		 */
		int q = getQCnt(board, q_x, q_y);
		int p = getPCnt(board, q_x, q_y);
		int z = getZCnt(board, q_x, q_y);
		int m = getMCnt(board, q_x, q_y);
		int r = getRCnt(board, q_x, q_y);
		int c = getCCnt(board, q_x, q_y);
		
		return q+p+z+m+r+c;
    }
	//행
	public static int getRCnt(int[][] board, int q_x, int q_y) {
		int cnt=0;
		int x=q_x, y=q_y;
		
		y-=1;
		while(true) {
			if(y<0) {
				break;
			}
			if(board[x][y] != 1) {
				cnt++;
			}else {
				break;
			}
			y-=1;
			if(y<0) {
				break;
			}
		}
		y=q_y+1;
		while(true) {
			if(y>=board.length) {
				break;
			}
			if(board[x][y] != 1) {
				cnt++;
			}else {
				break;
			}
			y+=1;
			if(y>=board.length) {
				break;
			}
		}
		return cnt;
	}
	//열
	public static int getCCnt(int[][] board, int q_x, int q_y) {
		int cnt=0;
		int x=q_x, y=q_y;
		
		x-=1;
		while(true) {
			if(x<0) {
				break;
			}
			if(board[x][y] != 1) {
				cnt++;
			}else {
				break;
			}
			x-=1;
			if(x<0) {
				break;
			}
		}
		x=q_x+1;
		while(true) {
			if(x>=board.length) {
				break;
			}
			if(board[x][y] != 1) {
				cnt++;
			}else {
				break;
			}
			x+=1;
			if(x>=board.length) {
				break;
			}
		}
		
		return cnt;
	}
	//좌측위측
	public static int getQCnt(int[][] board, int q_x, int q_y) {
		int cnt=0;
		int x=q_x-1, y=q_y-1;
		while(true) {
			if(x<0 || y<0) {
				break;
			}
			if(board[x][y] != 1) {
				cnt++;
			}else {
				break;
			}
			x-=1;
			y-=1;
			if(x<0 || y<0) {
				break;
			}
		}
		return cnt;
	}
	//우측위측
	public static int getPCnt(int[][] board, int q_x, int q_y) {
		int cnt=0;
		int x=q_x-1, y=q_y+1;
		while(true) {
			if(x<0 || y>=board.length) {
				break;
			}
			if(board[x][y] != 1) {
				cnt++;
			}else {
				break;
			}
			x-=1;
			y+=1;
			if(x<0 || y>=board.length) {
				break;
			}
			
		}
		return cnt;
	}
	//좌측아래측
	public static int getZCnt(int[][] board, int q_x, int q_y) {
		int cnt=0;
		int x=q_x+1, y=q_y-1;
		while(true) {
			if(x>=board.length || y<0) {
				break;
			}
			if(board[x][y] != 1) {
				cnt++;
			}else {
				break;
			}
			x+=1;
			y-=1;
			if(x>=board.length || y<0) {
				break;
			}
		}
		return cnt;
	}
	//우측아래측
	public static int getMCnt(int[][] board, int q_x, int q_y) {
		int cnt=0;
		int x=q_x+1, y=q_y+1;
		while(true) {
			if(x>=board.length || y>=board.length) {
				break;
			}
			if(board[x][y] != 1) {
				cnt++;
			}else {
				break;
			}
			x+=1;
			y+=1;
			if(x>=board.length || y>=board.length) {
				break;
			}
		}
		return cnt;
	}
}
