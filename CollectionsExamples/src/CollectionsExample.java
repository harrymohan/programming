import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class CollectionsExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an arraylist
		ArrayList<Employee> empList = new ArrayList<Employee>();
		//make an object
		empList.add(new Employee("Harmohan",5500));
		empList.add(new Employee("Chen Hui",12500));
		empList.add(new Employee("April Lin",2400));
		Collections.sort(empList, new MySalaryComp());
		for(Employee e:empList){
            System.out.println(e);
        }
	}


}
