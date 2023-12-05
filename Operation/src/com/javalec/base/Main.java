package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Addition;
import com.javalec.function.Division;
import com.javalec.function.Multiplication;
import com.javalec.function.Remainder;
import com.javalec.function.Subtraction;

public class Main {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		Addition addition = new Addition();
		Subtraction subtraction = new Subtraction();
		Multiplication multiplication = new Multiplication();
		Division division = new Division();
		Remainder remainder = new Remainder();
		
		
		System.out.print("첫번째 숫자를 입력하여 주세요");
		num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하여 주세요");
		num2 = scanner.nextInt();
		
		System.out.print("세번째 숫자를 입력하여 주세요");
		num3 = scanner.nextInt();
		
		System.out.println();
		
		
		
		
	}

}
