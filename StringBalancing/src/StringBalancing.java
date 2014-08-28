import java.util.Stack;


public class StringBalancing {
	
	public static boolean checkBalance(String input)
	{
		Stack<Character> stack = new Stack<Character>();
		
		for(Character ch : input.toCharArray())
		{
			//System.out.println(ch);
			if(ch.equals('{')|| ch.equals('[')||ch.equals('('))
			{
				//insert into stack
				//System.out.println("pushing: "+ch);
				stack.push(ch);
			}
			else
				if(ch.equals('}'))
				{
					if(!(stack.empty()) && !(stack.pop().equals('{')))
							{
								return false;
							}
				}
				else
					if(ch.equals(']'))
					{
						if(!(stack.isEmpty()) && !(stack.pop().equals('[')))
						{			
							return false;
						}
					}
					else
						if(ch.equals(')'))
						{
							if(!(stack.isEmpty())&&!(stack.pop().equals('(')) )
							{
								return false;
							}
						}
					
		}
		if(stack.size()==0)
		{
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "([)]";
		boolean result= false;
		result = checkBalance(input);
		System.out.println(input+" Is String Balanced?: "+result);
		input = "](){";
		result = checkBalance(input);
		System.out.println(input+" Is String Balanced?: "+result);
		input = " ([])";
		result = checkBalance(input);
		System.out.println(input+" Is String Balanced?: "+result);
		input = "[]{}";
		result = checkBalance(input);
		System.out.println(input+" Is String Balanced?: "+result);
		input = "(())";
		result = checkBalance(input);
		System.out.println(input+" Is String Balanced?: "+result);
		input = "(()(";
		result = checkBalance(input);
		System.out.println(input+" Is String Balanced?: "+result);
		/*
		 * Output
		 * ([)] Is String Balanced?: false
			](){ Is String Balanced?: false
 			([]) Is String Balanced?: true
			[]{} Is String Balanced?: true
			(()) Is String Balanced?: true
			(()( Is String Balanced?: false
		 */
	}

}
