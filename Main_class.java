package six_classes_and_obj;
import java.util.Scanner;
class vehicle
{
	
	static int price;
	static String company;
	static int wheeler; 
	public static void type()
	{
	System.out.println("this is a "+wheeler+" vehicle");	
	}
	public static void brand()
	{
		
		System.out.println("this is vehicle of "+company+" and its price is "+price);

	}
	

}

public class Main_class 
{

	public static void main(String[] args) 
	{
		 Scanner sc= new Scanner (System.in);
		vehicle car =new vehicle();
		System.out.println("please give the type,brand name and price to the vehicle");
		vehicle.wheeler=sc.nextInt();
		vehicle.type();
		vehicle.company=sc.nextLine();
		vehicle.price=sc.nextInt();
	    vehicle.brand();
		
		
	}

}
