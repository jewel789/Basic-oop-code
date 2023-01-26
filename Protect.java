import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.*;




class Base{

	protected void show(){

	   System.out.println("this is protected area in Base");

	}
}

public class Protect extends Base {  // inheritance 


	public static void main(String[] args) {
	
		Protect ob=new Protect();

		ob.show();
	}
}