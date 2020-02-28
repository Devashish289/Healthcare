package healthcare1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bean.Registrationpage;

public class Registration {
	static ArrayList<Registrationpage> a2=new ArrayList<Registrationpage>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("===================================");
        	System.out.println("Name");
        	String name=br.readLine();
        	System.out.println("Phone number");
        	String phoneno=br.readLine();
        	
        	Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
        	Matcher m=p.matcher(phoneno);
        	if(m.find() && m.group().equals(phoneno))
        	{
        		System.out.println("Valid Number");
        	}
        	else
        	{
        		System.out.println("Invalid Number");
        	}
        	System.out.println("Userid");
        	String userid=br.readLine();
        	System.out.println("Password");
        	String pass=br.readLine();
        	Registrationpage r=new Registrationpage();
        	r.setName(name);
        	r.setPhoneno(phoneno);
            r.setUsername(userid);
            r.setPassword(pass);
            a2.add(r);
            RegisterPageImple obj1=new RegisterPageImple();
            obj1.register(r);
          String s=br.readLine();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
