package com.pharmacies.services.consumed.rest.get;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.pharmacies.cofig.Config;
import com.pharmacies.services.consumed.rest.objects.LocalesRegionRS;

@Service
public class RegionShopsService {

	private static final Logger logger = LogManager.getLogger(RegionShopsService.class);
	
	@Autowired
	private Config config;

	public LocalesRegionRS[] getRegionShops(int regionId) {
		String getUrl =	config.propertiesRegionShops().getEndpoint();
		getUrl+="?"+config.propertiesRegionShops().getIdregion()+"="+regionId;
		HttpResponse response = null;
		HttpGet getMethod = new HttpGet(getUrl);		
		logger.info("getRegionShops URL: " + getUrl);
		LocalesRegionRS[] localesRegionArray = null;
		try (CloseableHttpClient client = HttpClientBuilder.create().build()) {
			response = client.execute(getMethod);
			String result = EntityUtils.toString(response.getEntity());
			Gson gson = new Gson();
			
			localesRegionArray = gson.fromJson(result, LocalesRegionRS[].class);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		logger.info("getRegionShops Response: " + localesRegionArray);

		return localesRegionArray;
	}
	
}
