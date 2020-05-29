package com.pharmacies.cofig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

	@Bean
	@ConfigurationProperties(prefix="getregionshops")
	public RegionShopsConfig propertiesRegionShops() {
		return new RegionShopsConfig();
	}

	@Bean
	@ConfigurationProperties(prefix="communesperregion")
	public CommunesPerRegionConfig propertiesCommunesPerRegion() {
		return new CommunesPerRegionConfig();
	}
	
}
