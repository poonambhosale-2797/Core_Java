import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int i=2;
		boolean flag=false;
		while(i<=a/2)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
			++i;
		}
		
			
		
		if(!flag)
			
		System.out.println(a + "is a prime number:");
		else
			System.out.println(a + "is  not a prime number:");
	}
}