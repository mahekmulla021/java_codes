package com.gqt.javacodes.Filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file08program {

	public static void main(String[] args) throws IOException {
		String p1="C:\\fileprograms\\video1.mp4";
		String p2="C:\\fileprograms\\video10.mp4";
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
