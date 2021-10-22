package com.example.perfromance._1;

public class StringsTest {

	int N = 50000;
	
	String firstName = "Bill ";
	String lastName = "Gates ";
	
	public static void main(String[] s) {
		new StringsTest();
	}

	public StringsTest() {

		new Thread(() -> {
			useString();
		}).start();

		new Thread(() -> {
			useStringBuffer();
		}).start();
		
		new Thread(() -> {
			useStringBuilder();
		}).start();
		
	}


	public void useCharArray() {
		char[] password = {'s','e','c','r','e','t'};
		System.out.println(password);
		String strPassword = "secret";
		System.out.println(strPassword);
		for(int idx=0;idx<password.length;idx++) {
			password[idx] = '0';
		}
		password = null;
		strPassword = null;
	}

	public void useString() {
		String resultString = "";
		for (int i = 0; i < N; i++) {
			resultString = resultString + firstName + lastName + " | ";
		}
	}

	public void useStringBuffer() {
		StringBuffer resultString = new StringBuffer();
		for (int i = 0; i < N; i++) {
			resultString.append(firstName).append(lastName).append(" | ");
		}
	}

	public void useStringBuilder() {
		StringBuilder resultString = new StringBuilder();
		for (int i = 0; i < N; i++) {
			resultString.append(firstName).append(lastName).append(" | ");
		}
	}

}