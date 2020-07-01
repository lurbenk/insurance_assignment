package sk.assignment.insurance.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	private String postalCode;
	@NotNull
	private String town;
	@NotNull
	private String street;
	@NotNull
	private Integer number;
	
	protected Address() {
		
	}
	
	public Address(String postalCode, String town, String street, Integer number) {
		super();
		this.postalCode = postalCode;
		this.town = town;
		this.street = street;
		this.number = number;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
