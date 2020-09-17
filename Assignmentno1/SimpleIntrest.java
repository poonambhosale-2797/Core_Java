import java.util.Scanner;
class SimpleIntrest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Simple intrest");
		
		int principle =sc.nextInt();
		int rate=sc.nextInt();
		int time =sc.nextInt();
		System.out.println("simple intrest is"+ principle*rate*time);
	}
}