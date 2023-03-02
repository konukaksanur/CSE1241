//This class determine a storage area for the factory.
public class Storage {
	private int capacity; //capacity keeps the capacity (the maximum number of items that can be stored) of the Storage object created.
	private Item[] Items; //items array keeps the items put inside the storage.
	
	public Storage(int capacity) {//To initialize a newly created object of that type, compose constructor.
		this.capacity = capacity;		
	}
	//Compose the getter and setter method used to read and write access to an object's properties.
	public Item[] getItems() {
		return Items;
	}
	public void setItems(Item[] items) {
		Items = items;
	}
	//Add the item passed as the parameter to the items data field
	public void addItem (Item item) {
		int size ;
		if(getItems()== null) {
			size =0;
		}
		else {
			size = getItems().length;	
		}
		Item[] newItems = new Item[size + 1];
		if(getItems()!= null)
			System.arraycopy(getItems(), 0, newItems, 0, size);
		newItems[newItems.length-1] = item;
		setItems(newItems);
	}
}