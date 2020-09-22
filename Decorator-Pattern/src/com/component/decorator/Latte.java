package com.component.decorator;

import com.sargam.component.Beverage;

public class Latte extends CondimentDecorator {
	
	Beverage beverage;
	
	public Latte(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	public double cost()
	{
		return beverage.cost() + 0.7;
	}
	
	public String getDescription()
	{
		return beverage.getDescription() + ", Latte";
	}

}
