//This class determine an employee working for factory.
class Employee {
	private int id; //id keeps the id number of the Employee object created
	private String name; //name and surname keeps the name and the surname of the employee, respectively.
	private String surname;
	private int workHour;// workHour keeps the number of hours an employee will work
	private int speed; //speed keeps the number of items that the employee can produce in an hour.
	private Item[] items; //items array holds the items produced by the employee
	private Payroll payroll;
	
	public Employee(int id, String name, String surname, int workHour, int speed ) {////To initialize a newly created object of that type, compose constructor.
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.workHour=workHour;
		this.speed=speed;
		this.items= startShift();
		this.payroll= endShift();
	}
	//Compose the getter and setter method used to read and write access to an object's properties.
	public int getId() {
		return id;
	}
	//Compose the getter and setter method used to read and write access to an object's properties.
	public void setId(int id) {
		this.id = id;
	}
	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	
	public Item[] startShift () {//Find how many items this employee should produce according to speed and workHour values.
		Item[] items = new Item[speed* workHour];
		for(int i=0; i<items.length; i++) {
			items[i]= new Item((int)(Math.random()*100+1));
		}
		return items;
	}
	public Payroll endShift() {//create a Payroll object with employee�s work hour and the number of items s/he creates
		Payroll payroll = new Payroll(workHour,getItems().length );
		return payroll;	
	}
	public String toString() {//Returns a String with employee�s id and the return value of the payroll object�s toString() method
		return "This is the employee with id " +id+ " speed "+ speed+ ". "+ payroll.toString();
	}
}