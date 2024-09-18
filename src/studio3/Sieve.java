package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is n: ");
		int n = in.nextInt();
		boolean[] primeness = new boolean[n];
				
		
		
		 
		 
		int[] numSet = new int[n];
		for (int i = 0; i < n; i++)
		{
			
			int r = i;
		numSet[r] = 2+r;
		
		} 
		
		int x = 0; 
		while (x < n) {
		
		int p = numSet[x];
		
		for(int value: numSet) {
			
		int h = (value)*(p); 
			
		
			primeness[h] = true; 
			
			System.out.println(primeness[h] + "| value is: " + value + "| h is "   + h );
			
		}
		
		
		
		
		/*
		for (int x = 0; x < numSet.length; x++) {
	         
			System.out.print(numSet[x] + ", ");
        }
		*/
		
		x+=1;
		
		}}

}
