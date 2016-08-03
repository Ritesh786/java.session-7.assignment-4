package com.Ritesh.tools;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
	  String arr="ritesh";  
	 int no;
	 Scanner s = new Scanner(System.in);
	 System.out.println("size of String is 6");
	 System.out.println("Value  of String is "+arr);
	
	 try{
	 System.out.println("Enter String number that u want to display");
	  no=s.nextInt();
	 System.out.println("String number that u want to show = " +arr.charAt(no-1));}
	
		   catch(  StringIndexOutOfBoundsException e){
				 System.out.println("u want to display that String number which is out of bound");
		   }
	 s.close();
	 }
  
}
