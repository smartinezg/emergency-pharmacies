package com.pharmacies.services.exposed.rest.post;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pharmacies.dto.EmergencyPharmacyRQDTO;
import com.pharmacies.dto.EmergencyPharmacyRSDTO;
import com.pharmacies.services.EmergencyPharmaciesSvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmergencyPharmaciesSvcTest {
 
	private static Logger logger = LogManager.getLogger(EmergencyPharmaciesSvcTest.class);

	@Autowired
	EmergencyPharmaciesSvc emergencyPharmaciesSvc;
	
    @Test
    public void getEmergencyPharmaciesServiceTest() {
    	EmergencyPharmacyRQDTO emergencyPharmacyRQDTO = new EmergencyPharmacyRQDTO();
    	emergencyPharmacyRQDTO.setCommune("PROVIDENCIA");
    	emergencyPharmacyRQDTO.setLocalName("CRUZ VERDE");
    	java.util.List<EmergencyPharmacyRSDTO> emergencyPharmacyList = emergencyPharmaciesSvc.getEmergencyPharmacies(emergencyPharmacyRQDTO);
    	logger.info(emergencyPharmacyList);
 
    }
}