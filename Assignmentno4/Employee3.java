class Employee3{
	private int empNo;
	private float salary;
	private float totalsalary;
	Employee3(int empNo,float salary,float totalsalary){
		this.empNo=empNo;
		this.salary=salary;
		this.totalsalary=totalsalary;
}
Employee3(int empid){
	 empid++;
 }
 Employee3(float total)
   {
      total = totalsalary+ total;
   }
   void display(){
		System.out.println(empNo+"   "+salary+" "+totalsalary);
	}
   
}
class EmployeeDemo3{
public static void main(String args[]){
	Employee3 e=new Employee3(101,5000.5f,6006.4f);
	e.display();
}


}
