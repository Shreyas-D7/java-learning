package com.JT.batch051019web.corejava;

public class ConditionalStatements{
	int a=100;
	protected int b=200;
	public static void evenOrOdd(int num) {
		boolean chk=false;
		int c=num%2;
		if(c==0) {
			chk=true;
			System.out.println("Given number is EVEN");
		}else {
			System.out.println("Given number is ODD");
		}
	}
	
	public static void printTable() {
		int number=9;
		for(int i=1;i<=10;i++) {
			int mul=(number*i);
			if(number==i) {
				mul=1000000;
			}
			System.out.println(number+" X "+i+" = "+mul);
		}
	}
	
	public static void printTable(int num) {
		System.out.println("Print Table Using ForLoop");
		for(int i=1;i<=10;i++) {
//			int mul=0;
//			if(num==i) {
//				mul=1000000;
//			}else if(num<=i){
//				mul=0;
//			}else if(num>=i){
//				mul=1;
//			}else {
//				mul=2;
//			}
			System.out.println(num+" X "+i+" = "+(num*i));
		}
		System.out.println("------------------------------");
		System.out.println("Print Table Using WHile Loop");
		int i=1;
		while(i<=10) {
			int mul=0;
			if(num==i) {
				mul=1000000;
			}else {
				mul=(num*i);
			}
			System.out.println(num+" X "+i+" = "+mul);
			i++;
		}
		//5,1,6,.............
		i=1;
		do {
			System.out.println(num+" X "+i+" = "+(num*i));
			i++;
		}while(i<=5);
	}	
	public static String weeks(int day) {
		
		String week="";
		switch(day) {
		case 1:
			week="Sunday";
			break;
			
		case 2:
			week="Monday";
			break;
		case 3:
			week="Tuesday";
			break;
		case 4:
			week="Wednesday";
			break;
		case 5:
			week="Thursday";
			break;
		case 6:
			week="Friday";
			break;
		case 7:
			week="Saturday";
			break;
		default:
			System.out.println("Invalid Day, Please enter valid day number....");
		}
		
		return week;
		
		//System.out.println("Day is: "+week);
	}
	
	
	public static void main(String[] args) {
		//evenOrOdd(16);
		printTable(6);
		String day=weeks(5);
		System.out.println("day is: "+day);
		
	}
}
