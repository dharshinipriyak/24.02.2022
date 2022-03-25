package com.supermethod;
//parent,base,super class
public class Organization 
{
	int Id;
	String Name;
	
	public Organization()
	{
		Id=414141;
		Name="Reliance";
		System.out.println("Organization class constructor defined");
	}
	public void getOrgInfo()
	{
		System.out.println("Organization Id  :" +Id);
		System.out.println("Organization Name:"+Name);

	}
}
