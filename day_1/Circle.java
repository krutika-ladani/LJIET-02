package day_1;

import java.util.*;

public class Circle {
	
	final double PI=3.14;
	double radius;
	double circumference;
	double area;
	
	void setRadius()
	{
		System.out.println("Enter the radius");
		Scanner sc=new Scanner(System.in);
		this.radius = sc.nextDouble();
	}
	void cal_circumference()
	{
		this.circumference = 2*PI*radius;
	}
	void cal_area()
	{
		this.area = PI*radius*radius;
	}
	
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.setRadius();
		c.cal_circumference();
		c.cal_area();
		System.out.println("Circumference of the cicle is "+ c.circumference);
		System.out.println("area of the cicle is "+ c.area);
	}
}


