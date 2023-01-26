import java.io.*;
import java.lang.*;
import java.awt.*;


class addition{

	public int add(int a, int b){
		return a+b;
	}
}


class Main{

    public int mult(int x,int y){
    	return x*y;
    }

	public static void main(String[] args) {
		int a=23;
		int b=123;
		addition m=new addition();
		int sum=m.add(a,b);
		System.out.println(sum);

		Main ob=new Main();
		sum=ob.mult(a,b);
		System.out.println(sum);


	}
}