package SerailSample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Movie m1=new Movie(101, "no way", "tamizh",2.5);
		Movie m2=new Movie(102, "no way home", "tamizh",2);
		FileOutputStream fileOutput=new FileOutputStream("D:\\GitAllSamples\\new1.txt");
		ObjectOutputStream out=new ObjectOutputStream(fileOutput);
		out.writeObject(m1);
		out.writeObject(m2);
		
		System.out.println("Serailized to new 1");

	}

}
