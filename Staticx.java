import java.io.*;
import java.util.*;


class St {

	static int x;
	int y=10;

	static void display(){

		System.out.println("static variable in static methods "+x);
	}

	public void show (){
		System.out.println("No Static variable in non methods "+ y);
		System.out.println("Static in non static methods "+x);

	}

}


public class Staticx{
	public static void main(String[] args) {
			St ob=new St();
			St.display(); //static methods without object just using class 
			ob.show();
	}
		


}