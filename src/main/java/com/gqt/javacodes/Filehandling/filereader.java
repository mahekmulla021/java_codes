package com.gqt.javacodes.Filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filereader {

	public static void main(String[] args) {
	try {
		String p1="C:\\fileprograms\\file.txt";
		FileWriter fw=new FileWriter(p1);
		fw.write("Hello Welcome to GQT");
		fw.close();
		System.out.println("Reading the data from the file:");
		FileReader fr=new FileReader(p1);
		Scanner sc=new Scanner (fr);
		while(sc.hasNextLine()) {
			String temp=sc.next();
			System.out.print(temp);
			}
		sc.close();
		fr.close();
		}
	catch(IOException e) {
		e.printStackTrace();
	}

	}

}
