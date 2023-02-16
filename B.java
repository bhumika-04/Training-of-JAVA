import java.util.Scanner;
import pack.A;
public class B{
 public static void main(String args[])
{   A obj=new A();
Scanner sc = new Scanner(System.in);
  
System.out.println("Enter two Numbers:");
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("Greatest Number is :"+obj.getData(a,b));
}
}