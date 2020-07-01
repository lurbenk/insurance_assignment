package sk.assignment.insurance.model;

public class UserWithoutContracts {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String birthNumber;
	private Address permanentResidenceAddress;
	private Address mailingAddress;
	
	protected UserWithoutContracts() {
		
	}
	
	public UserWithoutContracts(Integer id, String firstName, String lastName, String email, String birthNumber,
			Address permanentResidenceAddress, Address mailingAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthNumber = birthNumber;
		this.permanentResidenceAddress = permanentResidenceAddress;
		this.mailingAddress = mailingAddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthNumber() {
		return birthNumber;
	}

	public void setBirthNumber(String birthNumber) {
		this.birthNumber = birthNumber;
	}

	public Address getPermanentResidenceAddress() {
		return permanentResidenceAddress;
	}

	public void setPermanentResidenceAddress(Address permanentResidenceAddress) {
		this.permanentResidenceAddress = permanentResidenceAddress;
	}

	public Address getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	
}

