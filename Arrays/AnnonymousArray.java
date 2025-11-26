package com.Arrays;

public class AnnonymousArray {
	static void anonymous(int arr1[]) {
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
	public static void main(String[] args) {
		anonymous(new int[] {1,2,3,4,5});

	}

}
