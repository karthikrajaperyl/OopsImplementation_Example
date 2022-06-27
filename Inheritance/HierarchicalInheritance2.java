package Inheritance;

class Television {
	int length;
	int breadth;
	int height;
	int volume;
	int maxVolume;
	Television(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public void incrementVolume() {
		if(volume<maxVolume)
		volume++;
	}

	public void decrementVolume() {
		if(volume>0)
		volume--;
	}
	
	public void setMaxVolume()
	{
		this.maxVolume=100;
	}
}

class LEDPlayer extends Television {
	int bright;
	LEDPlayer(int length, int breadth, int height) {
		super(length, breadth, height);
	}
	public void setMaxVolume()
	{
		maxVolume=50;
	}
	public void setMaxBightness()
	{
		this.bright=100;
	}
}

class LCDPlayer extends Television {
	int bright;
	LCDPlayer(int length, int breadth, int height) {
		super(length, breadth, height);
	}
	public void setMaxVolume()
	{
		maxVolume=50;
	}
	public void setMaxBrightness()
	{
		bright=100;
	}
}

public class HierarchicalInheritance2 
{
public static void main(String[] args)
{
	Television tempObj1=new LEDPlayer(10,10,10);
	Television tempObj2=new LCDPlayer(10,10,5);
	tempObj1.setMaxVolume();
	tempObj2.setMaxVolume();
	tempObj1.incrementVolume();
	tempObj2.incrementVolume();
	System.out.println(tempObj1.volume);
	System.out.println(tempObj2.volume);
}
}
