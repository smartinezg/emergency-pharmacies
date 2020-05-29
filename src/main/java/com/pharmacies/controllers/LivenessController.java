package com.pharmacies.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacies.cofig.RegionShopsConfig;
import com.pharmacies.utils.StringUtils;

@RestController
public class LivenessController {

	  private static Logger logger = LogManager.getLogger(LivenessController.class);
	  
	  @Autowired
	  private RegionShopsConfig regionShopsConfig;
	  	  
	  /**
	   * Endpoint that return status ok.
	   * 
	   * @return ok
	   */
	  @GetMapping("/liveness")
	  public String liveness() {
	    return "ok";
	  }
	  
	  /**
	   * Endpoint for get properties used in project (in log)
	   * 
	   * @return String
	   */
	  @GetMapping("/checkProperties")
	  public String checkProperties() {
	    logger.info("regionShopsConfig {}" , StringUtils.objectToString(regionShopsConfig));
	    
	    return "ok";
	  }
}
