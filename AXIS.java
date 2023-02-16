import java.util.Scanner;

class Bank
 {
	float getRateOfInterest()
	{  
	 return (7.7f);
	}

}

 class SBI extends Bank
{
	float getRateOfInterest()
	{  
	return (8.4f);
	}
}

 class ICICI extends Bank
{
	float getRateOfInterest()
	{ 
	return (7.3f);
	}
}

 class AXIS extends Bank
{
	float getRateOfInterest()
	{
	 return (9.7f);
	}
	
	public static void main(String[] args) 
  {

                 Bank obj = new SBI();
	obj.getRateOfInterest();
	System.out.println("Rate of SBI is :"+obj.getRateOfInterest()+" %");

	Bank obj1 = new ICICI();
	obj1.getRateOfInterest();
	System.out.println("Rate of ICICI is :"+obj1.getRateOfInterest()+" %");

	Bank obj2 = new AXIS();
	obj2.getRateOfInterest();
	System.out.println("Rate of AXIS is :"+obj2.getRateOfInterest()+" %");

  }
}