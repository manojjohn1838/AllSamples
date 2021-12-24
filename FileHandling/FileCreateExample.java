package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateExample {
    public static void main(String[] args) throws IOException {
      //initialize File constructor
     File file=new File("D:\\GitAllSamples\\qwerty.txt");
    

		file.createNewFile();
		 
		System.out.println("File Created Successfully");
		
	
	
    }
  }