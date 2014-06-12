import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;

public class EmpComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Harmohan",12345,5600));
		empList.add(new Employee("Ganesh",38497,9700));
		empList.add(new Employee("Helen",26782,12000));
		empList.add(new Employee("Gaurav",93833,8900));
		empList.add(new Employee("April",3233,2400));
		//Collections.sort(empList,new EmployeeSalaryComparator());
		Collections.sort(empList, new EmployeeNameComparator());
		//display employee
		for(Employee emp:empList)
		{
			System.out.println(emp);
		}
	}

}
