package com.gqt.javacodes.Filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class file3program {

	public static void main(String[] args) throws IOException {
	String p1="C:\\fileprograms\\input2.txt";
	String p2="C:\\fileprograms\\output2.txt";
	FileReader fr=new FileReader(p1);
	BufferedReader br=new BufferedReader(fr);
	int temp;
	FileWriter fw=new FileWriter(p2);
	BufferedWriter bw=new BufferedWriter(fw);	
	
	while((temp=br.read())!=-1) {
		bw.write(temp);
	}
	br.close();
	bw.close();
	fw.close();
	fr.close();
	
	

	}

}
