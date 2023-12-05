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
		int sum = 0;
		int sub = 0;
		int multiple = 0;
		int div = 0;
		int[] rem;
		
		Scanner scanner = new Scanner(System.in);
		Addition addition = new Addition();
		Subtraction subtraction = new Subtraction();
		Multiplication multiplication = new Multiplication();
		Division division = new Division();
		Remainder remainder = new Remainder();
		
		
		System.out.print("첫번째 숫자를 입력하여 주세요 : ");
		num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하여 주세요 : ");
		num2 = scanner.nextInt();
		
		System.out.print("세번째 숫자를 입력하여 주세요 : ");
		num3 = scanner.nextInt();
		
		//합ad
		sum = addition.sumCalc(num1, num2, num3);
		System.out.println("입력된 숫자의 전체 덧셈 : " + sum);
		
		//차
		sub = subtraction.Subtraction(num1, num2, num3); 
		System.out.println("입력된 숫자의 전체 뺄셈 : " + sub);
		
		//곱
		multiple = multiplication.calMul(num1, num2, num3);
		System.out.println("입력된 숫자의 전체 곱 : " + multiple);
		
		//나눗셈
		div = division.divCalc(num1, num2, num3);
		System.out.println("입력된 숫자의 전체 나눗셈의 몫 : " + (double)div);
		
		//나눗셈의 나머지
		rem = remainder.Remainder(num1, num2, num3);
		System.out.println(num1 + " % " + num2 + "의 나눈 나머지 : " + rem[0]);
		System.out.println(num2 + " % " + num3 + "의 나눈 나머지 : " + rem[1]);
				
	}

}
