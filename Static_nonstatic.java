package Class_work;
import java.util.Scanner;

class SUBRACT 
{                                                           // non-static method
    public int sub(int a, int b)
    {
        return a - b;
    }
}



class DIVISION 
    {                                                       // static method
    public static int div(int a, int b)
    {
        return a / b;
    }
    
    
}
public class Static_nonstatic {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		   System.out.println("HI please tell us the 1st no!");
		        int n = sc.nextInt();
		        System.out.println("now enter the second no!");
		        int m = sc.nextInt();
		        
		        SUBRACT g = new SUBRACT();
		        int s = g.sub(n, m);                       // call the non-static method.
		 
		        System.out.print("subraction  is = " + s);
		        
		        int d = DIVISION.div(n, m);                //call of static method.
		        
		        System.out.print("division  is = " + d);

		    }

}
