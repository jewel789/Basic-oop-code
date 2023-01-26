import java.io.*;
import java.util.*;
import java.lang.*;


class Array{

	public static void main(String[] args) {
		int a[]=new int[]{112,13,1344,44};
	

    	for(int i=0,l=a.length;i<l;i++){
 		 System.out.print(a[i]+" ");
	   }

	   for(int x:a){
	   	System.out.print(x+" ");
	   }

	   Scanner in = new Scanner(System.in);
	   int x=in.nextInt();// to take int datatype  

	   System.out.println(x);


	   Scanner inn =new Scanner(System.in);
	   String st=inn.nextLine();// to take string datatype
	   System.out.println(st);



   }

}