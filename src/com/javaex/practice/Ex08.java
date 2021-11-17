package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int y;
			int x;

		
			for (y=1; y<=9; y++) { //y축출력
				for(x=2; x<=9; x++) {	//x축출력
					int result = (y*x);
					System.out.print(x+"*"+y+"="+result+"\t");
				}
				System.out.println("");	//공백출력
			}

		
		sc.close();
	}

}
