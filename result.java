import java.util.Scanner;
 class student
 {    Scanner s = new Scanner(System.in);
	public int roll_number;
	public String name;
         void getData()
{
	System.out.println("Enter Name and Roll Number:");
	name= s.nextLine();
	roll_number= s.nextInt();
}
        void showData()
	{
		System.out.println("Name:"+name);
			System.out.println("Roll Number:"+roll_number);
	}
}
 class exam extends student
{	
	public void getMarks()
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Marks of 6 Subject:");
	int a= sc.nextInt();
	int b= sc.nextInt();
	int c= sc.nextInt();
	int d= sc.nextInt();
	int e= sc.nextInt();
	int f= sc.nextInt();
	int total=a+b+c+d+e+f;
	 System.out.println("Total Marks is :"+total);
	}
   
}
class result extends  exam
{ 	

public static void main(String[] args) 
  {
	 result obj = new result();
	obj.getData();
	obj.getMarks();
	
   
}
  }
