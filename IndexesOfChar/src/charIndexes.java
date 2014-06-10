/*
 * Finding First Repetitive character in a given String
 */
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class charIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="harmohan singh";
		//initialize Hash table
		Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
		//build a hashtable
		for(int i=0;i<input.length();i++)
		{
			if(ht.containsKey(input.charAt(i))){
				ht.put(input.charAt(i), ht.get(input.charAt(i))+1);
			}
			else
				ht.put(input.charAt(i),1);
		}
		Set<Entry<Character,Integer>> keys = ht.entrySet();
		for(Entry key:keys)
		{
			System.out.println("Key: "+key.getKey()+" Value:"+key.getValue());
		}
		System.out.println("------Let's Find First Non Repetitive Char in the String----");
		//find first repetitive by comparing Hashtable with input String
		int j=0;
		int len = input.length();
		while(j<len)
		{
			int val = 0;
			val = ht.get(input.charAt(j));
			if(val == 1){
				System.out.println("First Rep Char: "+input.charAt(j));
				break;
			}
			j++;
		}
	}

}
