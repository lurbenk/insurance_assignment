package sk.assignment.insurance.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="contract")
public class Contract {
	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	private Date created;
	@NotNull
	@Enumerated(EnumType.STRING)
	private ContractType contractType;
	//Travel variables
	private Date travelInsuredFrom;
	private Date travelInsuredTo;
	Boolean liabilityforDamageInsured;
	Boolean injuryInsured;
	//Property variables
	@Enumerated(EnumType.STRING)
	private PropertyType propertyType;
	@OneToOne(cascade = {CascadeType.ALL})
	private Address propertyAddress;
	private Double propertyValue;
	
	protected Contract() {
		
	}

	public Contract(Integer id, Date created, ContractType contractType, Date travelInsuredFrom, Date travelInsuredTo,
			Boolean liabilityforDamageInsured, Boolean injuryInsured, PropertyType propertyType,
			Address propertyAddress, Double propertyValue) {
		super();
		this.id = id;
		this.created = created;
		this.contractType = contractType;
		this.travelInsuredFrom = travelInsuredFrom;
		this.travelInsuredTo = travelInsuredTo;
		this.liabilityforDamageInsured = liabilityforDamageInsured;
		this.injuryInsured = injuryInsured;
		this.propertyType = propertyType;
		this.propertyAddress = propertyAddress;
		this.propertyValue = propertyValue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public ContractType getContractType() {
		return contractType;
	}

	public void setContractType(ContractType contractType) {
		this.contractType = contractType;
	}

	public Date getTravelInsuredFrom() {
		return travelInsuredFrom;
	}

	public void setTravelInsuredFrom(Date travelInsuredFrom) {
		this.travelInsuredFrom = travelInsuredFrom;
	}

	public Date getTravelInsuredTo() {
		return travelInsuredTo;
	}

	public void setTravelInsuredTo(Date travelInsuredTo) {
		this.travelInsuredTo = travelInsuredTo;
	}

	public Boolean getLiabilityforDamageInsured() {
		return liabilityforDamageInsured;
	}

	public void setLiabilityforDamageInsured(Boolean liabilityforDamageInsured) {
		this.liabilityforDamageInsured = liabilityforDamageInsured;
	}

	public Boolean getInjuryInsured() {
		return injuryInsured;
	}

	public void setInjuryInsured(Boolean injuryInsured) {
		this.injuryInsured = injuryInsured;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public Address getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(Address propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public Double getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(Double propertyValue) {
		this.propertyValue = propertyValue;
	}
	
}
