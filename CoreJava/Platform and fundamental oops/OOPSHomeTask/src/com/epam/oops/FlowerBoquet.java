package com.epam.oops;

import java.util.Collections;
import java.util.ArrayList;

class Flower
{
	protected int cost;
	protected String name;
	public Flower(int cost,String name)
	{
		this.cost=cost;
		this.name=name;
	}
	
	public int getCost()
	{
		return cost;
	}
	public String getName()
	{
		return name;
	}	
	public String toString()
	{
		return name+" "+cost;
	}
}

class Rose extends Flower
{
	String color;
	public Rose(int cost,String name,String color)
	{
		super(cost,name);
		this.color=color;
	}
	
	public String toString()
	{
		return name+" "+color+" "+cost;
	}
}

public class FlowerBoquet {

	public static void main(String[] args) {
		
		ArrayList<Flower> boquet=new ArrayList<Flower>();
		
		Flower lilly=new Flower(50,"Lilly");
		Flower carnation=new Flower(100,"Carnation");
		Flower gerbera=new Flower(30,"Gerbera");
		Flower gladiolus=new Flower(70,"Gladiolus");
		boquet.add(lilly);
		boquet.add(carnation);
		boquet.add(gerbera);
		boquet.add(gladiolus);
		
		Flower redRose=new Rose(80,"Rose","red");
		Flower whiteRose=new Rose(100,"Rose","white");
		Flower yellowRose=new Rose(110,"Rose","yellow");
		Flower pinkRose=new Rose(90,"Rose","pink");
		
		boquet.add(redRose);
		boquet.add(whiteRose);
		boquet.add(yellowRose);
		boquet.add(pinkRose);
		
		int totalCost=0;
		for(Flower f:boquet)
		{
			totalCost+=f.getCost();
			System.out.println(f);
		}
		
		System.out.println("Total cost of boquet is : "+totalCost);

	}

}
