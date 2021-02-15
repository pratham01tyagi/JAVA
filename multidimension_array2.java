package four_array;
import java.util.Scanner;
public class multidimension_array2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		// here we will add two matrix.
		System.out.println("HI Enter the no of Rows and column YOU want in matrix");
		int row =sc.nextInt();
		int col=sc.nextInt();
		int a [][]= new int [row][col];
		System.out.println("hi now enter the no. for 1rd matrix");
		for(int i=0; i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		////////////////////////////Now taking matrix two..............
		int b [][]= new int [row][col];
		System.out.println("hi now enter the no. for 2nd matrix");
		for(int i=0; i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j]=sc.nextInt();
				
			}
		}
		////////////////////////////////time to add two matrix.............
		int c [][]=new int [row][col];
		for(int i=0; i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				
			}
		}
		for(int i=0; i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(c[i][j]+" ");
				
			}
		}
	}
}
