///WAP to find greater int num. among three given numbers 
import java.util.Scanner;

class ex5
 {

public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter any 3 Numbers :");
    int a= sc.nextInt();
   int b= sc.nextInt();
   int c= sc.nextInt();
    if(a<b||c<b){
   System.out.println("Greatest Number :"+ b);
  }
else if(a<c||b<c){
   System.out.println("Greatest Number :"+ c);
  }
else if(b<a||c<a){
   System.out.println("Greatest Number :"+ a);
  }

  else{
  System.out.println("Invalid");}

  }
}