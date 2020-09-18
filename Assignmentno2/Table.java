import java.util.Scanner;
class Table{
public static void main(String args[]){
System.out.println("Enter any no. which you want to table of that no.");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=1;i<=10;i++){
System.out.println(a+"*"+i+"="+a*i);
}
}
}