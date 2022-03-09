package binarniOperator;

import java.util.Arrays;

public class BinarniOperator {

	public static void main(String[] args) {
	
		
		int x=15;
		
		String bin = Integer.toBinaryString(x);
		
		
		
		System.out.println(bin);
		
		byte[] b = bin.getBytes();
		
	System.out.println(b);
	
	 System.out.println("Array as String" + Arrays.toString(b));
	 
	 String str=Arrays.toString(b);
	 System.out.println(str);
	 String[] st=str.split(", ");
	
	 
	
	 
	 System.out.println(st);
	 
	 for(String r : st){
		
		System.out.println(r);
		if(r.equals("49") ||r.equals("[49") || r.equals("49]")) {
			System.out.println("Ovdje je 1");
		}else {
			System.out.println("Ovdje je 0");
		}
		
		
		
		
		
		
	}
	}

}
