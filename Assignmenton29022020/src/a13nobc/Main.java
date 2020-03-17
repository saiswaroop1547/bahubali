package a13nobc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter c value");
		int c=sc.nextInt();
		System.out.println(UserMainCode.getLuckySum(a,b,c));
	}

}
