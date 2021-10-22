package com.example.memory.leak.small.objects;

public class CalculatorService {

	public void doSum(int i, int j) {
		System.out.println("SUM : " + (i + j));
	}

	public void doDiff(int i, int j) {
		System.out.println("DIFF : " + (i - j));
	}

}
