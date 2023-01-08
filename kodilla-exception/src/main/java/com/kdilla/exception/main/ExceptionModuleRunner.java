package com.kdilla.exception.main;

import com.kdilla.exception.io.FileReader;
import com.kdilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {
    
    public static void main (String[] args){

        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile("names.txt");
        } catch (FileReaderException e){
            System.out.println("Problem with reading file");
        }
    }
}
