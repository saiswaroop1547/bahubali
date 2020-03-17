package jdbC;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("Employee.xml");
        EmployeeDaoImpl dao=(EmployeeDaoImpl)context.getBean("EDao"); 
        Employee e=new Employee();
        System.out.println("enter the emp id");
        String id=sc.next();
        e.setEid(id);
        System.out.println("Enter the emp name");
        String name=sc.next();
        e.setEname(name);
        System.out.println("enter the emp dept");
        String dept=sc.next();
        e.setDept(dept);
        System.out.println("enter the wmp desg");
        String desg=sc.next();
        e.setDesg(desg);
        System.out.println("enter the email");
        String email=sc.next();
        e.setEmail(email);
        System.out.println("records updated");
       //List<Employee> employee =dao.getEmployee();
        //for(Employee E:employee)
        //{
        	if(e.getEname()==name && e.getDept()==dept && e.getDesg()==desg && e.getEmail()==email)
        	{
        		System.out.println("data avilable" );
        	}
        	else
        	{
        		//E.setEname(name);
        		//E.setDept(dept);
        		//E.setDesg(desg);
        		//E.setEmail(email);
        		int status=dao.update(e);
        		System.out.println("records updated");
        	}
        }
       /* List<Employee> employee =dao.getEmployee();
        Iterator<Employee> itr=employee.iterator();
	for(Employee e:employee)
	{
		System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDept()+" "+e.getDesg()+" "+e.getEmail());
	}

	dao.getEmployee();
}*/
}
