package com.finalkeyword;
//parent,base,super class

public final class Organization //final keyword with class
{
	final int Id;
	final String Name;
	
	public Organization()
	{
		Id=414141;
		Name="Reliance";
	}
	public final void getInfo() //final keyword with method
	//final method cannot override into subclass
	{
		System.out.println("Organization Id  :" +Id);
		System.out.println("Organization Name:"+Name);

	}
}
