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
public void logininfo(ArrayList<List<String>> map, String s) {
	boolean isExist = false;
	for(int i=0; i<map.size(); i++)
	{
		if(s.equals(map.get(i)))
		{
		  isExist=true;
		  break;
		}
		if(isExist=true)
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
