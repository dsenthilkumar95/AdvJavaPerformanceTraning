package com.example.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class IOTest {

	int N = 100000;
	
	String file1 = "C:\\VODAFONE-JAVA-TUNING\\sts-workspace\\profiling-app\\books.txt";
	String file2 = "C:\\VODAFONE-JAVA-TUNING\\sts-workspace\\profiling-app\\javabooks.txt";

	public static void main(String[] s) {
		new IOTest();
	}

	public IOTest() {

		new Thread(() -> {
			serializeBookToFile();
		}).start();

		new Thread(() -> {
			serializeJavaBookToFile();
		}).start();
	}

	public void serializeBookToFile() {

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file1))) {

			for (int i = 0; i < N; i++) {
				objectOutputStream.writeObject(new Book("ISBN"+i,"Book-" + i, 500.00 + i,"Author"+i,"Publisher"+i,LocalDate.now(),true,500+1,50+1));
			}
			System.out.println("Serialization Done!!");
			// .close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void serializeJavaBookToFile() {

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file2))) {

			for (int i = 0; i < N; i++) {
				objectOutputStream.writeObject(new JavaBook("ISBN"+i,"Java Book-" + i, 500.00 + i,"Author"+i,"Publisher"+i,LocalDate.now(),true,500+1,50+1));
			}
			System.out.println("Serialization Done!!");
			// .close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}