
public class BaseContact {
	
	int contactId;
	private String name;
	private String phone;
	
	public BaseContact(int contactId, String phone, String name) {
		super();
		this.name = name;
		this.phone = phone;
		this.contactId = contactId;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "BaseContact [contactId=" + contactId + ", name=" + name + ", phone=" + phone + "]";
	}
}
