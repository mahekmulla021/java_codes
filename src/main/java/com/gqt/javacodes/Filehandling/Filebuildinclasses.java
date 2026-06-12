package com.gqt.javacodes.Filehandling;

import java.io.File;
import java.io.IOException;

public class Filebuildinclasses {

	public static void main(String[] args) throws IOException {
		String p1="C:\\fileprograms\\File1.txt";
        File f1=new File(p1);
        f1.createNewFile();//create the file specified in the path
        System.out.println(f1.exists());//check if the file in the path is present or not
        System.out.println(f1.canExecute());//check if the file have execute right or not
        System.out.println(f1.canWrite());//check if the file have write access or not
        System.out.println(f1.canRead());//check if the file have read access or not
        System.out.println(f1.getAbsoluteFile());//display the file path
        System.out.println(f1.getCanonicalPath());//display the file path
        System.out.println(f1.getFreeSpace());//display the space unallocated in bytes
        System.out.println(f1.getName());//display the file name
        System.out.println(f1.getParent());//display the root path
        System.out.println(f1.getPath());//display the file path
        System.out.println(f1.getTotalSpace());//display the space available in bytes
        System.out.println(f1.getUsableSpace());//display the usable space
        System.out.println(f1.hashCode());//unique value for the file object
        System.out.println(f1.isAbsolute());//check if it is an absolute path
        System.out.println(f1.isDirectory());//check is the path points to directory
        System.out.println(f1.isFile());//check if the path points to the file
        System.out.println(f1.isHidden());//check if the path points to hidden file
        File f2=new File("C:\\fileprograms\\hidden.txt");
        System.out.println(f2.isHidden());
        System.out.println(f1.lastModified());//last modified value in the term of long
        System.out.println(f1.length());//prints the total number of characters in the file
        File f3=new File("C:\\fileprograms\\File2.txt");
        System.out.println(f1.renameTo(f3));
        System.out.println(f1.exists());
	}

}
