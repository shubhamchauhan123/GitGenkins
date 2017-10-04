package com.gitjenkin.test;

import java.net.URL;
import java.util.Random;
public class JavaSample {

	public static void generateRandom() throws Exception {		
		Random ran = new Random();
		int x = ran.nextInt(6) + 5;	
		System.out.println(x);	
		int randomNum =  new Random().nextInt((999 - 100) + 1);
		System.out.println(randomNum);
	}
	public static void forLoop()   {	
		int i=0;
		int j=1;
	for(i=0;i<=3;i++)
	{
		
		for( j=1;j<=3;j++)
		{
			System.out.println(j);
			System.out.print(" ");
			//System.out.println(i);
		}
		
	}
	
	}
	public static void ARRAY()   {	
		String[] arry= { "A","B","C"};
	     int len_array = arry.length;

	     for (int i = 0; i < len_array; i++)
	     {
	         System.out.println(arry[i]);
	     }
	
	}
	public static void main(String[] args) throws Exception {	
		ARRAY() ;
	}
	
}
