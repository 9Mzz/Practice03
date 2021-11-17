package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
	
		int  x, y;
		for (x=0; x<4; x++) {
			for(y=2; y>=0; y--) {
				System.out.print("*"); // x의 *가 3(2,1,0), y의 *가 4(3,2,1,0)칸 
			}
			System.out.println("");
		}
	}
}
