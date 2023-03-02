//This class determine a factory with employees.
class Factory { //A Factory object represents a factory with employees
	private String name; //represents the name of the factory.
	private Employee[] employees; //employees represents employees working for the factory.
	private Storage storage;//storage represents the storage area of the factory.
	private Payroll[] payrolls; //payrolls represents the payrolls belonging to the employees.
	private double itemPrice; //itemPrice represents the price for one item (Suppose that all items have the same price).
	
	public Factory(String name,int capacity,double itemPrice) { //To initialize a newly created object of that type, compose constructor.
		Storage objectOfStorage = new Storage(capacity);
		this.storage = objectOfStorage;	
		this.name=name;
		this.itemPrice= itemPrice;
	}
	//Compose the getter and setter method used to read and write access to an object's properties.
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	public Payroll[] getPayrolls() {
		return payrolls;
	}
	public void setPayrolls(Payroll[] payrolls) {
		this.payrolls = payrolls;
	}

	public double getRevenue() {//Return the revenue according to the number of items in the storagedata field and itemPrice data field.
		double revenue= 0;
		if(storage.getItems()==null) {
			return revenue;
		}
		for(int i= 0;i<storage.getItems().length;i++) {
			revenue = itemPrice * storage.getItems()[i].numberOfItems;
		}
		return revenue;	
	}

	public double getPaidSalaries() { //Calculates the paid salaries of the employees according to the payrolls array.
		double salaries =0;;
		for(int i= 0;i<payrolls.length;i++) {
			salaries += payrolls[i].calculateSalary(); 
		}
		return salaries;
	}
	
	public void addEmployee(Employee employee) {//Add an employee to the employees array 
		for(int i=0; i<employee.getItems().length;i++) {
			storage.addItem(employee.getItems()[i]);
		}
		addPayroll(new Payroll(employee.getWorkHour(), employee.getItems().length));
		int size;
		if (getEmployees()==null) {
			size = 0;
		} else {
			size = getEmployees().length;
		}
		
		Employee[] newEmployees = new Employee[size+1];
		if(getEmployees()!=null) {
			System.arraycopy(getEmployees(), 0, newEmployees, 0, size);
		}
		newEmployees[newEmployees.length-1] = employee;
		this.setEmployees(newEmployees);	
	}
	
	public Employee removeEmployee(int id) { //Remove the employee from employees array
		if (getEmployees()==null) {
			System.out.println("There are no employees!");	
			return null;
		}
		else if (getEmployees().length==0 ) {
			System.out.println("Employee does not exist!");
			return null;
		}
		else 
			for(int i=0; i<getEmployees().length;i++) {
				if (id == getEmployees()[i].getId()) {
					Employee[] newEmployees= new Employee[getEmployees().length-1];
					Employee removedEmployee= getEmployees()[i];
				
					for(int a=0; a<i; i++) {
						newEmployees[a] = getEmployees()[a];
					}
					for(int a=i+1; a<getEmployees().length; a++) {
						newEmployees[a-1] = getEmployees()[a];
					}
					setEmployees(newEmployees);
					return removedEmployee;
				} 
			}
		
		System.out.println("Employee does not exist!");
		return null;
	}
	private void addPayroll(Payroll payroll) { //Add the payroll passed as the parameter to the payrolls data field
		int size;
		 if(getPayrolls() == null ) 
			size = 0;
		else
			size = getPayrolls().length;
		Payroll[] newPayrolls= new Payroll[size +1];
		if(getPayrolls() != null) {
			System.arraycopy(getPayrolls(), 0, newPayrolls, 0, size);
		}
		newPayrolls[newPayrolls.length - 1] =payroll;
		setPayrolls(newPayrolls);	
	}
}