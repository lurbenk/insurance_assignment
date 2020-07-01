package sk.assignment.insurance.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String email;
	@NotNull
	private String birthNumber;
	@NotNull
	@OneToOne(cascade = {CascadeType.ALL})
	private Address permanentResidenceAddress;
	@OneToOne(cascade = {CascadeType.ALL})
	private Address mailingAddress;
	@NotNull
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Contract> contracts;
	
	protected User() {
		
	}
	
	public User(Integer id, String firstName, String lastName, String email, String birthNumber,
			Address permanentResidenceAddress, Address mailingAddress, List<Contract> contracts) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthNumber = birthNumber;
		this.permanentResidenceAddress = permanentResidenceAddress;
		this.mailingAddress = mailingAddress;
		this.contracts = contracts;
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

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}
	
}
