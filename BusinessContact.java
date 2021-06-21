
public class BusinessContact extends BaseContact{
	
	private String hours;
	private String url;
	
	public BusinessContact(String hours, String url) {
		super();
		this.hours = hours;
		this.url = url;
	}

	@Override
	public String toString() {
		return "Business Contact [Hours of Operation: " + hours + ", Website: " + url + "]";
	}

}
