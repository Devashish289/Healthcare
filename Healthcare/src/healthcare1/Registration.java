package healthcare1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import bean.Registrationpage;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("Name");
        	String name=br.readLine();
        	System.out.println("Phone number");
        	String phoneno=br.readLine();
        	System.out.println("Userid");
        	String userid=br.readLine();
        	System.out.println("Password");
        	String pass=br.readLine();
        	Registrationpage r=new Registrationpage();
        	r.setName(name);
        	r.setPhoneno(phoneno);
            r.setUsername(userid);
            r.setPassword(pass);
            RegisterPageImple obj1=new RegisterPageImple();
            obj1.register(r);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
