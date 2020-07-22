package com.host.java8.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaSerialization {

	public static void main(String[] args) {
		
		
		try {
			
				JavaSerialization javaSerialization = new JavaSerialization();
				
				AccountDetails accDetails = new AccountDetails();
				
				accDetails.setUserName("JACK");
				
				accDetails.setEmailID("jack@mail.com");
				
				accDetails.setUserPassword("Test@123");
				
				File filePath = new File("C:\\Users\\sparimi\\Desktop\\accDetails.ser");
				
				//Serialization
				//javaSerialization.setSerialization(accDetails, filePath);
				
				
				//deserializtion
				AccountDetails savedAccDetails = javaSerialization.deSerialization(filePath);
				System.out.println("Saved Account Details : "+savedAccDetails);
				
				
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public void setSerialization(AccountDetails accDetails, File filePath) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(accDetails);
		objectOutputStream.close();
	}

	public AccountDetails deSerialization(File filePath) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		AccountDetails accDetails = (AccountDetails) objectInputStream.readObject();
		objectInputStream.close();
		return accDetails;
	}
}
