 class MathOperation1{
 static void sum(int i,int j){
	 int k=i*j;
	 System.out.println(k);
 }
 static void sum(float i,float j,float k){
	 float l=i*j*k;
	 System.out.println(l);
 }
 static void sum1(double i,int j){
	 double k=i*j;
	 System.out.println(k);
 }
 }
 class MathOperationDemo1{
	 public static void main(String args[]){
		 MathOperation1.sum(2,3);
		  MathOperation1.sum(2.35f,12.33f,45.25f);
		   MathOperation1.sum1(2.5d,3);
	 }
 }