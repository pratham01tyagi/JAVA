package one_using_scanner_and_with_basics;
import java.util.Scanner;
public class Code1 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("what is the base length ?");
		int x = sc.nextInt();//here x is base of cone.
		System.out.println("what is the height of cone ?");
	   int y = sc.nextInt(); //here y is height of cone.
	   float volume = (float)0.5*x*y;
	   System.out.println("volume of cone is "+ volume);
	}

}
