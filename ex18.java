//WAP to illustrate the concept of Method Overloading
import java.util.Scanner;

 class ex18
  {
     public void f1(int x, int y)
	{
	    System.out.println("Sum of two Number is :"+(x+y));
	}

	
	public void f1(String a, String b)
	{
	    System.out.println("Sum of String is :"+(a+b));
	}

	   public static void main(String[] args) 
     {  ex18 obj = new ex18();
	obj.f1(321,654);
	obj.f1("Bhu","mika");
	}
}