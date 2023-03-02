//This class determine each employee's payrolls.
public class Payroll {
	private int workHour; //workHour keeps the number of hours an employee has worked
	private int itemCount; //itemCount keeps the number of items an employee has produced
	
	public Payroll(int workHour, int itemCount) {
		this.workHour=workHour;
		this.itemCount=itemCount;
	}
	//Compose the getter method used to read access to an object's properties.
	public int getWorkHour() {
		return workHour;
	}

	public int getItemCount() {
		return itemCount;
	}
	public int calculateSalary() { //Calculate the salary of each employee, according to the number of hours an employee has worked and the number of items s/he produced.
		int salary= workHour*3+itemCount*2;
		return salary;
	}
	public String toString() {// Return a String containing information about the work hour and the item count of the payroll.
		return "The work hour is " + workHour+ " and the produced item count is "+ itemCount+ ".";
	}
}
