import java.util.Scanner;
class AvgofSub{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Subject Marks:");


int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

int d=sc.nextInt();


int e=sc.nextInt();
System.out.println("Average of Subject is"+ ((a+b+c+d+e)/5) +"%");

}
}