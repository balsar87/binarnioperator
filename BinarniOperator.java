package binarniOperator;

import java.util.Arrays;
import java.util.Scanner;

public class BinarniOperator {

	public static void main(String[] args) {
	
		Scanner d=new Scanner(System.in);
		System.out.println("Unesite broj");
		int x=d.nextInt();
		
		String bin = Integer.toBinaryString(x);
		
		
		
	//	System.out.println(bin);
		
		byte[] b = bin.getBytes();
		
//	System.out.println(b);
	
	// System.out.println("Array as String" + Arrays.toString(b));
	 
	 String str=Arrays.toString(b);
	// System.out.println(str);
	 String[] st=str.split(", ");
	
	 
	
	 
	// System.out.println(st);
	 
	// for(String r : st){
		
		//System.out.println(r);
	//	if(r.equals("49") ||r.equals("[49") || r.equals("49]")) {
	//		System.out.println("Ovdje je 1");
	//	}else {
	//		System.out.println("Ovdje je 0");
	//	}
		
	// for(int i=0;i<st.length;i++) {
	 
	 try {
		 System.out.println("Unesite index koji zelite da proverite");
         int i = d.nextInt();

		 if(st[i].equals("49") || st[i].equals("[49") ||st[i].equals("49]")) {
			 System.out.println("Ovdje je 1");
			 
		 }else {
			 System.out.println("Ovdje je 0");
		 }
      } catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("The index you have entered is invalid");
         System.out.println("Please enter an index number between 0 and 3");
      }
	 
	 
	//	 if(st[element].equals("49") || st[element].equals("[49") ||st[element].equals("49]")) {
	//		 System.out.println("Ovdje je 1");
			 
	//	 }else {
	//		 System.out.println("Ovdje je 0");
	//	 }
	//	
		 
		
		
		
		
			}	
	 }


