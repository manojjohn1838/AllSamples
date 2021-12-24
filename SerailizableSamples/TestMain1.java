package SerailizableSamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			FileInputStream fileInStream=new FileInputStream("D:\\GitAllSamples\\new.txt");
			ObjectInputStream objInStream=new ObjectInputStream(fileInStream);
			SeraialSample s1=(SeraialSample) objInStream.readObject();
			System.out.println(s1.num1+"           "+s1.name);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
