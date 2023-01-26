import java.io.*;
import java.lang.*;
import java.awt.*;




class Swapper {

     int a;
     int b;

     Swapper(int x,int y){
     	a=x;
     	b=y;
     }

     void swap(Swapper ref){
     	int tem=ref.a;
     	ref.a=ref.b;
     	ref.b=tem;
     }
  
   	public static void main(String[] args) {
   		
   		Swapper ob=new Swapper(12,10);
   		System.out.println("before swap "+ob.a+" "+ob.b);
   		ob.swap(ob);
   		System.out.println("after swap "+ob.a+" "+ob.b);


   	}
}