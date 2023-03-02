//This class determine each item's id and total number of an produced item.
class Item {
	private int id; //id keeps the id of the Item object created.
	public static int numberOfItems;// NumberOfItems keeps the number of item objects created.
		
	public Item(int id) {//To initialize a newly created object of that type, compose constructor.
		this.id=id;
		this.numberOfItems=numberOfItems;
		numberOfItems++; //To calculate the total number,while item is produced,we increase this variable.
	} 
	//Compose the getter and setter method used to read and write access to an object's properties.
	public int getId() {//Compose the getter and setter method used to read and write access to an object's properties.
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getNumberOfItems() {
		return numberOfItems;
	}
	public static void setNumberOfItems(int numberOfItems) {
			Item.numberOfItems = numberOfItems;
	}
		
}