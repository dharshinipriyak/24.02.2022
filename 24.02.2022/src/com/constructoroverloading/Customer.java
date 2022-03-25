package com.constructoroverloading;

//Constructor overloading:constructor name is same but change in parameters
public class Customer 
{
	int CustomerId; 		//variables
	String CustomerName;

	static String ShopName;

	public Customer() 		//default construtors
	{ 
		CustomerId=5333;
		CustomerName="Jai";
	}
	public Customer(int CustomerId,String CustomerName) //Parameterized construtors
	{ 
		this.CustomerId=CustomerId;
		this.CustomerName=CustomerName;
	}
	static 					//blocks
	{
		ShopName="Amazon";
	}
	public void getCustomerInfo() 					//methods
	{
		System.out.println("***************");
		System.out.println("Customer Id : "+CustomerId);
		System.out.println("Customer Name : "+CustomerName);
		System.out.println("Shop Name : " +ShopName);
	}
	public static void main(String[] args) 			//main()
	{
		Customer c=new Customer(); 					//objects
		c.getCustomerInfo();

		Customer c1=new Customer(1991,"Varun");
		c1.getCustomerInfo();
	}

}

