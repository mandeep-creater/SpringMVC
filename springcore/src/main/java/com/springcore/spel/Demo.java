package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("object")
public class Demo {
	
	@Value("#{22+18}")
	private int x;
	
	@Value("#{36+37}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	// how to invoke create object
	
	@Value("#{new java.lang.String('Mandeep Singh')}")
	private String name;
	
	@Value("#{8-3>2}")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	
	
	


	
	
}
