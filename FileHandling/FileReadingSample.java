package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReadingSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fileReader=new FileReader("D:\\GitAllSamples\\Sample.txt");
			char [] charArray=new char[50];
			System.out.println((char)fileReader.read());
			System.out.println(fileReader.read(charArray));
			System.out.println(charArray);
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
