package com.pharmacies.services.exposed.rest.post;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.pharmacies.dto.EmergencyPharmacyRQDTO;
import com.pharmacies.dto.EmergencyPharmacyRSDTO;
import com.pharmacies.services.EmergencyPharmaciesSvc;

@RestController
public class EmergencyPharmaciesService {
	
	@Autowired
	EmergencyPharmaciesSvc emergencyPharmaciesSvc;

	@RequestMapping(value="/emergencyPharmacies", method=RequestMethod.POST)
	@PostMapping(produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<java.util.List<EmergencyPharmacyRSDTO>> getEmergencyPharmacies(@Valid @RequestBody EmergencyPharmacyRQDTO emergencyPharmacyRQ){
		java.util.List<EmergencyPharmacyRSDTO> emergencyPharmaciesList = new java.util.ArrayList<EmergencyPharmacyRSDTO>();
		
		try {
			emergencyPharmaciesList = emergencyPharmaciesSvc.getEmergencyPharmacies(emergencyPharmacyRQ);
		} catch (Exception e) {
			return new ResponseEntity<java.util.List<EmergencyPharmacyRSDTO>>(emergencyPharmaciesList, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if (emergencyPharmaciesList.isEmpty())
			return new ResponseEntity<java.util.List<EmergencyPharmacyRSDTO>>(emergencyPharmaciesList, HttpStatus.NOT_FOUND);

		return new ResponseEntity<java.util.List<EmergencyPharmacyRSDTO>>(emergencyPharmaciesList, HttpStatus.OK);
		
	}
}
