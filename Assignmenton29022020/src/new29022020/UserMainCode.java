package new29022020;
public class UserMainCode
{
public static int compareDashes(String s1,String s2)
{int i,j;
 int flag=0;
	for(i=0;i<s1.length();i++)
	{
		for(j=0;j<s2.length();j++)
		{	
			if(i==j)
			{
			if(s1.charAt(i)=='-' && s2.charAt(j)=='-')
			{
				flag=1;
			}
			else if(s1.charAt(i)=='-' && s2.charAt(j)!='-')
			{
				flag=2;
			}
			else if(s1.charAt(i)!='-' && s2.charAt(j)=='-')
			{
				flag=2;
			}
		}
	}
}

	return flag;
}
}
