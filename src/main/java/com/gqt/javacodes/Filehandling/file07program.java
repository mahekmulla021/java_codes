package com.gqt.javacodes.Filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file07program {

	public static void main(String[] args) throws IOException {
		String p1="C:\\fileprograms\\dsa.pdf";
		String p2="C:\\fileprograms\\dsa1.pdf";
		FileInputStream fis=new FileInputStream(p1);
		BufferedInputStream br=new BufferedInputStream(fis);
		int temp;
		FileOutputStream fos=new FileOutputStream(p2);
		BufferedOutputStream bw=new BufferedOutputStream(fos);	
		
		while((temp=br.read())!=-1) {
			bw.write(temp);
		}
		br.close();
		bw.close();
		fis.close();
		fos.close();
		


	}

}
