package com.programmers.level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
	�ڵ��׽�Ʈ ���� > Ž���(Greedy) > ü����
	
	���ɽð��� ������ ���, �Ϻ� �л��� ü������ �������߽��ϴ�. ������ ���� ü������ �ִ� �л��� �̵鿡�� ü������ �����ַ� �մϴ�. 
	�л����� ��ȣ�� ü�� ������ �Ű��� �־�, �ٷ� �չ�ȣ�� �л��̳� �ٷ� �޹�ȣ�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. 
	���� ���, 4�� �л��� 3�� �л��̳� 5�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. 
	ü������ ������ ������ ���� �� ���� ������ ü������ ������ ���� �ִ��� ���� �л��� ü�������� ���� �մϴ�.
	
	��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost, ������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��, 
	ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	
	���ѻ���
	��ü �л��� ���� 2�� �̻� 30�� �����Դϴ�.
	ü������ �������� �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
	������ ü������ ������ �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
	���� ü������ �ִ� �л��� �ٸ� �л����� ü������ ������ �� �ֽ��ϴ�.
	���� ü������ ������ �л��� ü������ ���������� �� �ֽ��ϴ�. 
	�̶� �� �л��� ü������ �ϳ��� �������ߴٰ� �����ϸ�, ���� ü������ �ϳ��̱⿡ �ٸ� �л����Դ� ü������ ������ �� �����ϴ�.
	
	����� ��
	n	lost	reserve		return
	5	[2, 4]	[1, 3, 5]	5
	5	[2, 4]	[3]			4
	3	[3]		[1]			2
*/
public class Test4 {
	public static void main(String[] args) {
		System.out.println(solution(3, new int[] {3}, new int[] {1}));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        setArray(lost, reserve, students);
        
        for(int i=0; i<students.length; i++) {
        	// �Ҿ�������� ��������
        	if(students[i] == 0) {
        		borrow(students, i);
        	}
        }
        
        List<Integer> stdList = Arrays.stream(students).boxed().collect(Collectors.toList());
        stdList = stdList.stream().filter(s -> s > 0).collect(Collectors.toList());
        return stdList.size();
    }

	// �л��� ü���� ��Ȳ ����
	private static void setArray(int[] lost, int[] reserve, int[] students) {
		Arrays.fill(students, 1);
        for(int i=0; i<lost.length; i++) {
        	students[lost[i]-1]--;
        }
        for(int i=0; i<reserve.length; i++) {
        	students[reserve[i]-1]++;
        }
	}
	
	// ��������
	public static void borrow(int[] students, int myNo) {
		int prevNo = myNo-1;
		int nextNo = myNo+1;
		
		//�տ� �л� Ȯ��
		if(prevNo >= 0) {
			if(students[prevNo] == 2) {
				students[prevNo]--;
				students[myNo]++;
				return ;
			}
		}
		
		//�ڿ� �л� Ȯ��
		if(nextNo < students.length) {
			if(students[nextNo] == 2) {
				students[nextNo]--;
				students[myNo]++;
				return;
			}
		}
	}
}
