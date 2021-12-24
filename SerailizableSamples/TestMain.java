package SerailizableSamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeraialSample sam1=new SeraialSample(10, "Manoj");
		
		try {
			FileOutputStream fileOutStream=new FileOutputStream("D:\\GitAllSamples\\new.txt");
			ObjectOutputStream objOutStream=new ObjectOutputStream(fileOutStream);
			objOutStream.writeObject(sam1);
			objOutStream.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
