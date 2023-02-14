//WAP to make simple calculator for the arthmatic op like add, sub,mul,div using switch statement

import java.util.Scanner;

 class ArithmaticOperations
{
     public void add(int a,int b)
  {
    int sum=a+b;
  System.out.println("Addition is :"+sum);
  }
   public void sub(int a,int b)
  {
    int sub=a-b;
  System.out.println("Subtraction is :"+sub);
  }
   public void mul(int a,int b)
  {
    int mul=a*b;
  System.out.println("Multiplication is :"+mul);
  }
   public void div(int a,int b)
  {
    int div=a%b;
  System.out.println("Division is :"+div);
  }

 }

class ex6
 {

public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter any 2 Numbers :");
    int a= sc.nextInt();
    int b= sc.nextInt();

  ArithmaticOperations obj = new ArithmaticOperations();

  
System.out.println("Enter 1 to Add  ");
System.out.println("Enter 2 to Sub ");
System.out.println("Enter 3 to Mul ");
System.out.println("Enter 4 to Div ");
int n=sc.nextInt();

  switch(n)
{
case 1:obj.add( a,b);
     break;
case 2:obj.sub(a,b);
    break;
case 3:obj.mul(a,b);
    break;
case 4:obj.div(a,b);
  break;
default:
System.out.println("Invalid Choice");
}
  }
}