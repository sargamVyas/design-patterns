package com.producer.types;

import java.util.List;
import java.util.ArrayList;

public class Pizza {
	
	String name;
	String dough;
	String sauce;
	
	List<String> topping = new ArrayList<String>();
	
	public void prepare()
	{
		System.out.println("Preparing the pizza:"+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		
		for(String toppings:topping)
		{
			System.out.println(" " + toppings);
		}
	}
	
	public void bake()
	{
		System.out.println("Bake the pizza at 180C for 30 min");
	}
	
	public void cut()
	{
		System.out.println("Cutting the pizza into triangle shape");
	}

}
