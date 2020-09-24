class Person{
	Person(){
			System.out.println("no-arg Person");
	}
			Person(int i){
				System.out.println("Param Person");
	}
	}
	class Employee extends Person{
		Employee(){
			System.out.println("no-arg Person");
		}
		Employee(int i){
				System.out.println("Param Person");
	}
	}
	class EmployeeDemo{
		public static void main(String args[]){
			Employee e=new Employee();
			Employee e1=new Employee(12);
		}
	}