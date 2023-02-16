import java.util.Scanner;
class  ex14
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner (System.in);
		System.out.println("Enter any Number:");
		int no =SC.nextInt(); 
		for( int i=no;i>1;i--){
		
			for(int j=0;j<(no-1);j++)
			{ System.out.println("");
			}
			for(int j=i;j>=1;j--){System.out.print("*");}	
						
			}
			
		
	}
}
