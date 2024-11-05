package ir.isc.training;

public class Matrix {
	public static void main(String[] args) {
		int n = 10;
		printMatrix(n);
	}
	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int)(Math.random()*2));
				
			}
			System.out.println();
		}
	
	
}}
