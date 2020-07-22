package com.host.java8.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeDetails implements Externalizable{

	private String empName = "";
	private int empID = 0;
	private String empAddress = "" ;
	private String empBankDetails = "";
	private int expJobExperience = 0 ;
	private int empSalary = 0;
	private String empPassportDetails = "";
	private String empVisaDetails = "";
	private String empPanNo = "";
	private String empMobileNo = "";
	private String empSecondaryContactNo = "";
	
	
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		empName = (String) in.readObject();
		empID = (int) in.readInt();
		empMobileNo = (String) in.readObject();
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.empName);
		out.writeInt(this.empID);
		out.writeObject(this.empMobileNo);
		out.writeObject(this.empAddress);
		out.writeInt(this.empSalary);
		out.writeObject(this.empBankDetails);
		
		
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpId(int employeeid) {
		this.empID = employeeid;
	}
	
	public int getEmpID() {
		return empID;
	}
	
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public String getEmpAddress() {
		return empAddress;
	}
	
	public void setEmpMobileNo(String mobileNo) {
		this.empMobileNo = mobileNo;
	}
	
	public String getEmpMobileNo() {
		return empMobileNo;
	}
	
	public void setEmpSalary(int salary) {
		
		this.empSalary = salary;
	}
	
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpBankDetails(String bankDetails) {
		this.empBankDetails = bankDetails;
	}
	public String getEmpBankDetails() {
		return empBankDetails;
	}
	
	public String toString() {
		
		return "name =  "+ empName + ", empid= "+empID + ", empAddress = "+empAddress+", empMobileNo = "+empMobileNo+", empSalary = "+", empBankDetails = "+" ]";
	}
	
	
	
	
	

}
