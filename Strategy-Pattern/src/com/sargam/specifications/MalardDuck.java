package com.sargam.specifications;

import com.sargam.behavior.FlyWithWings;
import com.sargam.behavior.QuackSound;

public class MalardDuck extends Duck{

	public MalardDuck()
	{	
		flyBehavior = new FlyWithWings();
		quackBehavior = new QuackSound();
	}
	
	public void display()
	{
		System.out.println("I am a Malard Duck");
	}
}
