package com.ifnoelse.se.io.readerwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriter {

	public static void main(String[] args) throws Exception {
		File directory = new File("");//����Ϊ��
		String courseFile = directory.getCanonicalPath() ;
		String readTail = "/src/com/ifnoelse/se/io/readerwriter/BufferedReaderWriter.java";
		String writeTail = "/src/com/ifnoelse/se/io/readerwriter/BufferedReaderWriter.txt";
		File fileRead = new File(courseFile + readTail);
		File fileWrite = new File(courseFile + writeTail);

		FileReader fileReader = new FileReader(fileRead);
		FileWriter fileWriter = new FileWriter(fileWrite);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		String line = bufferedReader.readLine();
		while (line != null) {
			bufferedWriter.write(line);
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		bufferedWriter.flush();
		bufferedWriter.close();
		bufferedReader.close();
	}

}
