import java.io.*;
import java.util.*;
import java.lang.*;



class   X{

	static int id=10;  // static variable 

	X(){ // constructor
		System.out.println(id);
		id++;
	}
}

public class Staticmain{

	public static void main(String[] args) {
		X ob1=new X();
		X ob2=new X();
		X ob3=new X();
	}
}
