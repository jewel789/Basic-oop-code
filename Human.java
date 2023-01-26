import java.util.*;



class Animal{

    void show(){
    	System.out.println("this is animal ");
    }

}


class Cat extends Animal{
      
      //@Override
	  void show(){
	  		System.out.println("this is in cat ");

	  }
}


 class Human extends Animal{

 	//@Override
	void show(){
		System.out.println(" this is  ladyi with lamp");
	}

   public static void main(String[] args) {
   	   Human ob=new Human();
       
       Scanner input = new Scanner(System.in);  ///  to take 
       int ok=input.nextInt();					//	    input 
   	  

   	   ob.show(); 
   	  Cat cat=new Cat();
       cat.show();
   }


}