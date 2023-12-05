package com.javalec.function;

public class Remainder {// 대근
	// Field
	
	// Constructor
	public Remainder() {
		
	}
	// Method
	public int[] Remainder(int num1, int num2, int num3) {
		int[] result = new int[2];
		result[0] = num1 % num2;
		result[1] = num2 % num3;
		return result;
	}
}
