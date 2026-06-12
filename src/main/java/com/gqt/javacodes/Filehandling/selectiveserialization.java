package com.gqt.javacodes.Filehandling;
import java.io.*;

class Cricketer001 implements Serializable{
	String name;
	String country;
	transient int runs;
	int wickets;
	transient int catches;
	
	
	public Cricketer001(String name,String country,int runs,int wickets, int catches) {
		super();
		this.name=name;
		this.country=country;
		this.runs=runs;
		this.wickets=wickets;
		this.catches=catches;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(runs);
		System.out.println(wickets);
		System.out.println(catches);
	}
}

public class selectiveserialization{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Cricketer01 c1=new Cricketer01("rohit","india", 1300,10,150);
//		c1.display();
//		FileInputStream fis=new FileInputStream("C:\\fileprograms\\Cricketer.txt");
//		ObjectInputStream ois=new ObjectInputStream(fis);
//		ois.readObject();
//		fis.close();
//		ois.close();
		
		String p1="C:\\fileprograms\\Cricketer.txt";
		FileInputStream fis=new FileInputStream(p1);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cricketer001 c2=(Cricketer001)ois.readObject();
		c2.display();
		ois.close();
		fis.close();

		

	}

}
