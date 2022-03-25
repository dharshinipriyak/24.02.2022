package com.overriding;
//overriding
public class Organization {
	int Id;
	String Name;
	public Organization()
	{
		Id=6767836;
		Name="Oreo";
	}
	public void getInfo()
	{
		System.out.println("Organization Id  :" +Id);
		System.out.println("Organization Name:"+Name);
	}

}
