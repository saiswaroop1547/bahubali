package Triplets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{int i;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n numer of elements");
		int n=sc.nextInt();
		System.out.println("enter the array elements");
		int a[]=new int[10];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(UserMainCode.checkTripplets(n,a));
		
		
	}

}
