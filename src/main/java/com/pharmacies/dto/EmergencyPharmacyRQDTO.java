package com.pharmacies.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EmergencyPharmacyRQDTO {

	@NotBlank(message="commune is a required field")
	@NotNull(message="commune can not be null")
	private String commune;
	
	@NotBlank(message="localName is a required field")
	@NotNull(message="commune can not be null")
	private String localName;
	
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
}
