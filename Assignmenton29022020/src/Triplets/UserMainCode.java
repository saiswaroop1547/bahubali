package Triplets;

public class UserMainCode 
{
	public static boolean checkTripplets(int n,int a[])
	{boolean b = false;
		for(int i=0;i<=n-2;i++)
		{
				if((a[i]==a[i+1])&&(a[i+1]==a[i+2]))
					b=true;
		}
		
		
		return b;
		
		
	}

}
