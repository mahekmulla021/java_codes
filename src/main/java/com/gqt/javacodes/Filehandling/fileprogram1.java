package com.gqt.javacodes.Filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileprogram1 {

    public static void main(String[] args) throws IOException {

        String p1 = "C:\\fileprograms\\input.txt";
        String p2 = "C:\\fileprograms\\output.txt";

        FileInputStream fis = new FileInputStream(p1);
        FileOutputStream fos = new FileOutputStream(p2);

        int temp;

        while((temp = fis.read()) != -1)
        {
            fos.write(temp);
        }

        fis.close();
        fos.close();
    }
}