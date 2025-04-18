package com.comcast.crm.customer;

import org.testng.annotations.Test;

public class CustomerTest {
	@Test
	public void customerTest() {
	     String s="asdf12345!@#$%^";
	     String a="";
	     String n="";
	     String q="";
	     for(int i=0;i<s.length();i++){
	         char ch=s.charAt(i);
	         if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
	             a+=s.charAt(i);
	         }else if(ch>='1' && ch<='9'){
	             n+=s.charAt(i);
	         }else{
	             s+=s.charAt(i);
	         }
	     }
	     System.out.println("alphabet"+a);
	     System.out.println("number"+n);
	     System.out.println("special Character"+q);
	}

}
