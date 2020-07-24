/*In another package com.test, create a class that imports the above package and instantiates an object of the Square class 
and an object of the Rectangle class. 
Call the methods on each of the classes to calculate the area and perimeter given the side 
and the length/breadth of the Square class and the Rectangle class respectively.*/




package InterfaceMain;
import Interface.*;
public class Main {

	public static void main(String[] args)
	{
		Square s= new Square(2.2f);
		s.calcArea();
		
		Rectangle r= new Rectangle(2.2f,3.3f);
		r.calcPeri();
	}
}
