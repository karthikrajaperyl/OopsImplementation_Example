package Inheritance;
import java.util.*;
abstract class Shape
{
	private int length;
	private int breadth;
	private int height;
	Shape(int length,int breadth,int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public int getLength()
	{
		return length;
	}
	public int getbreadth()
	{
		return breadth;
	}
	public int getHeight()
	{
		return height;
	}
	abstract int calculateArea();
}
class Square extends Shape
{
	Square(int length,int breadth,int height)
	{
	  super(length,breadth,height);
	}
	public int calculateArea()
	{
		return getLength()*getLength();
	}
}
class Rectangle extends Shape
{
	Rectangle(int length,int breadth,int height)
	{
		super(length,breadth,height);
	}
	public int calculateArea()
	{
		return this.getLength()*this.getbreadth();
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Scanner scannerObj=new Scanner(System.in);
		int length=scannerObj.nextInt();
		int breadth=scannerObj.nextInt();
		int height=scannerObj.nextInt();
		Shape shapeObj=null;
		if((length==breadth)&&(breadth==height))
		{
			shapeObj=new Square(length,breadth,height);
		}
		else if(length != breadth)
		{
			shapeObj=new Rectangle(length,breadth,height);
		}
		else
			System.out.println("Enter the valid input");
		System.out.println(shapeObj.calculateArea());
	}
}
