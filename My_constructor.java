package eight_constructor;


class wehicles
{
	int wheller;
	wehicles()// this is called default constructor which we have modified.
	{
		wheller=4;  //this is the new method // here we only once describe the no of wheels and could call it for n no of times.
	}
}


class wahan
{
	int tyre;
	wahan(int no_of_tyre)// this is called default constructor which we have modified.
	{
	
		tyre = no_of_tyre;  //this is the new method // here we only once describe the no of wheels and could call it for n no of times.
	System.out.println("no of tyre in wahan are"+no_of_tyre);
	}
}




public class My_constructor 
{
	
	
	
My_constructor()    // making a constructor in a class.
{                    //this is a no argument constructor a s it is not taking any argument in it.
System.out.println("SY HI !");	
}
	


	public static void main(String[] args) 
	{
		
		
		
		
		//calling a constructor by making a object obj.
	My_constructor obj	=new My_constructor();
	//the above statment could also be written as given below only diff is that here object name is not obj.
	new My_constructor();
	
	
	//for Default constructor--------------------------------------> wehicle////////////////////////////
	wehicles car =new wehicles();
	//car.wheller=4;    //this was old method now we will pass the value in constructore only.
	//here the problem was that if we were making 100 cars and then we have to initialise 100 car.wheller value to 4. 
	System.out.println(car.wheller+"wheels");
	
	
// for parameterised constructor------------------------------------------>wahan///////////////////////
	wahan gadi =new wahan(4);
	wahan bike =new wahan(2);
	System.out.println(gadi.tyre+"wheelsof car");
	System.out.println(bike.tyre+"wheelsof bike");
	
	//NOTE-->those things which are diff.for diff. ob. should be parameterised only.
	}

}
