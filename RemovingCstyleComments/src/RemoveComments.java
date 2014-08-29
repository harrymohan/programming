import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class RemoveComments {

	public static void parseFile(String file)
	{
		try {
			FileReader inputFile = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(inputFile);
			String line;
			String copy;
			try {
				while((line =bufferReader.readLine())!=null)
				{
					//System.out.println(line);
					//within each line 
					
					boolean first = false,second = false,colon=false;
					boolean colonExist = false;
					int dist = 0;
					for(char c:line.toCharArray())
					{
						if(first && second)
						{
							first = false;
							second = false;
							colon = false;
						}
				
						if(c =='/' || c==':')
						{
							if(c ==':')
							{
								colon = true;
							}
							if(c =='/'){
							if(!first)
							{
								first = true;
							}
							else
								if(first)
								{
									second=true;
								}
							}
							if(!colon &&(first && second) )
							{
								break;
							}
							else
							{
								if(colon || !first  ){
								System.out.print(c);
								}
							}					
								
						}
						else
						{
							System.out.print(c);
							
						}
						
					}
					System.out.println("");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "input.txt";
		parseFile(filePath);

	}

}
