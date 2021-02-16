package four_array;
import java.util.Scanner;
public class Sorting_bubble 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("HI ENTER THE ARRAY..........");
		int[] a = new int[sc.nextInt()];
		System.out.println("Now enter there marks..");
		for(int i =0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for (int i=0; i<a.length-1; i++)
		{
			boolean flag = true;
			for(int j=0;j<a.length-i-1;j++)
			{
				if (a[j]>a[j+1]) 
				{
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag = false;
				}
			}
			if (flag)
				break;
		}
		//this was old methord 
	//	 for(int i=0; i<a.length;i++)
	  //     {
	//    	   System.out.println(a[i]);
	    //   }	
		for(int i: a)
			       {
			  	   System.out.println(i);
			     }	
	}
	
}
