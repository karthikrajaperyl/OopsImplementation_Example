package Inheritance;
class Student
{
	private String name;
	Student(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}

interface Project 
{
	int projectTotalMarks=100;
	void setProjectMarks(int mark);
}

interface Theory
{
	int theoryTotalMarks=100;
	void setTheoryMarks(int mark);
}
class StudentResult extends Student implements Project,Theory
{
	private int theorymarks;
	private int projectMarks;
	StudentResult(String name)
	{
		super(name);
	}
	public void setTheoryMarks(int marks)
	{
		this.theorymarks=marks;
	}
	public void setProjectMarks(int marks)
	{
		this.projectMarks=marks;
	}
	public int getTotal()
	{
		return this.theorymarks+this.projectMarks;
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
	StudentResult resultObj=new StudentResult("XYZ");
	resultObj.setProjectMarks(100);
	resultObj.setTheoryMarks(100);
	System.out.println(resultObj.getTotal());
	}
}
