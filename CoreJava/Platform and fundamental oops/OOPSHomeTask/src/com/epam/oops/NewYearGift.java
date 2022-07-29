package com.epam.oops;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class Sweet
{
	protected String name;
	protected int weight;
	protected int cost;
	public Sweet(String name, int weight, int cost)
	{
		this.name=name;
		this.weight=weight;
		this.cost=cost;
	}
	public int getCost()
	{
		return cost;
	}
	public int getWeight()
	{
		return weight;
	}
	
	public String toString()
	{
		return name+" "+weight+" "+cost;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}

class Chocolate extends Sweet
{
	String color;
	public Chocolate(String name,int weight,int cost,String color)
	{
		super(name,weight,cost);
		this.color=color;
	}
	public String toString()
	{
		return name+" "+weight+" "+cost+" "+color;
	}
	
}

class Candy extends Chocolate
{
	String shape;
	public Candy(String name,int weight,int cost,String color,String shape)
	{
		super(name,weight,cost,color);
		this.shape=shape;
	}
	public String toString()
	{
		return name+" "+weight+" "+cost+" "+color+" "+shape;
	}
}

class SortByCost implements Comparator<Sweet>
{
	public int compare(Sweet a,Sweet b)
	{
		return a.getCost()-b.getCost();
	}
}

public class NewYearGift {

	public static void main(String[] args) {
		
		ArrayList<Sweet> gift=new ArrayList<Sweet>();
		Sweet kalakand=new Sweet("Kalakand",100,200);
		Sweet dairymilk=new Chocolate("DairyMilk",50,100,"Brown");
		Sweet milkyBar=new Chocolate("MilkyBar",50,150,"white");
		Sweet fruitAndNut=new Chocolate("FruitAndNuts",100,250,"white");
		Sweet strawberry=new Chocolate("StrawBerry",50,150,"Red");
		Sweet germs=new Candy("Germs",20,50,"Multicolor","Round shape");
		Sweet lollipop=new Candy("Lollipop",20,50,"Multicolor","MultiShape");
		Sweet chewingGum=new Candy("ChewingGum",10,20,"Multicolor","Round shape");
		
		gift.add(chewingGum);
		gift.add(germs);
		gift.add(strawberry);
		gift.add(lollipop);
		gift.add(fruitAndNut);
		gift.add(milkyBar);
		gift.add(dairymilk);
		gift.add(kalakand);
		
		int totalWeight=0;
		for(Sweet s:gift)
		{
			totalWeight=totalWeight+s.getCost();
		}
		
		System.out.println("The total weight of gift is : "+totalWeight );
		
		Collections.sort(gift,new SortByCost());
		
		for(Sweet s: gift)
		{
			System.out.println(s.getCost()+" "+s.getName());
		}

	}

}
