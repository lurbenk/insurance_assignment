package sk.assignment.insurance.validation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import sk.assignment.insurance.model.Contract;
import sk.assignment.insurance.model.User;

@Component
public class ContractValidator {
	
	public Boolean validateUserRequest(User user) {
		List<Contract> contracts = new ArrayList<Contract>();
		for(Contract contract: user.getContracts()) {
			Boolean result = true;
			switch(contract.getContractType()) {
					case TRAVEL_CONTRACT : result = validateTravelContract(contract);
											break;
					case PROPERTY_CONTRACT: result = validatePropertyContract(contract);
											break;
					default: result = false;
							break;
			}
			if (!result) {
				return false;
			}
		}
		return true;
	}
	
	public Boolean validatePropertyContract(Contract contract) {
		Boolean result = true;
		if (contract.getPropertyAddress() == null) {
			result = false;
		}
		if (contract.getPropertyType() == null) {
			result = false;
		}
		if (contract.getPropertyValue() == null) {
			result = false;
		}
		return result;
	}
	
	public Boolean validateTravelContract(Contract contract) {
		Boolean result = true;
		if (contract.getTravelInsuredFrom() == null) {
			result = false;
		}
		if (contract.getTravelInsuredTo() == null) {
			result = false;
		}
		if (contract.getLiabilityforDamageInsured() == null) {
			result = false;
		}
		if (contract.getInjuryInsured() == null) {
			result = false;
		}
		return result;
	}
	

}
