import java.util.Scanner;
public class oddpalindrom{
	
	public static void main (String[] args)
	{
		//String str ="rama madam wil come today";
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		int start =0;
		int end = str.length()-1;
		int pre = 0;
		while(start< end)
		{
			while(start<str.length() && str.charAt(start) !=' ')
			{
				start++;
			}
			String temp = str.substring(pre,start);
			if( temp.length()%2==1 && ispalindrom(str))
			{
				
				System.out.println(temp);
			}
				start= start+1;
				pre = start;
		}
	}
	
	
	public static boolean ispalindrom(String str)
	{
		//boolean flag =true;
		int start =0;
		int end =0;
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
			   return false;
			}
		start++;
		end--;
		}
		return true;
	}
}

