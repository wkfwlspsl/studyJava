package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

/*
 * 성적을 받아서 
 * 성적보다 큰 5의 배수까지 점수를 올려줄수 있는데
 * 원래 성적보다 3미만으로 차이나야 올려줌
 * 예를들면 73은 75로 올려줄수있음 (2차이 나서) 67은 70으로 못올림 (3차이 나서)
 * 근데 38보다 작으면  안올려줌
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
		 * 5로 나눈 나머지가 3이면 2++, 4면 1++
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











