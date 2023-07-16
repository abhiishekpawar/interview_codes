package dsa_by_kk;

import java.util.Scanner;

public class MaxIn2DArrays {
	
	public static void main(String[] args) {
		
		int row = 3;
		int col = 4;
		int[][] arr = new int[row][col];
		Scanner sc = new Scanner(System.in);
		
		//adding
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println(max);
		
		
	}

}
