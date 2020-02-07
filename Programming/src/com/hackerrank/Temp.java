package com.hackerrank;

public class Temp {
	public static void main(String[] args) {
//		System.out.println(appendAndDelete("aba", "aba", 7));
//		System.out.println(appendAndDelete("ashley", "ash", 2));
//		System.out.println(appendAndDelete("y", "yu", 2));
		System.out.println(appendAndDelete("abcd", "abcdert", 10));
		
        
    }
	public static String appendAndDelete(String s, String t, int k) {
        int ss = (s.length() > t.length()) ? t.length() : s.length();
        int eql = 0;
        for(int i = 0; i <= ss; i++){
            if(s.substring(0,i).equals(t.substring(0,i))){
                eql = i;
            }
        }
        int te = (s.length()+t.length()-2*eql);
        if((s.length()+t.length()-2*eql)>k){
            return "No";
        }
        else if((s.length()+t.length()-2*eql)%2==k%2){
        	return "Yes";
        }
        else if((s.length()+t.length()-k)<0){
        	return "Yes";
        }
        else{
        	return "No";
        }
	}
}
