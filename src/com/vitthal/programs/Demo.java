package com.vitthal.programs;

import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		
		
		String s = "VItthal";
		
		String val = new String("Bulbule");
		System.out.println(val);
		
		char[] charArray = {'a','b','c','d'};
		int[] intArray = {1, 3, 5, 6,78};
		String[] strArray = {"Vitthal", "Bulbule"};
		String charString = new String(charArray);
		System.out.println(charString);
		
		String str = "Amruta is a Girl";
		System.out.println(str);
		
		/*
		 * Amruta
		 * is
		 * a
		 * Girl
		 * 
		 */
		String[] strArrayval = str.split(" ");
		System.out.println(strArrayval.length);
		
		
	    String StrVal = "vitthal maruti bulbule, Datta maruti bulbule";
	    String Strval2 = "Amruta Chougule";
	    
	    String[] xyz = StrVal.split(",");
	    System.out.println(xyz.length);
	    
	    char ch = StrVal.charAt(4);
	    System.out.println(ch);
	    
	   System.out.println(StrVal.equals(Strval2));
	    
	   System.out.println(StrVal.isEmpty()); 
	   
	   //System.out.println(StrVal.isBlank());
	   
	   System.out.println(StrVal.toUpperCase());
	   
	   
	   String vi = "vitthal";
	   String vu = "VITTHAL bulbule";
	   
	   
	   
	   System.out.println(vi.equals(vu));
	   System.out.println(vi.equalsIgnoreCase(vu));
	   
	   System.out.println(vu.toLowerCase());
	   
	
	   
	   System.out.println(vu.concat("bulbule"));
	   
	   char[] array = vu.toCharArray();
	   System.out.println(Arrays.toString(array));
	   
	   System.out.println(vu.endsWith("bulbule"));
	   
	   
	   String strvall4 = "Amruta vitthal tejas";
	   System.out.println(strvall4.contains("tejas"));
	   
	   System.out.println(strvall4.indexOf('v'));
	   
	   System.out.println(strvall4.lastIndexOf(97));
	   
	   System.out.println(strvall4.length());
	   
	
	   
	   // i live in india
	   // india in live i
	   
	   // aidni ni evil i
	   // abdcefghighmlja
	   
	   // asd%$hjuya$#
	   // ayu%$jhdsa$#
	   
	   
	   
	    String am = "amruta";
	    String a2 = "amruta";
	    
	    String valasa = "data";
	    
	    String xya = "data";
	    
	    
	    
	    
	    
	    
	    System.out.println(am.equals(a2));
	    System.out.println(am==a2); // true
	    
	    String a3 = "amruta"; // constant pool made
	    String a4 = new String("amruta"); // heap memoory 
	    System.out.println(a3.equals(a4));
	    
	    System.out.println(a3);
	    System.out.println(a4);
	    System.out.println(a3==a4); // true?? why false??
	    
	    System.out.println();
	    
	    
	    String str1 = "Hello";
	    String str2 = "Hello";
	    


		
		
	
		
	}

}
