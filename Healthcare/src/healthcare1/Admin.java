package healthcare1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.adminPage;

public class Admin {

	public static void main(String[] args,Object ArrayList) {
		// TODO Auto-generated method stub
Map<String, List<String>> map = new HashMap<String, List<String>>();

List<String> test_name= new ArrayList<String>();
test_name.add("bloodtest");
test_name.add("x-ray");

List<String> test_name1 = new ArrayList<String>();
test_name1.add("blood group");
test_name1.add("blood pressure");

List<String> test_name2 = new ArrayList<String>();
test_name2.add("urine test");
test_name2.add("ct scan");

map.put("Lucknow", test_name);
map.put("Mumbai", test_name1);
map.put("kanpur", test_name2);

System.out.println("Fetching keys and corresponding[Multiple] values n");
for(Map.Entry<String, List<String>>entry: map.entrySet()) {
	String key= entry.getKey();
	List<String> values=entry.getValue();
	System.out.println("Key="+ key);
	System.out.println("Values="+ values + "\n");	
}
adminPage r=new adminPage();
int n=0;
try
{
	System.out.println("\t\t 1. if we wanna add center for a particular test");
	System.out.println("\t\t 2. if we wanna remove center for a test");
	System.out.println("\t\t 3. if we wanna add name for a test");
	System.out.println("\t\t 4. if we wanna remove test");
	
	
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	int c=Integer.valueOf(br1.readLine());
	do
	{
		switch(c)
		{
		case 1:
		{
			System.out.println("enter the centre name to add");
			String centerName=br1.readLine();
			r.setCenter_name(centerName);
			
			String p=r.getCenter_name();
			ArrayList<String> al2=new ArrayList<String>();
			System.out.println("enter the first test");
			String TestName=br1.readLine();
			System.out.println("\tenter the second test");
			String TestName1=br1.readLine();
			al2.add(TestName);
			al2.add(TestName1);
			AdminPageImple obj1=new AdminPageImple();
			
			obj1.addCenter(map, r, al2);  
			break;
		}
		case 2:
		{
			System.out.println("enter the center name to remove");
			String CenterName=br1.readLine();
			AdminPageImple obj1=new AdminPageImple();
			obj1.removeCenter(map, CenterName);
			break;
		}
		case 3:
		{
			System.out.println("enter the test name to add");
			String TestName1=br1.readLine();
			
			System.out.println("enter the key value at which it is adding");
			String s=br1.readLine();
			AdminPageImple obj3=new AdminPageImple();
			obj3.addTest(map, s, TestName1);
			break;	
}
		case 4:
		{
			System.out.println("enter the test name");
			String TestName1=br1.readLine();
			System.out.println("enter the key value at which removal has to be done");
			String s=br1.readLine();
			AdminPageImple obj4=new AdminPageImple();
			obj4.removeTest(map, s, TestName1); 
			break;	
		}
		default:
	{
	System.out.println("invalid choice");
	}
		}
	}
	while(n<=2);
		}
catch(Exception e)
{
	e.printStackTrace();
}
}
}