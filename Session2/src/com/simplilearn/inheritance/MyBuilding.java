package com.simplilearn.inheritance;

public class MyBuilding implements BuildingInterface{

	@Override
	public void RK() {
		System.out.println("Room Kitchen");
		
	}

	@Override
	public void OneBHK() {
		System.out.println("one bed room");
		
	}

	@Override
	public void TwoBHK() {
		System.out.println("two bed room");
		
	}

	@Override
	public void ThreeBHK() {
		System.out.println("three bed room");
		
	}

}
