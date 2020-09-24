class Employee4{
	private int empid;
	private String empName;
	Employee4(int empid,String empName){
		this.empid=empid;
		this.empName=empName;
	}
	void show(){
		System.out.println(empid+" "+empName);
	}
}
class EmployeeDemo4{
	public static void main(String args[]){
		Employee e= new Employee();
		e.set(101,"poonam");
		e.show();
	}
}