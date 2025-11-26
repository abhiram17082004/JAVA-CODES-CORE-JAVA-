package com.Arrays;

public class MultiDimensionalArray {
	public static void main(String args[]){
		int arr2[][]= new int [3][4];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				arr2[i][j]=(int)(Math.random()*100);
				
				
			}
		
	}
		
		
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print(arr2[i][j]+ " ");
				
			}
			System.out.println();
		
	}
	
		for(int n[]:arr2) {
			for(int m:n) {
				System.out.print(m+ " ");
			}
			System.out.println();
		}
  }
}
