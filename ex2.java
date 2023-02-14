// WAP in java to print Addition of three integer values (values must be given by the user)

import java.util.Scanner;

 class ex2
  {
     
    public static void main(String[] args) 
     { 
      
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any three numbers:");
      int a = sc.nextInt();
     int  b = sc.nextInt();
    int c = sc.nextInt();
     int x=a+b+c;
   System.out.println("Addition is:"+x);

     }
  }