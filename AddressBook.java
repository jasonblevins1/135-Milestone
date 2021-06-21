import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	
	List<BaseContact> baseContact = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);
	
	public void open() {
		baseContact.add(new PersonContact(null, null, null, null, 0));
		baseContact.add(new PersonContact(null, null, null, null, 0));
		
		
		menu();
	}
	
	public void menu() {
		do {
			System.out.println("===============================");
			System.out.println("          MAIN MENU ");
			System.out.println("===============================");
			System.out.println(" 1. Add a Personal Contact (C)");	
			System.out.println(" 2. Add a Business Contact (C)");		
			System.out.println(" 3. List all Contacts (R)");				
			System.out.println(" 4. Update a Contact (U)");	
			System.out.println(" 5. Delete a Contact (D)");	
			System.out.println(" 6. Exit");		
			System.out.println("===============================");
			System.out.println("What options to perform? ");
			int option = scan.nextInt();
			scan.nextLine();

			switch (option) {
			case 1:
				addPersonContact();
				break;
				
			case 2:
				addBusinessContact();
				break;
				
			case 3:
				viewAllContacts(); 
				break;
				
			case 4:
				updateAContact();
				break;
				
			case 5:
				deleteAContact();
				break;
				
			case 6:
				System.out.println("Goodbye!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Please enter different option");
			}
		}while (true);
		
	}

	private void deleteAContact() {
		// TODO Auto-generated method stub
		System.out.println("Deleting Contact");
		
	}

	private void updateAContact() {
		// TODO Auto-generated method stub
		System.out.println("Updating Contacts");
	}

	private void viewAllContacts() {
		// TODO Auto-generated method stub
		System.out.println("Viewing Contacts");
	}

	private void addBusinessContact() {
		// TODO Auto-generated method stub
		System.out.println("Adding Business Contacts");
	}

	private void addPersonContact() {
		System.out.println("Adding Personal Contact");
	}
	
}
		


