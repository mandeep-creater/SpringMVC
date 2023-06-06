package com.springcore.ci;

public class person {
	private String name;
	private int personId;
	private Certi certi;
	
	//declaration of constructor
	
	public person(String name , int personId, Certi certi)
	{
		this.name=name;
		this.personId=personId;
		this .certi=certi;
	}
	
	// Now we are calling the constructore means how we are print the Solution
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.personId+"{ "+this.certi.name +" }";
	}
	
	
	

}
