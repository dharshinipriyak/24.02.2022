package com.supermethod;

public class Employee extends Organization 
{
	int Id;  //variables
	String Name;
	double salary;         
	static String SectionName;

	public Employee()     //constructor
	{   
	super(); //calls super class constructor
	Id=100;
	Name="Sanjay";
	salary=89200;
	System.out.println("Employee class Constructor defined");
	}
	static					//blocks
	{
		SectionName="Quality checking";
	}
	//method 
	public void getInfo()
	{
		System.out.println("Id         :" +Id);
		System.out.println("Name       :"+Name);
		System.out.println("salary     :"+salary);
		System.out.println("SectionName:"+SectionName);
		System.out.println("Id         :" +super.Id);
		System.out.println("Name       :"+super.Name);
	}
	public static void main(String[] args) //main
	{
		Employee Emp=new Employee();     //object
	}

}

