package com.vitthal.java.programs;

public class StringBufferDemo extends Object {
	
	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("Vitthal");
		
		
		
		//String s1 = new String("Vitthal");
		
		//System.out.println(sb==sb2);
		//System.out.println(sb.equals(sb2));//false
		
		
		String s1 = new String("Vitthal");
		s1.concat("Bulbule");
		System.out.println(s1);
		
		
		StringBuffer sb2 = new StringBuffer("Vitthal");
		sb2.append("Bulbule");
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		//sb2.delete(2 ,6);
		//System.out.println(sb2);
		//sb2.deleteCharAt(0);
		//sb2.insert(5, "AMRUTA");
		
		String val = sb2.substring(8);
		String val2=sb2.substring(4, 9);
		
		
		System.out.println(val2);
		
		
		
		
		
		
		
	}

}
