package com.superkeyword;
//parent,base,super class
public class Organization 
{
	int Id;
	String Name;
	
	public Organization()
	{
		Id=414141;
		Name="Reliance";
	}
	public void getInfo()
	{
		System.out.println("Organization Id  :" +Id);
		System.out.println("Organization Name:"+Name);

	}
}
