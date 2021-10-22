package com.example.io.logging;

import java.util.logging.Logger;

public class CalculationService {
	
	Logger logger = Logger.getLogger(CalculationService.class.getName());

	public int doSum(int a, int b) {
		System.out.println(LogMessages.MESSAGE_FOR_SUM);
		return a + b;
	}

	public int doDiff(int a, int b) {
		logger.info("Inside CalculationService.doDiff()!!");
		return a - b;
	}
}