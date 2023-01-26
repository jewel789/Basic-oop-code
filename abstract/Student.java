import java.util.*;
import java.lang.*;


abstract class Man{

		public String name="Jewel Miah";
		public int age =24;
		public abstract void study(); // abstract methods can only in abstract class

}


public class Student extends Man{

         public int graguate = 2021;

         @Override
         public void study(){
         	System.out.println(" not hardcore academic studying ");
         } 
       
        public static void main(String[] args) {
       		Student object1= new Student();

       		System.out.println(object1.name);
       		System.out.println(object1.age);
       		System.out.println(object1.graguate);
       	//	object1.study();	 

       		object1.name="jewel";
       		System.out.println(object1.name); 	
         }
}
