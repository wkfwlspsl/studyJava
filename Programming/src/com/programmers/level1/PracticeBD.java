package com.programmers.level1;

import java.util.Scanner;

/*
	�ڵ��׽�Ʈ ���� > �������� > ���簢�� �����
	
	���� ����
	�� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
	��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.
	
	���� ����
	n�� m�� ���� 1000 ������ �ڿ����Դϴ�.
	
	����
	�Է�
	5 3
	
	���
	*****
	*****
	*****
 */
public class PracticeBD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
