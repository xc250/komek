package degiskenler;



import java.util.ArrayList;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		

	
		
		String firstName, middleName, lastName;
		int chose ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("First Name");
		firstName = input.nextLine();
		
		System.out.println("Middle Name");
		middleName = input.nextLine();
		
		System.out.println("Last Name");
		lastName = input.nextLine();
	
		System.out.println("Your name is "+ firstName +" "+ middleName +" "+ lastName );
		
		System.out.println("How do you want to order?\n Ascending : 1 \n Descending : 2");
		
		chose = input.nextInt();
		
		int f = firstName.length();
		int m = middleName.length();
		int l = lastName.length() ;
		
		if (chose==2)
		{
			if ( f >= m && f >= l)
			{ 
				if ( m >=l)
					System.out.println(firstName+" "+middleName+" "+lastName);
				else
					System.out.println(firstName+" "+lastName+" "+middleName);
			}
			
			if( m >= f && m >= l)
			{
				if (f >= l)
					System.out.println(middleName+" "+firstName+" "+lastName);
				else
					System.out.println(middleName+" "+lastName+" "+firstName);
			}
			
			if( l >= f && l >= m)
			{
				if (f >= m)
					System.out.println(lastName+" "+firstName+" "+middleName);
				else
					System.out.println(lastName+" "+middleName+" "+firstName);
			}
			
			
		}
			
			
			if (chose==1)
			{
				if ( f <= m && f <= l)
				{ 
					if ( m <=l)
						System.out.println(firstName+" "+middleName+" "+lastName);
					else
						System.out.println(firstName+" "+lastName+" "+middleName);
				}
				
				if( m <= f && m <= l)
				{
					if (f <= l)
						System.out.println(middleName+" "+firstName+" "+lastName);
					else
						System.out.println(middleName+" "+lastName+" "+firstName);
				}
				
				if( l <= f && l <= m)
				{
					if (f <= m)
						System.out.println(lastName+" "+firstName+" "+middleName);
					else
						System.out.println(lastName+" "+middleName+" "+firstName);
				}
			

		    }
	
	}

}
