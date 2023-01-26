import java.io.*;
import java.lang.*;
import java.awt.*;



class Private{

	private int x;
	public int y;
 
	private Private(){}

	public Private(int a,int b){
		x=a;
		y=b;
	} 

}

public class PrivateMain{

	public static void main(String[] args) {
	  
	  // Private ob1=new Private();

	  Private ob2=new Private(12,313);

	 // System.out.println("int first "+ob2.x);
	  System.out.println("int second "+ob2.y);			

	}
}