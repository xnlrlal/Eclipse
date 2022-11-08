package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("input3.txt");
		FileOutputStream fos = new FileOutputStream("output3.txt", true);
		try (fis) {
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
				System.out.print((char) i);
			}
			System.out.println("end");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
