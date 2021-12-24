package SerailSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.function.ObjIntConsumer;

public class TestMain1 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fileInput=new FileInputStream("D:\\GitAllSamples\\new1.txt");
		
		ObjectInputStream objIn=new ObjectInputStream(fileInput);
		
		Movie m1=(Movie)objIn.readObject();
		//m1=(Movie) objIn.readObject();
		System.out.println(m1.name+   "    "+m1.id+"   "+m1.rating);
		m1=(Movie) objIn.readObject();
		System.out.println(m1.name+   "    "+m1.id+"   "+m1.rating);
		
	}
	
	

}
