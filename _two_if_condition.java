package three_conditional_statments;
import java.util.Scanner;
public class _two_if_condition 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Hi! what's your age?");
		int age = sc.nextInt();
		if(age>18) 
		{
			System.out.println("hi you can vote as you are "+age+" years old ");
		    System.out.println("Do you have your Voter ID?");
		    Boolean Voter_id = sc.nextBoolean();
		    if(Voter_id==true) 
		        {
			     System.out.println("hello sir please let us know about your Voter_id no.");
			     int Voter_id_no= sc.nextInt();
			     if(Voter_id_no%2==0)
			     {
			     System.out.println ("you told your voter ID no is - "+Voter_id_no+ " 48Thanks now you can go for voting");
			     } 
			     else {System.out.println("WRONG VOTER ID NO.");}
			     }
		    else
		    {
		    	System.out.println("Soory we cant help you without your voter ID");
		    	
		    }
		}
		
		
		
		
		else
		   {
			int left = 18-age;
			System.out.println("soory you are "+age+" you can vote after " +left+ " years" );
			
		   }
	}

}
