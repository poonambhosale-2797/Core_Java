import java.util.Scanner;

class SumandAverageArray{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int ar[]=new int[10];

		int sum=0;

        for(int i=0;i<ar.length;i++){

			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		
		System.out.println("Sum = "+sum);

        
    }
}
			
		