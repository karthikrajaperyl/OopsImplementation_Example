package Inheritance;
class Box
{
	private int length;
	private int width;
	private int height;
	int volume;
	Box(int length,int width,int height)
	{
		this.length=length;;
		this.width=width;
		this.height=height;
	}
	void calculateVolume(int length,int width,int height)
	{
		volume= height*length*width;
	}
}
class BoxWeight extends Box
{
	BoxWeight(int length,int width,int height)
	{
		super(length,width,height);
	}
	public int getWeightCost()
	{
		if(volume<100)
			return 1000;
		else
			return 5000;
	}
}
class ShipmentCost extends BoxWeight
{
	int cost;
	ShipmentCost(int length,int width,int height,int cost)
	{
		super(length,width,height);
		this.cost=cost;
	}
	
	public int getCost()
	{
		return cost;
	}
}
public class MultilevelInheritance2 {
public static void main(String[] args)
{
	ShipmentCost shipObj=new ShipmentCost(5,5,5,1000);
	System.out.println(shipObj.getCost()+shipObj.getWeightCost());
	
}
}
