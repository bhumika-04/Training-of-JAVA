///WAP to find greater int num. among three given numbers (Nester)
import java.util.Scanner;

class ex4
 {

public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter any 3 Numbers :");
    int a= sc.nextInt();
   int b= sc.nextInt();
   int c= sc.nextInt();
    if(a>b)
   {
      if(a>c) 
    {
	System.out.println("Greatest Number :"+ a);
    }
    else
    {
       System.out.println("Greatest Number :"+ a);
    }
 }
 else if(b>a)
   {
      if(b>c) 
     {
	System.out.println("Greatest Number :"+ b);
     }
    else
     {
       System.out.println("Greatest Number :"+ b);
    }
}

  else if(c>a)
   {
      if(c>b) 
    {
	System.out.println("Greatest Number :"+ c);
    }
    else
    {
       System.out.println("Greatest Number :"+ c);
    }
}
  }
}