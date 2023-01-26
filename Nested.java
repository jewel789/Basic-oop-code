import java.util.*;
import java.io.*;



class Outer {

	static int x=10;

	static class Inner{ // nested class must be  static 

		int y=12;
		public void show (){

			System.out.println(" ok in nested class");

		}
	}
}



public class Nested{

	public static void main(String[] args) {
		Outer.Inner ob = new Outer.Inner();// creating nested class 
		ob.show();
	}

	
}