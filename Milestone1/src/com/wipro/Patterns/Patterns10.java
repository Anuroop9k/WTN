package com.wipro.Patterns;

public class Patterns10 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(n-i+" ");
			}
			System.out.println();
		}
	}
}
