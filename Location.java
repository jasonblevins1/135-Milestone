
public class Location {
	
	int LocationId;
	private String streetName;
	int streetNumber;
	private String city;
	private String state;
	
	
	public Location(int streetNumber, String streetName, String city, String state, int LocationId) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.LocationId = LocationId;
		
	}

	@Override
	public String toString() {
		return "Location [Street Number:" + streetNumber + "Street Name: " + streetName + ", City: " + city + ", State: " + state + ", Location Id: " + LocationId + "]";
	}

}
