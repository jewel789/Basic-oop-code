import java.io.*;
import java.lang.*;
import java.awt.*;



class myclass{
		String name;
		int num;
		myclass(String name,int n){
				this.name=name;
				this.num=n;
			   System.out.println("name :"+name+" num :"+n);


		}

		myclass(int n){
			System.out.println("only number "+n);
		}

		myclass(){
			System.out.println("nothing defined in class ");
		}


}

class myclassmain{


	public static void main(String[] args) {
	
        myclass m1= new myclass("jewel",5);
        myclass m2=new myclass();
        myclass m3=new myclass(56);
        


	}



}