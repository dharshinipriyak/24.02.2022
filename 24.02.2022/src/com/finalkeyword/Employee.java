/**
*package com.finalkeyword;

public class Employee extends Organization 
{
	int Id;  //variables
	String Name;
	double salary;         
	static String SectionName;

	public Employee()     //constructor
	{   
	Id=100;
	Name="Saro";
	salary=82000;
	}
	static					//blocks
	{
		SectionName="Packing";
	}
	//method return type is void
	public void getInfo() //overrides com.coVarientReturnType.Organization.getInfo
	{
		System.out.println("Id         :" +Id);
		System.out.println("Name       :"+Name);
		System.out.println("salary     :"+salary);
		System.out.println("SectionName:"+SectionName);
	}
	public static void main(String[] args) //main
	{
		Employee Emp=new Employee();     //object
		Emp.getInfo();
	}

}


*/