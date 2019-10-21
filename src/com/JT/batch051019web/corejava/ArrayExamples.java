package com.JT.batch051019web.corejava;

public class ArrayExamples {
	public void data() {
		System.out.println("i am from Data team");
	}
	public static void main(String[] args) {
		int array1[]= {11,23,13,44,75};
		//int singledignumbers1[][]= {{11,23,13,44,75},{1,2,3,4,5}};
		int array2[] = new int[8];
		//int threedignumbers1[][] = new int[8][6];
		array2[0]=300;
		array2[1]=400;
		array2[2]=500;
		array2[3]=800;

		int array3[] = new int[5];
		for(int i=0;i<array1.length;i++) {
			System.out.println("Value from array1 "+array1[i]);
			array3[i]=array1[i];
		}
		System.out.println("Size of array2: "+array2.length);
	}
}
