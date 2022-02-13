package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
	
	public DeserializeEmployee() {
		Employee e = null;
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"))){
			e = (Employee) ois.readObject();
		}catch(IOException ex) {
			ex.printStackTrace();
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("Deserialized Object from employees.ser");
		System.out.println("Employee: " + e);
	}

	public static void main(String[] args) {
		new DeserializeEmployee();

	}

}
