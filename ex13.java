import java.util.Scanner;
class  ex13
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner (System.in);
		System.out.println("Enter any Number:");
		int no =SC.nextInt(); 
		for( int i=1;i<=no;i++)
		{ for(int j=1;j<=no;j++)
			{ if(i<=j){	System.out.print("*");	}			
			} 
		System.out.println("");	
		}
	}
}
