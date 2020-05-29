package com.pharmacies.services.consumer.rest.get;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pharmacies.services.consumed.rest.get.RegionShopsService;
import com.pharmacies.services.consumed.rest.objects.LocalesRegionRS;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegionShopsServiceTest {
 
	private static Logger logger = LogManager.getLogger(RegionShopsServiceTest.class);

    @Autowired
	RegionShopsService regionShopsService;
 
    @Test
    public void regionShopsServiceTest() {
    	LocalesRegionRS[] localesRegionArray = regionShopsService.getRegionShops(7);
    	logger.info(localesRegionArray);
 
    }
}