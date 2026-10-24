package contactapp;

public class Contact {
	
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstName,
            String lastName, String phone, String address) {

 if (contactId == null || contactId.isBlank() || contactId.length() > 10) {
     throw new IllegalArgumentException("Invalid contact ID");
 }

 validateName(firstName, "First name");
 validateName(lastName, "Last name");
 validatePhone(phone);
 validateAddress(address);

 this.contactId = contactId;
 this.firstName = firstName;
 this.lastName = lastName;
 this.phone = phone;
 this.address = address;
}
	
	private void validateName(String name, String fieldName) {
	    if (name == null || name.isBlank() || name.length() > 10) {
	        throw new IllegalArgumentException(fieldName + " is invalid");
	    }
	}

	private void validatePhone(String phone) {
	    if (phone == null || !phone.matches("[0-9]{10}")) {
	        throw new IllegalArgumentException("Phone must contain 10 digits");
	    }
	}

	private void validateAddress(String address) {
	    if (address == null || address.isBlank() || address.length() > 30) {
	        throw new IllegalArgumentException("Address is invalid");
	    }
	}
	
	public String getContactId() {
	    return contactId;
	}

	public String getFirstName() {
	    return firstName;
	}

	public String getLastName() {
	    return lastName;
	}

	public String getPhone() {
	    return phone;
	}

	public String getAddress() {
	    return address;
	}
	
	public void setFirstName(String firstName) {
	    validateName(firstName, "First name");
	    this.firstName = firstName;
	}

	public void setLastName(String lastName) {
	    validateName(lastName, "Last name");
	    this.lastName = lastName;
	}

	public void setPhone(String phone) {
	    validatePhone(phone);
	    this.phone = phone;
	}

	public void setAddress(String address) {
	    validateAddress(address);
	    this.address = address;
	}
}
