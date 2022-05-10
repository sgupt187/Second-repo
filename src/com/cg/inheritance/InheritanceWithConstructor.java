package com.cg.inheritance;

class Base{
	int x;
	Base(){
		System.out.println("Its Base class");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
}

class Derived{
	int y;
	Derived(){
		super();
		 System.out.println("hi");
		 System.out.println("bye");
	}
	Derived (int y){
		super();
		System.out.println("Y "+y);
	}
	
	
   
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
public class InheritanceWithConstructor {

	public static void main(String[] args) {
		Derived d = new Derived(8);
		Base b = new Base();
		

	}

}
