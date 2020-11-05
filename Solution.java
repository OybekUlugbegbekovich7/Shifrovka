package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    FileInputStream fileName = new FileInputStream(args[1]);
    FileOutputStream fileOutputName = new FileOutputStream(args[2]);

    byte[] array = new byte[fileName.available()];
    fileName.read(array);
    fileName.close();

    for (byte bayt : array)
    {
        if(args[0].equals("-e")){fileOutputName.write(bayt + 1);}
        if (args[0].equals("-d")){fileOutputName.write(bayt - 1);}
    }
    fileOutputName.close();
    }



}
