package com.wipro.Patterns;

public class Patterns7 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int k=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
