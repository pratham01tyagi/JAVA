package four_array;
import java.util.Scanner;
public class Code_average_marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("HI how many students are there ");
		int[] Student = new int [sc.nextInt()]; 
		System.out.println("Now enter there marks..");
		for(int i =0;i<Student.length;i++)
		{
			Student[i]=sc.nextInt();
			
		}
		System.out.println("marks you enterred are- ");
	for(int j = 0; j <Student.length;j++)	
	{
		
		System.out.println(+Student[j]);

	}
	double Average=0;
	for(int i =0;i<Student.length;i++)
	{
		Average+=Student[i];
		
	}
	Average/=Student.length;
	System.out.println("the average will be ->"+Average);
	}
}
