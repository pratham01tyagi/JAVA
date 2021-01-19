package one_using_scanner_and_with_basics;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int principle = sc.nextInt();
		float rate=sc.nextFloat();
		int time= sc.nextInt();
		float SimpleIntrest = rate*principle*time/100;
		System.out.println("the simple intrest that came is = "+SimpleIntrest);
	}

}
