import java.util.Scanner;

class Tester 
{
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		salary =25000;
		desig="Tester ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered the details of Tester");
		else
		{
			System.out.println("**********************************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("**********************************");
		}
	}
	static void raiseSalary()
	{
		salary =25000;

		salary=salary+1000;
		System.out.println("Raised salary of Tester"+salary);

	}
}
class Manager  
{
	
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		salary =90000;
		desig="Manager ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered the details of employee Manager");
		else
		{
			System.out.println("***");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
		}	
		
	}
	static void raiseSalary()
	{
		salary = 90000;
		salary=salary+30000;
		System.out.println("Raised salary of Manager"+salary);
	}
}
class Dev 
{
	
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		salary =500000;
		desig="Dev ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered details of employee Developer");
		else 
		{
			System.out.println("**********************************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("**********************************");
		}
	}
	static void raiseSalary()
	{
		salary = 50000;
		salary=salary+20000;
		System.out.println("Raised salary of Dev"+salary);
	}
}
class Clerk 
{
	
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		salary =2000;
		desig="Clerk ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered details of employee Clerk");
		else 
		{
			System.out.println("**********************************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("**********************************");
		}
	}
	static void raiseSalary()
	{
		salary = 2000;
		salary=salary+5000;
		System.out.println("Raised salary of Clerk"+salary);
	}
}
class Create1 
{
	
	void printer()
	{
		System.out.println("1. Create ");		
		System.out.println("2.display ");
		System.out.println("3. raise salary ");
		System.out.println("4. exit ");
	}
}
class project
{
	public static void main(String args[])
	{

		
		Scanner sc=new Scanner(System.in);
		Create1 c1=new Create1();
		System.out.println("1. Create ");		
		System.out.println("2.display ");
		System.out.println("3. raise salary ");
		System.out.println("4. exit ");
		int n,n1;
		while(true)
		{
			
			n=sc.nextInt();
			switch(n)
			{
				case 1: System.out.println("Enter type of employee you want to create ");
						System.out.println("1.Developer");
						System.out.println("2.Manager");
						System.out.println("3.Clerk");
						System.out.println("4.Tester");
						n1=sc.nextInt();
						switch(n1)
						{
							case 1: System.out.println("Enter Developer Details");
									Dev.create();
									c1.printer();
									break;
							case 2: System.out.println("Enter Manager Details ");
									Manager.create();
									c1.printer();
									break;
							case 3: System.out.println("Enter Clerk Details");
									Clerk. create();
									c1.printer();
									break;
							case 4: System.out.println("Enter Tester Details");
									Tester.create();
									c1.printer();
									break;
							case 5: System.exit(0);
									break;
							default:
						}
						break;
				case 2: System.out.println("Display all the members details of employees");
						Dev.display();
						Manager.display();
						Clerk.display();
						Tester.display();
						c1.printer();
						break;
				case 3: System.out.println("Raising the salary of all employees ");
						Dev.raiseSalary();
						Manager.raiseSalary();
						Clerk.raiseSalary();
						Tester.raiseSalary();
						c1.printer();
						break;
				case 4: System.out.println("Thank you");
						break;
				default: System.out.println("You entered wrong option"); 
							break;
			}
			if(n==4)
				break;
		}
	}
}