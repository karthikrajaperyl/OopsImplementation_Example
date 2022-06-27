package Inheritance;
import java.util.*;
class Food
{
	private String name;
	private int prize;
	private boolean veg;
	Food(String name,int prize,boolean veg)
	{
		this.name=name;
		this.prize=prize;
		this.veg=veg;
	}
	public String getName()
	{
		return name;
	}
	public int getPrize()
	{
		return prize;
	}
	public boolean knowVeg()
	{
		return veg;
	}
	public String toString()
	{
		return "Name-"+this.name+"Prize-"+this.prize+"Veg-"+this.knowVeg();
	}
	public void showList(List<String> foodList)
	{
		System.out.println(foodList);
	}
}
class ChineseFood extends Food
{
	ChineseFood(String name,int prize,boolean veg)
	{
		super(name,prize,false);
	}
	public void showAvailableTime()
	{
		//int prize=super.getPrize();
		System.out.println("Till evening 5.00PM");
	}
	public void showList(List<String> foodList)
	{
		System.out.println(foodList);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		List<String> chineseSidedishesList=new ArrayList<>();
		chineseSidedishesList.add("Veg Masala");
		chineseSidedishesList.add("Mushroom recipe");
		ChineseFood ChineseFoodObj=new ChineseFood("Veg Noodles",100,true);
		System.out.println(ChineseFoodObj.toString());
		ChineseFoodObj.showAvailableTime();
		ChineseFoodObj.showList(chineseSidedishesList);
		List<String> sideDishes=new ArrayList<>();
		sideDishes.add("Samber");
		sideDishes.add("Mushrooom recipe");
		sideDishes.add("Rasam");
		Food foodObj=new Food("Rice",100,true);
		foodObj.showList(sideDishes);
	}
}
