package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

/*
 * ������ �޾Ƽ� 
 * �������� ū 5�� ������� ������ �÷��ټ� �ִµ�
 * ���� �������� 3�̸����� ���̳��� �÷���
 * ������� 73�� 75�� �÷��ټ����� (2���� ����) 67�� 70���� ���ø� (3���� ����)
 * �ٵ� 38���� ������  �ȿ÷���
 */
public class EasyAB {
	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		
		List<Integer> result = gradingStudents(grades);
		System.out.println(result);
	}
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
		/*
		 * 5�� ���� �������� 3�̸� 2++, 4�� 1++
		 */
		List<Integer> result = new ArrayList<>();
		for(int i=0; i<grades.size(); i++) {
			int grade = grades.get(i);
			if(grade >= 38) {
				switch(grade%5) {
				case 3:
					grade += 2;
					break;
				case 4:
					grade += 1;
					break;
				}
			}
			
			result.add(grade);
		}
		
		return result;
    }
}











