import java.util.Scanner;
public class ex15 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array :: ");
      int size = sc.nextInt();
      String Array[] = new String[size];
      System.out.println("Enter elements of the array (Strings) :: ");
      for(int i=0; i<size; i++) {
         Array[i] = sc.next();
      }
  
      System.out.println("Enter Element to search");
     int n= sc.nextInt();
   int flag=0;
 for(int i=0;i<size;i++){
   if(n==Array[i]){
 flag=1;
break;
}
}
   if(flag==1){
 
      System.out.println("Element is :");}   
 else{

      System.out.println("Element is not Found");}   }
}