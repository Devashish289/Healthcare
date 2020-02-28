 package healthcare1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import bean.Registrationpage;

public class LoginData {

	public static void main(String[] args) {
     // TODO Auto-generated method stub
		 ArrayList al=new ArrayList();
try
{
	BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("now Enter password to login");
	String s=br2.readLine();
	boolean isExist=false;
	for(int i=0;i<al.size();i++)
	{
		Registrationpage r2=(Registrationpage)al.get(i);
		
		System.out.println("==============");
		System.out.println(r2.getPassword());
		String s2=r2.getPassword();
		System.out.println(s);
		if(s.equals(s2))
		{
			isExist=true;
			break;
		}
}
if(isExist)
{
	System.out.println("u are successfuly logged in");
}
else
{
	System.out.println("not found");
}
}
catch(Exception e)
{
	e.printStackTrace();
	
}
	}
}
