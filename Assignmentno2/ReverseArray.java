import java.util.Scanner;
class ReverseArray{
	public static void main(String args[]){
		int counter,i=0,j=0,temp;
		int number[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element you wantto enter:");
		counter=sc.nextInt();
		for(i=0;i<counter;i++){
			System.out.println("Enter array element" + (i+1)+": ");
			number[i]=sc.nextInt();
		}
		j=i-1;
		i=0;
		sc.close();
		while(i<j)
		{
			temp=number[i];
			number[i]=number[j];
			number[j]=temp;
			i++;
			j--;
		}
		System.out.println("Reverse array");
		for(i=0;i<counter;i++)
		{
			System.out.println(number[i]+ " ");
		}
	}
}
		