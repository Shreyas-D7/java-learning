package com.JT.batch051019web.corejava;

public class StringExamples {
	
	public static void main(String[] args) throws InterruptedException {
		String name1="Java";
		String name2="Hello Java";
		String name3=new String("Java");
		String name4=new String("Java Tech");
		String name5="Java";
		String name6=new String("Java");
		
		//== is for reference/address comparison
		//.equals is for content/value comparison
		
		System.out.println("name1=name2: "+(name1==name2));  //false
		System.out.println("name2=name3: "+(name2==name3));  //false
		System.out.println("name3=name1: "+(name3==name1));  //false
		System.out.println("name3=name4: "+(name3==name4));  //false
		System.out.println("name1=name5: "+(name1==name5));  //true
		System.out.println("name3=name6: "+(name3==name6));  //false
		System.out.println("-----------------------");
		System.out.println("name1.name2: "+name1.equals(name2)); //false
		System.out.println("name2.name3: "+name2.equals(name3)); //false
		System.out.println("name3.name1: "+name3.equals(name1)); //true
		System.out.println("name3.name4: "+name3.equals(name4)); //false
		System.out.println("name1.name4: "+name1.equals(name4)); //false
		System.out.println("name3.name6: "+name3.equals(name6)); //true
		
		//String is immutable
		name1.concat("1995");
		name3.concat("1998");
		System.out.println(name1);
		System.out.println(name3);
		
		//StringBuffer/StringBuilder is mutable
		StringBuffer sb=new StringBuffer("Java");
		sb.append("1995");
		System.out.println("StringBuffer: "+sb);
		StringBuilder sbi=new StringBuilder("Hello");
		sbi.append(" James ");
		sbi.append(" Welcome to Java Training");
		System.out.println(sbi);
		//Thread.sleep(10000);
		System.out.println("Length before Reverse: "+sbi.length());
		System.out.println("Characher: "+sbi.charAt(10));
		System.out.println("Substring on index: "+sbi.substring(13));
		System.out.println("Substring on start and end: "+sbi.substring(13, 28));
		System.out.println(sbi.reverse());
		System.out.println("Length After Reverse : "+sbi.length());
			
	}
}
