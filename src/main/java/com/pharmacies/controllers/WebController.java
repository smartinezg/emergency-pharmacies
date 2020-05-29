package com.pharmacies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import com.pharmacies.dto.EmergencyPharmacyRQDTO;
import com.pharmacies.dto.EmergencyPharmacyRSDTO;
import com.pharmacies.services.EmergencyPharmaciesSvc;

@RestController
@RequestMapping("/pharmacies")
public class WebController {

	@Autowired
	EmergencyPharmaciesSvc emergencyPharmaciesSvc;
	
	@ResponseStatus(value=HttpStatus.OK)
	@RequestMapping(value = "/getEmergencyPharmacies", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody java.util.List<EmergencyPharmacyRSDTO> processForm(@ModelAttribute("commune") String commune, @ModelAttribute("localName") String localName, Model model) {
		EmergencyPharmacyRQDTO emergencyPharmacyRQDTO = new EmergencyPharmacyRQDTO();
		emergencyPharmacyRQDTO.setCommune(commune);
		emergencyPharmacyRQDTO.setLocalName(localName);
		java.util.List<EmergencyPharmacyRSDTO> result = emergencyPharmaciesSvc.getEmergencyPharmacies(emergencyPharmacyRQDTO);
		model.addAttribute("pharmacies", result);
	    return result;
	}
}
