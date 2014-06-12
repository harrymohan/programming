
public class Employee {

	private String name;
	private int deptNo;
	private int salary;
	public Employee(String EmpName, int EmpDeptNo, int EmpSal)
	{
		this.name = EmpName;
		this.deptNo = EmpDeptNo;
		this.salary = EmpSal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Employee Name: "+name+" Dept No.: "+deptNo+" Salary: "+salary;
	}
}
