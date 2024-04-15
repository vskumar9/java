package name;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		String fileName="C:\\Users\\HP\\Desktop\\student.bin";
		Student s = new Student(1001, "Ramkumar", 95, 9444005608l);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			oos.writeObject(s);
			System.out.println("Object serialized and save to file");
			
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
		try(ObjectInputStream ooi = new ObjectInputStream(new FileInputStream(fileName)))
		{
			 s = (Student) ooi.readObject();
			 
			 System.out.println(s);
		}
		catch(IOException | ClassNotFoundException e)
		{
			System.out.println(e);
		}
		

	}

}
