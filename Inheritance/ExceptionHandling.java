package Inheritance;
import java.util.*;
public class ExceptionHandling {
public void findDivision(int a,int b)
{
	if(b==0)
		throw new ArithmeticException();
}
public static void main(String[] args)
{
	Scanner scannerObj=new Scanner(System.in);
	ExceptionHandling tempObj=new ExceptionHandling();
	try
	{
		int a=scannerObj.nextInt();
		int b=scannerObj.nextInt();
		tempObj.findDivision(a,b);
		int age=scannerObj.nextInt();
	}
	catch(InputMismatchException e)
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println(e.toString());
	}
}
}
