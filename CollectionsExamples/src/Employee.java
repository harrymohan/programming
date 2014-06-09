
public class Employee {
	 private String name;
	 private  int salary;
	 
	public Employee(String inName,int inSal){
		this.name = inName;
		this.salary = inSal;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	
	public int getSalary()
	{
		return salary;
	}
   
	
	public String toString()
	{
		return "Name: "+this.name+" Salary: "+this.salary;
	}
}
