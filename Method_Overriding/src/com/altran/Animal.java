package com.altran;

public class Animal {
	public void move() {
	      System.out.println("Animals can move");
	   }
	}
class Dog extends Animal {
	  public void move() {
	     System.out.println("Dogs can walk and run");
	  }
}
class Human extends Animal{
	public void move() {
		System.out.println("Human can talk, walk and run");
	}
}

