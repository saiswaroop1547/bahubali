package ctsproject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import com.mysql.cj.xdevapi.Statement;

import utilities.DBHandler;

public class TravelAgency
{
Connection connection;
List<Package> generatePackageCost(String filePath) throws IOException, SQLException
{int discount=0;
try
{
	connection=DBHandler.establishConnection();
}
catch(ClassNotFoundException e)
{
	e.printStackTrace();
}
String sql="insert into package_details values(?,?,?,?,?)";
PreparedStatement pst=connection.prepareStatement(sql);
FileInputStream fstream=new FileInputStream(filePath);
DataInputStream in=new DataInputStream(fstream);
BufferedReader br=new BufferedReader(new InputStreamReader(in));
String strLine;
ArrayList list=new ArrayList();
try {
	while((strLine=br.readLine())!=null)
	{
		list.add(strLine);
	}
}
	catch(IOException e)
{
		e.printStackTrace();
}
Iterator itr;
for(itr=list.iterator();itr.hasNext();)
{
	String str=itr.next().toString();
	String [] splitSt=str.split(",");
	String id="",source="",dest="",cost="",nod="";
	int nd=0;
	float cst=0;
	for(int i=0;i<splitSt.length;i++)
	{
		id=splitSt[0];
		boolean flag=validate(splitSt[0]);
		if(flag)
		{
			source=splitSt[1];
			dest=splitSt[2];
			cst=Float.parseFloat(splitSt[3]);
			nd=Integer.parseInt(nod=splitSt[4]);
			if(nd<5)
			{
				discount=0;
			}
			else if(nd>=5 &&nd<=8)
			{
				discount=3;
			}
			else if(nd>8&&nd<=10)
			{
				discount=5;
			}
			else
			{
				discount=7;
			}
		}
	}
			double gst=0.12;
			cst=cst-((discount/100)*cst);
			double tcost=cst+(cst*gst);
			pst.setString(1, id);
			pst.setString(2, source);
			pst.setString(3, dest);
			pst.setDouble(4, tcost);
			pst.setInt(5, nd);
			pst.executeUpdate();
	}
System.out.println("Record's Processed");
return list;
}
boolean validate(String packageId)
{
	Pattern pattern=Pattern.compile("[0-9]{3}/[A-Z]{3}");
	boolean flag=pattern.matcher(packageId).matches();
return flag;
}

List<Package> findPackagesWithMinimumNumberOfDays()
{
	String query="select * from package_details group by package_id having min(no_of_days) ";
Connection con=DBHandler.establishConnection();
Statement st=(Statement) con.createStatement();
ResultSet rs=((java.sql.Statement) st).executeQuery(query);
while(rs.next()) {
	Package p=new Package();
	((Object) p).setPackageId(rs.getString(1));
	((Object) p).setSourcePlace(rs.getString(2));
	((Object) p).setDestinationPlace(rs.getString(3));
	((Object) p).setNoOfDays(rs.getInt(4));
	((Object) p).setBasicFare(rs.getInt(5));
	list.add(p);
}
return list;


return null;
}

}
