   package healthcare1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int n=0;
	do
	{
		System.out.println("Health care system");
		System.out.println("\t\t 1.Customer");
		System.out.println("\t\t 2. Admin\n\t\tEnter your choice(1-2):");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice=Integer.valueOf(br.readLine());
		
		switch(choice)
		{
		case 1:
			System.out.println("Customer");
			System.out.println("\t\t 1.Register");
			System.out.println("\t\t 2.Login");
			int c=Integer.valueOf(br.readLine());
			switch(c)
			{
			case 1:
			{
				System.out.println("Registration");
				new Registration();
				Registration.main(null);
				break;
			}
			case 2:
			{
				System.out.println("\tLoginData");
				new LoginData();
				LoginData.main(null);
			   String s=br.readLine();
			   {
				   System.out.println("\tLoginData");
				   new LoginData();
				   LoginData.main(null);
				    break;
			}
			}
			default:
			{
				System.out.println("Invalid choice");
			}
			}
			break;
		case 2:
		{
			System.out.println("\tAdmin");
			new Admin();
			Admin.main(null, null);
			break;
		}
		default:
		{
			System.out.println("invalid");
		}
	}
	}while(n<=2);
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
