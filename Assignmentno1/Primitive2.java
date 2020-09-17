import java.util.Scanner;
class Primitive2{
public static void main(String args[]){
boolean x;
boolean y;
System.out.println("Enter value of x and y as a True and false");
Scanner sc=new Scanner(System.in);
x=sc.nextBoolean();
y=sc.nextBoolean();

boolean z= x && y || !(x || y);
System.out.println("value of  z is "+z);
}
}