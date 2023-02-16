//WAP to illustrate the concept of Method Overloading
import java.util.Scanner;

 class ex17
  {
     
    public void f1()
	{
	 System.out.println("Good Mornuing");
	}
	
	public void f1(int x, int y)
	{
	    System.out.println("Sum of two Number is :"+(x+y));
	}

	
	public void f1(int x, int y,int z)
	{
	    System.out.println("Sum of three Number is :"+(x+y+z));
	}

	
	public void f1(float x, float y,float z)
	{
	    System.out.println("Sum of three Number is :"+(x+y+z));
	}
      
        public static void main(String[] args) 
     {  
       Scanner sc = new Scanner(System.in);
    System.out.println("Enter any two numbers:");
      int a = sc.nextInt();
     int  b = sc.nextInt();
  
	System.out.println("Enter any three numbers:");
      int c = sc.nextInt();
     int  d= sc.nextInt();
    int e = sc.nextInt();

	System.out.println("Enter any three numbers:");
   float f = sc.nextFloat();
   float g= sc.nextFloat();
  float h = sc.nextFloat();

	ex17 obj = new ex17();
	obj.f1();
	obj.f1(a,b);
	obj.f1(c,d,e);
	obj.f1(f,g,h);
	

     }
  }