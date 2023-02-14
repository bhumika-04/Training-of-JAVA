import java.util.Scanner;

class ex3
 {

public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Number");
    int a= sc.nextInt();
    if(a%2==0){
   System.out.println("Number is Even");
  }
  else{
  System.out.println("Number is Odd");}

  }
}