
public class PersonContact extends BaseContact{
	
	private String dob;
	private String description;
	private Photo photo;
	private Location location;
	
	public PersonContact(String name, String dob, String phone, String description, int contactID) {
		super(contactID, description, description);
		this.dob = dob;
		this.description = description;
		photo = new Photo("File Name", "6/21/2021", "this is a photo", 12);
		location = new Location(1234,"Street", "City", "State", 15);
	}

	@Override
	public String toString() {
		return "Person Contact [Name:" + getName() + "Date of Birth: " + dob + "Phone Number:" + getPhone() +", Description: " + description + "]";
	}

}
