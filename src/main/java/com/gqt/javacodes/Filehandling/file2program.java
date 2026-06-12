package com.gqt.javacodes.Filehandling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class file2program {

	public static void main(String[] args) throws IOException {
	String p1="C:\\fileprograms\\input1.txt";
	String p2="C:\\fileprograms\\output1.txt";
	FileReader fr=new FileReader(p1);
	int temp;
	FileWriter fw=new FileWriter(p2);
	
	
	while((temp=fr.read())!=-1) {
		fw.write(temp);
	}
	fw.close();
	fr.close();
	
	

	}

}
