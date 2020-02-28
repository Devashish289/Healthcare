package healthcare1;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Registrationpage;

public class RegisterPageImple implements RegisterInterface{
static ArrayList<Registrationpage> al= new ArrayList<Registrationpage>();

@Override
public void register(Registrationpage r) {
	al.add(r);
	Iterator<Registrationpage> it=al.iterator();
	while(it.hasNext())
	{
		Registrationpage s=it.next();
		System.out.println("\t\t"+s.getName()+"\t\t"+s.getPhoneno()+"\t\t"+s.getUsername()+"\t\t"+s.getPassword());
	}
	System.out.println("Registration is done");
	
	}
public void logininfo(ArrayList<Registrationpage> a, String s) {
	boolean isExist = false;
	
	
	for(int i=0; i < a.size(); i++)
		{
		Registrationpage r2=(Registrationpage)a.get(i);
		
		System.out.println("==============================");
		System.out.println(r2.getPassword());
		String s2=r2.getPassword();
		System.out.println(s);
		if(s.equals(s2))
		{
		  isExist=true;
		  break;
		}
		if(isExist)
		{
			System.out.println("u are successfully logged in");
		}
		else
		{
			System.out.println("not found");
		}
		} 
	
}
@Override
public void display(Registrationpage p) {
 	
}}
