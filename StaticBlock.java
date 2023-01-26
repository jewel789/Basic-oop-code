import java.io.*;
import java.util.*;

 // first of all, compiler execute static-bock then main funct
class StaticBlock{
      
      StaticBlock(){
      	System.out.print("this is constructor");
      }

	static {
          System.out.println("first static block ");


	}
	static void show (){
		System.out.println("inside the methods ");

	}
	static{
		System.out.println("second static block ");
		show();
	}

   public static void main(String[] args) {
   	   // StaticBlock object= new StaticBlock();
   	  System.out.println(" print main fuction ");

   }

   static {
   	 System.out.println("Static after the main the main ");
   }

}