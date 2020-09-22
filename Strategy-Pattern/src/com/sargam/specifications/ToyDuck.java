package com.sargam.specifications;

import com.sargam.behavior.FlyNoWay;
import com.sargam.behavior.MuteQuack;

public class ToyDuck extends Duck{
	
	public ToyDuck()
	{
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	public void display()
	{
		System.out.println("I am a Toy Duck");
	}

}
