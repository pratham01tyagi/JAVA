package two_operatorsUse;

public class ArthmeticOperator {

	public static void main(String[] args) {
	

		int a =10 ;
		int b= 20;
		int c = a+b;
		int d = a-b;
		int e= a/b;
		int f=b/a;
		int g=a*b;
		int h= a%b; //this is MODULE OPERATOR which gives the remainder as result.
		int i = ++a;//here this is incrementing in a and then printing if we would have writen a++ then incrementation would have been done later and i value would be assigned 10 not 11.
		int j = b--;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
	}

}
// here also bodmas rule is followed.