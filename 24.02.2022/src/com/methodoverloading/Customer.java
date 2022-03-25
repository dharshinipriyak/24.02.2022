package com.methodoverloading;

	//method overloading 
public class Customer  
{
	int CustomerId; 		//variables
	String CustomerName;
	String CustomerAddress;
	static String ShopName;

	public Customer() 		//construtors
	{ 
		CustomerId=5333;
		CustomerName="Jai";
		CustomerAddress="Pondy";
	}
	static 					//blocks
	{
		ShopName="Amazon";
	}
	public void getCustomerInfo() 		//methods
	{
		System.out.println("***Customer details***");
		System.out.println("Customer Id : "+CustomerId);
		System.out.println("Customer Name : "+CustomerName);
		System.out.println("Customer Address : "+CustomerAddress);
		System.out.println("Shop Name : " +ShopName);
	}
	
	public void getCustomerInfo(int CustomerId,String CustomerName,String CustomerAddress) 				//methods
	{
		this.CustomerId=CustomerId;
		this.CustomerName=CustomerName;
		this.CustomerAddress=CustomerAddress;
		System.out.println("***Customer details***");
		System.out.println("Customer Id :   "+CustomerId);
		System.out.println("Customer Name : "+CustomerName);
		System.out.println("Customer Address : "+CustomerAddress);
		System.out.println("Shop Name :    " +ShopName);
	}
	public static void main(String[] args) 		//main()
	{
		Customer customer=new Customer(); 		//objects
		customer.getCustomerInfo();
		System.out.println("*************");
		
		customer.getCustomerInfo(4444,"Surya","Kerala");
	}

}

