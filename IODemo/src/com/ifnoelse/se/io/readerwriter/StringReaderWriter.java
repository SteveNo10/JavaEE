package com.ifnoelse.se.io.readerwriter;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderWriter {

	public static void main(String[] args) {
		StringReader stringReader = new StringReader("aaabbbcccdddeeefffggghhhiiijjjkkklllmmmnnn");
		int temp;
		try {
			System.out.println(stringReader.markSupported());
			final int marklen = 15;
			if (stringReader.markSupported()) {
				stringReader.mark(marklen);
				for (int i=0; i<marklen; i++) {
					int marktemp = stringReader.read();
					System.out.print((char)marktemp);
				}
				stringReader.reset();
			}
			stringReader.skip(3);
			temp = stringReader.read();
			while(temp != -1) {
				System.out.print((char)temp);
				temp = stringReader.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
