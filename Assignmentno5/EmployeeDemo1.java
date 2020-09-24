class Person{
	void getDetail(){
			System.out.println("Person Detail");
	}
		void getJob(){
				System.out.println("Person job");
	}
	}
	class Employee extends Person{
		void getJob(){
				System.out.println("Employee Job");
	}
		void getDept(){
				System.out.println("Employee Dept");
	}
	}
	class EmployeeDemo1{
		public static void main(String args[]){
		Person ar[]={new Employee(),new Employee()}
		for(Person a:ar){
			Employee e=(Employee)a;
			e.getDept();
			}
		}
	}