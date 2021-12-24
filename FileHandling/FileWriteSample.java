package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fileWriter=new FileWriter("D:\\GitAllSamples\\qwerty.txt");
			fileWriter.append("Hello World Java");
			fileWriter.write(" Welcome all");
			fileWriter.append("   qwertyuio");
			
		System.out.println("File Updated Successfully");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
