
public class Photo {
	
	int PhotoId;
	private String fileName;
	private String dop;
	private String description;
	
	
	public Photo(String fileName, String dop, String description, int PhotoId) {
		super();
		this.fileName = fileName;
		this.dop = dop;
		this.PhotoId = PhotoId;
		this.description = description;
		
	}

	@Override
	public String toString() {
		return "Photo [File Name: " + fileName + ", Date of Photo: " + dop + ", Description: " + description + ", Photo Id: " + PhotoId + "]";
	}


}
