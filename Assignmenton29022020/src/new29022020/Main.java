package new29022020;

import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String s1=sc.next();
		System.out.println("Enter the second String");
		String s2=sc.next();
		System.out.println(UserMainCode.compareDashes(s1, s2));
	}
}
