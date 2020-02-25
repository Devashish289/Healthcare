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
try
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<List<String>> map=new ArrayList <List<String>>();
	
	List<String> valSetOne = new ArrayList<String>();
	valSetOne.add("deva");
	valSetOne.add("ankit");
	
	List<String> valSetTwo=new ArrayList<String>();
	valSetTwo.add("7896789876");
	valSetTwo.add("7867564534");
	
	List<String> valSetThree=new ArrayList<String>();
	valSetThree.add("deva");
	valSetThree.add("ankit");
	
	List<String> valSetFour= new ArrayList<String>();
	valSetFour.add("deva");
	valSetFour.add("ankit");
	
	map.add(valSetOne);
	map.add(valSetTwo);
	map.add(valSetThree);
	map.add(valSetFour);
	
	RegisterPageImple obj3=new RegisterPageImple();
	System.out.println("Enter password");
	String s=br.readLine();
	
	obj3.logininfo(map, s);
}
catch(Exception e)
{
	e.printStackTrace();
	
}
	}
}
