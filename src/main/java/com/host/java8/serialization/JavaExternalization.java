package com.host.java8.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaExternalization {

	public static void main(String[] args) {
		
		try {
		JavaExternalization javaExternalization = new JavaExternalization();
		
		EmployeeDetails empDetails = new EmployeeDetails();
		
		empDetails.setEmpName("jack");
		empDetails.setEmpId(1234);
		empDetails.setEmpAddress("CA, USA");
		empDetails.setEmpMobileNo("217090080");
		empDetails.setEmpSalary(70000);
		empDetails.setEmpBankDetails("Yes Bank");	
		
		javaExternalization.externalization(empDetails);
		
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void externalization(EmployeeDetails empDetails) throws IOException, ClassNotFoundException {
		
		File filePath = new File("C:\\Users\\sparimi\\Desktop\\empDetails.ser");
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(empDetails);
		objectOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		EmployeeDetails empSavedData = (EmployeeDetails) objectInputStream.readObject();
		objectInputStream.close();
		
		System.out.println("Employee Serialized Data : "+empSavedData);
		
		
	}

}
