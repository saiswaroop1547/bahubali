package ctsproject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class VarunTourTest {

	public static void main(String[] args) throws IOException, SQLException 
	{
		
			TravelAgency vtr=new TravelAgency();
			List list=vtr.generatePackageCost("d://VarshTourPackageDetails.txt");
			Iterator<String> itr=list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			//List list1=vtr.findPackagesWithMinimumNumberOfDays();
			//Iterator<String> itr1=list1.iterator();
			//while(itr1.hasNext())
			//{
			//System.out.println(itr1.next());
			//}
	}

}
