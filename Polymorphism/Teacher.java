package Polymorphism;
import java.util.Arrays;
import oops_Implementation.Person;
import oops_Implementation.Person.Gender;

class TeacherDetails extends Person {
		private String subjectName;
		private int experienceYear;
		private String[] subjects;
		public void setSubject(String subName) {
			this.subjectName = subName;
		}
		public void setSubject(String[] sub)
		{
			this.subjects=new String[sub.length];
			this.subjects=sub;
		}

		public String Teach() {
			return this.getName() + "-teaches-" + this.subjectName;
		}

		public String Teach(String[] str) {
			return this.getName() + "-teaches-" + Arrays.toString(str);
		}

		public void setExperienceYear(int year)
		{
			this.experienceYear=year;
		}
		public int getExperienceYear()
		{
			return this.experienceYear;
		}
		@Override
		public void showWork() {
			System.out.println("Has the work to teach");
		}
		public String toString()
		{
			return this.getName()+this.getExperienceYear()+this.gender;
		}
	}
	public class Teacher 
	{
	public static void main(String[] args)
	{
		//Scanner scannerObj=new Scanner(System.in);
		//String name=scannerObj.nextLine();
		String[] subject=new String[] {"Maths","Computer Science"};
		TeacherDetails teacherObj=new TeacherDetails();
		teacherObj.setName("xyz");
		teacherObj.setGender(Gender.Male);
		teacherObj.setBloodGroup("B+ve");
		teacherObj.setSubject("Maths");
		teacherObj.setSubject(subject);
		teacherObj.setExperienceYear(2);
		System.out.println(teacherObj.Teach());
		System.out.println(teacherObj.Teach(subject));
		System.out.println(teacherObj.toString());
		
	}
	}
