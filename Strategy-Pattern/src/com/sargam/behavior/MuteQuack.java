package com.sargam.behavior;

public class MuteQuack implements QuackBehavior {
	
	public void quack()
	{
		System.out.println("Duck does not have quack sound.");
	}

}
