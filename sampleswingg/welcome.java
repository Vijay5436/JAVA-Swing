package sampleswingg;
import java.lang.*;
import java.util.Scanner;
public class welcome
{
	public static void main(String[] args) {
		int a,c=1,i;
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		String st=str.toUpperCase();
		c=str.length();
		for(int k=0;k<=c;k++)
		{
			char b=st.charAt(k);
			
			if(b==('A')||b==('E')||b==('I')||b==('O')||b==('U'))
			{
				for(i=7;i<=c;i++)
				
				{
					System.out.print("*");
				}
			System.out.print(b);
			for(i=7;i<=c;i++)
			{
				System.out.print("*");
			}
		   c++;
		    }
			else
				System.out.print(b);
		}
		
	}
}
