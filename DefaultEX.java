import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.*;




class Default{

	int x=2324;// default data 

}

public class DefaultEX{
	public static void main(String[] args) {
		Default ob=new Default();
		System.out.println(ob.x);// default data outside the class but in same package
	}
}