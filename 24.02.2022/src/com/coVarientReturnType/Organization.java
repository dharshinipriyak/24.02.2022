package com.coVarientReturnType;
//Inheritance
public class Organization 
{
	int Id;
	String Name;
	public Organization()
	{
		Id=6767836;
		Name="Oreo";
	}
	public Organization getInfo()
	{
		System.out.println("Organization Id  :" +Id);
		System.out.println("Organization Name:"+Name);
		return null;
	}
}
