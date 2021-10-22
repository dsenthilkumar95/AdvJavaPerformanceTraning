package com.example.io.logging;

public class LoggerTest {

	int N = 200000;
	
	CalculationService calculationService = new CalculationService();

	public static void main(String[] s) {
		new LoggerTest();
	}

	public LoggerTest() {

		new Thread(() -> {
			calculateSum();
		}).start();

		new Thread(() -> {
			calculateDiff();
		}).start();
	}

	public void calculateSum() {
		for (int i = 0; i < N; i++) {
			calculationService.doSum(10, 10);
		}
	}

	public void calculateDiff() {
		for (int i = 0; i < N; i++) {
			calculationService.doDiff(10, 10);
		}
	}

}