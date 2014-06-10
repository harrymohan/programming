/*
 * 1. Find a repetitive String
 * 2. Find first repetitive String
 * 3. Find first non-repetitive String
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;




public class repChar {

	
	
	public static void main(String[] args){
		LinkedHashSet<String> lhS = new LinkedHashSet<String>();
		//create 
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Harmohan");
		strList.add("April");
		strList.add("Helen");
		strList.add("Harpreet");
		strList.add("Charneet");
		strList.add("Gaurav");
		strList.add("Harmohan");
		strList.add("Gaurav");
		
		//add this list items to LinkedHashSet
		for(String str:strList){
			if(lhS.contains(str))
			{
				System.out.println("Duplicate Found: "+str);
				
			}
			else
			{
				System.out.println("Adding to the LinkedHashSet: "+str);
				lhS.add(str);
			}
		}
		//show the LinkedHashSet
		Iterator<String> itr = lhS.iterator();
		while(itr.hasNext())
		{
			System.out.println("Name: "+itr.next());
		}
	}
}
