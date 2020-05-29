package com.pharmacies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacies.cofig.Config;
import com.pharmacies.dto.EmergencyPharmacyRQDTO;
import com.pharmacies.dto.EmergencyPharmacyRSDTO;
import com.pharmacies.services.consumed.rest.get.RegionShopsService;
import com.pharmacies.services.consumed.rest.objects.LocalesRegionRS;

@Service
public class EmergencyPharmaciesSvc {

    @Autowired
	RegionShopsService regionShopsService;
    
    @Autowired
	private Config config;
    
	public java.util.List<EmergencyPharmacyRSDTO> getEmergencyPharmacies(EmergencyPharmacyRQDTO emergencyPharmacyRQDTO) {
		
		LocalesRegionRS[] localesRegionArray = regionShopsService.getRegionShops(config.propertiesRegionShops().getIdregionvalue());
		java.util.List<EmergencyPharmacyRSDTO> emergencyPharmacyList = new java.util.ArrayList<EmergencyPharmacyRSDTO>();
		
		if (emergencyPharmacyList != null) {
			for (LocalesRegionRS localesRegionRS : localesRegionArray) {
				if (localesRegionRS.getComunaNombre().equalsIgnoreCase(emergencyPharmacyRQDTO.getCommune()) && localesRegionRS.getLocalNombre().equalsIgnoreCase(emergencyPharmacyRQDTO.getLocalName())) {
					EmergencyPharmacyRSDTO emergencyPharmacyRSDTO = new EmergencyPharmacyRSDTO();
					emergencyPharmacyRSDTO.setLocalNombre(localesRegionRS.getLocalNombre());
					emergencyPharmacyRSDTO.setLocalDireccion(localesRegionRS.getLocalDireccion());
					emergencyPharmacyRSDTO.setLocalTelefono(localesRegionRS.getLocalTelefono());
					emergencyPharmacyRSDTO.setLocalLng(localesRegionRS.getLocalLng());
					emergencyPharmacyRSDTO.setLocalLat(localesRegionRS.getLocalLat());
					emergencyPharmacyList.add(emergencyPharmacyRSDTO);
				}
			}
		}
		
		return emergencyPharmacyList;
	}

}
