package java05_array.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Tmp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int l = sc.nextInt();
		
		ArrayList<Integer> answer = new ArrayList<>();
        
        int num = 5;
        int digit = 1;
        
        while(num <= l) {
        	if(num >= r) answer.add(num);
        	
        	int cnt = (int) (Math.pow(2, digit));
        	
        	for(int i = 0; i < cnt ; i++) {
        		
        	}
        }
        
        if(answer.isEmpty()) answer.add(-1);
        
        for(int i : answer) {        	
        	System.out.println(i);
        }
	}
}
