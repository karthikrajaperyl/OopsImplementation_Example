import java.util.*;
class Montery extends MacVersion {
	private String name;

	Montery() {
		this.setReleaseName();
	}

	public void setReleaseName() {
		this.name = this.getClass().getName();
	}
	
	public void showReleaseName() {
		System.out.println(name);
	}

	public void showReleaseDate() {
		System.out.println("October 25, 2021");
	}

	public void showVersion() {
		System.out.println("MacOs 12");
	}

	public void showMemory() {
		System.out.println("64GB");
	}
	
	public void showStorage()
	{
		System.out.println("512GB, 1TB, 2TB, 4TB");
	}
	public void showFeatures()
	{
		System.out.println("It improve the stability, performance, or compatibility of your Mac ");
	}
}
class MonteryPro extends Montery
{
	private String name;
	private Date date;
	@Override
	public void showFeatures()
	{
		System.out.println("It show a Universal Control, AirPlay to Mac, Shortcuts application");
	}
	public void setReleaseName(String name,Date date)
	{
		this.name=name;
		this.date=date;
	}
	public String toString()
	{
		return "Name-"+this.name+"Date-"+this.date;
	}
}
