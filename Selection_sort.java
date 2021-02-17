package four_array;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
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
			int min =i;
			for(int j=i+1;j<a.length;j++)
			{
				if (a[j]<a[min]) 
				{
				min =j;
				}
			}
			if (min!=i)
			{
				int temp = a[min];
				a[min]=a[i];
				a[i]=temp;
			}
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
