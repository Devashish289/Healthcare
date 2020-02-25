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
test_name.add("xray");

List<String> test_name1 = new ArrayList<String>();
test_name1.add("blood group");
test_name1.add("blood pressure");

List<String> test_name2 = new ArrayList<String>();
test_name2.add("urine test");
test_name2.add("ct scan");

map.put("Gandhinagar", test_name);
map.put("delhi", test_name1);
map.put("kanpur", test_name2);
System.out.println("Fetching keys and corresponding[Multiple] values n");
for(Map.Entry<String, List<String>>entry: map.entrySet()) {
	String key= entry.getKey();
	List<String> values=entry.getValue();
	System.out.println("Key "=+ key);
	System.out.println("Values="+ values + "n");	
}
adminPage r=new adminPage();
int n=0;
try
{
	System.out.println("\t\t 1. if we want to add center");
	System.out.println("\t\t 2. if we want to remove center");
	System.out.println("\t\t 3. if we want to add test name");
	System.out.println("\t\t 4. if we want to remove test");
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	int c=Integer.valueOf(br1.readLine());
	do
	{
		switch(c)
		{
		case 1:
		{
			System.out.println("enter the centre name to add");
			String centername
		}
		}
	}
	
}
}

}
